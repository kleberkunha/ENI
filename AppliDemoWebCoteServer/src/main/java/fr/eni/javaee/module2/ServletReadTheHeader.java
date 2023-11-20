package fr.eni.javaee.module2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Servlet implementation class ServletReadTheHeader
 */
@WebServlet("/AppliDemoWebCoteServer/modules/module2/ServletReadTheHeader")
public class ServletReadTheHeader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuffer sb = new StringBuffer();
		
		String userAgent = request.getHeader("user-agent");
		sb.append("User-Agent : ").append(userAgent).append(System.lineSeparator());
		
		Enumeration<String> headerList = request.getHeaderNames();
		
		while(headerList.hasMoreElements()) {
			String head = headerList.nextElement();
			sb.append(head +" : ");
			
			Enumeration<String> values = request.getHeaders(head);
			while(values.hasMoreElements()) {
				sb.append(values.nextElement());
				if(values.hasMoreElements()) {
					sb.append(", ");
				}
			}
			sb.append(System.lineSeparator());
		}
		
		response.getWriter().append(sb.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
