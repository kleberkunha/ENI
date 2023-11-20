package fr.eni.javaee.module2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ServletReadURL
 */
@WebServlet("/modules/module2/ServletReadURL")
public class ServletReadURL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String protocole = request.getScheme();
	String serverName = request.getServerName();
	int port = request.getServerPort();
	String appName = request.getContextPath();
	String resourcePath = request.getServletPath();
	
	StringBuffer sb = new StringBuffer();
	
	sb.append("Protocole : ").append(protocole).append(System.lineSeparator());
	sb.append("Server Name : ").append(serverName).append(System.lineSeparator());
	sb.append("Port : ").append(port).append(System.lineSeparator());
	sb.append("Application Name : ").append(appName).append(System.lineSeparator());
	sb.append("Resource Path : ").append(resourcePath).append(System.lineSeparator());
	
	response.getWriter().append(sb.toString());
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
