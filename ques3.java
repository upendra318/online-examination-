package uuu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ques3 extends HttpServlet{ 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{ 
		PrintWriter pw = res.getWriter(); 
        res.setContentType("text/html");
		pw.println("<html><body>");
		pw.println("<form method=\"GET\" action=\"serv300\"> ");
		pw.println("<p>3. Which is considered as the biggest port of India ? </p>");
		pw.println("<input type=\"radio\" id=\"31\" name=\"30\" value=\"kolkata\">"+"kolkata<br>");
		pw.println("<input type=\"radio\" id=\"32\" name=\"30\" value=\"cochie\">"+"cochin<br>");
		pw.println("<input type=\"radio\" id=\"33\" name=\"30\" value=\"channai\">"+"chennai<br>");
		pw.println("<input type=\"radio\" id=\"34\" name=\"30\" value=\"mumbai\">"+"mumbai<br>");
		
		pw.println("<input type='submit' name='next' value='next'>");
		pw.println("<input type='submit' name='previous' value='previous'>");
		pw.println("<input type='submit' name='submit' value='submit'>");
		
} }