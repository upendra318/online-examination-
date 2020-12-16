package ttt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ques1 extends HttpServlet{ 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{ 
		PrintWriter pw = res.getWriter(); 
        res.setContentType("text/html");
		pw.println("<html><body>");
		pw.println("<form method=\"GET\" action=\"serv66\"> ");
		pw.println("<p>1.The World Largest desert is ?</p>");
		pw.println("<input type=\"radio\" id=\"1\"  name=\"10\" value=\"thar\">"+"thar");
		pw.println("<input type=\"radio\" id=\"2\" name=\"10\" value=\"Kalahari\">"+"Kalahari<br>");
		pw.println("<input type=\"radio\"  id=\"3\" name=\"10\" value=\"sahara\">"+" sahara<br>\r\n");
		pw.println("<input type=\"radio\" id=\"4\" name=\"10\" value=\"Sonoran\">"+"Sonoran<br>");
		
		pw.println("<input type='submit' name='next' value='next'><br>");
		//pw.println("<input type='submit' name='previous' value='previous'>");
		pw.println("<input type='submit' name='submit' value='submit'>");
		
} } 