package it.corso.ross;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S1
 */
@WebServlet("/S1")
public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//String nome = request.getParameter("username");
		String password = request.getParameter("password");
		
		PrintWriter writer = response.getWriter();//metodo che fa tornare quello che scrivo
		
		if(password.equals("123")){
			
			writer.println("La password inserita è corretta!");
			
			RequestDispatcher rd = request.getRequestDispatcher("S2");
			rd.include(request, response);
		
		}else {
			
			writer.println("La password inserita è ERRATA!");
			
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
			
			//response.sendRedirect("login.html");
}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
