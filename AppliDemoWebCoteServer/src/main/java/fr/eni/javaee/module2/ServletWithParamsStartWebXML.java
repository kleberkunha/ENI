package fr.eni.javaee.module2;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ServletWithParamsStartWebXML
 */
public class ServletWithParamsStartWebXML extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String parameterValue;
       

	@Override
	public void init() throws ServletException {
		this.parameterValue=this.getInitParameter("NAME_PARAMETER");
		super.init();
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("NAME_PARAMETER = : ").append(this.parameterValue);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
