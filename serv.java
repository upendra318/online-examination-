package kkk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class serv extends HttpServlet{
	

	
	 int count=0;
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{ 
		
		
		response.setContentType("text/html");	
	
		PrintWriter pw = response.getWriter();
	
	
	
	String pass;
	if(request.getParameter("10") != null) {
		 pass = request.getParameter("10"); 
	     if(pass=="sahara")
	     {
	    	 count = count+1;
	     }
	   int  hh=count;
	    
		if(request.getParameter("next") != null) {
			RequestDispatcher rd = request.getRequestDispatcher("/ques2");
		rd.forward(request, response);
		}
	   /* if(request.getParameter("previous") != null)
	    	 response.sendRedirect("/SendRedirect/ValidUserServlet"); */
	 	
	     else if(request.getParameter("submite") != null) {
	    	 
	            pw.print("your score is: " + hh);
	            
	            exit();
	 		}
	     
	}
	
	
	
	if(request.getParameter("20") != null) {
		 String b = request.getParameter("20"); 
	     if(b=="aluminium")
	     {
	    	 count = count+1;
	     }
	     int xx=count;
	     
	     if(request.getParameter("next") != null) {
	    	 RequestDispatcher oo = request.getRequestDispatcher("/ques3");
			oo.forward(request, response);
	     }
	     else if(request.getParameter("previous") != null) {
	    	 RequestDispatcher bb = request.getRequestDispatcher("/ques11");
	 		bb.forward(request, response);
	     }
	 	
	     else if(request.getParameter("submite") != null) {
	    	 
	   
	    	 
	    	 pw.print("your score is: " + xx);
	    	 
	    	 exit();
	     }
	}
	
	
	
	
	if(request.getParameter("30") != null) {
		 String c = request.getParameter("30"); 
		if(c=="mumbai")
	     {
			count = count+1;
	     }
	  int  ss=count; 
	   /*  if(request.getParameter("next") != null)
	    	 response.sendRedirect("ques3"); 	   */
	     
	    if(request.getParameter("previous") != null) {
	    	RequestDispatcher ff = request.getRequestDispatcher("/ques28");
		ff.forward(request, response);
	    }
	 	
	     else if(request.getParameter("submite") != null) {
	 	
		    	 
	    	 pw.print("your score is: " + ss);
	    	 
	    	exit();
	     }
	}
	
	
	
	
/*	if(request.getParameter("submite") == null) {
		

		pw.println("your score is: "+count);
	
//	} */
	}
	private void exit() {
		// TODO Auto-generated method stub
		
	}
	
}