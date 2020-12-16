package ww;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ques2 extends HttpServlet{ 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{ 
		PrintWriter pw = res.getWriter(); 
        res.setContentType("text/html");
		pw.println("<html><body>");
		pw.println("<form method=\"GET\" action=\"serv200\"> ");
		pw.println("<p>2. The metal whose salts are sensitive to light is ?</p>");
		pw.println("<input type=\"radio\" id=\"21\" name=\"20\" value=\"Zinc\">"+"Zinc<br>");
		pw.println("<input type=\"radio\" id=\"22\" name=\"20\" value=\"silver\">"+"silver<br>");
		pw.println("<input type=\"radio\" id=\"23\" name=\"20\" value=\"copper\">"+"copper<br>");
		pw.println("<input type=\"radio\" id=\"24\" name=\"20\" value=\"aluminium\">"+"aluminium<br>");
		
		pw.println("<input type='submit' name='next' value='next'>");
		pw.println("<input type='submit' name='previous' value='previous'>");
		pw.println("<input type='submit' name='submit' value='submit'>");
		
} }