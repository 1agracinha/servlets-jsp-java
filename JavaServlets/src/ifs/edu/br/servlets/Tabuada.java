package ifs.edu.br.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Tabuada.do")
public class Tabuada extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		int tabuada = Integer.parseInt(request.getParameter("tabuada"));
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h2>A tabuada de "+tabuada+" é: </h2>");
		out.print("<table>");
		for(int i = 1; i <= 10; i++){
			out.println("<tr>");
			out.println("  <td>");
			out.println(tabuada+" x "+i+" = "+(tabuada*i));
			out.println("  </td>");
			out.println("</tr>");
		}
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	}
}
