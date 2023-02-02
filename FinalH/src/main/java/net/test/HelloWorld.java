package net.test;


import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;


/**
 * Servlet implementation class HelloWorld
 */
//@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//    public void init() {};

    protected void doGet(HttpServletRequest request,
    		HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
    	PrintWriter out= response.getWriter();
  
    	String n=request.getParameter("username");  
        String p=request.getParameter("password");

        if(n.equals("Seema") && p.equals("1234")){
        	request.getRequestDispatcher("/Welcome.html").forward(request, response);

        }
        else{  
        	  out.println("<script type=\"text/javascript\">");
              out.println("alert('Sorry username or password error!');");
              out.println("</script>");
            RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
            rd.include(request,response);  
        } 
        
        out.close();
        
    	
    		//System.out.println("Hello World");
    		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
}
