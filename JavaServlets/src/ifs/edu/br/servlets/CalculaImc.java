package ifs.edu.br.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculaImc.do")
public class CalculaImc extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		
		float altura = Float.parseFloat(request.getParameter("altura"));
		float peso = Float.parseFloat(request.getParameter("peso"));
		
		float imc = peso/(altura*altura);
		
		out.print("<html>");
		out.print("<body>");
		
		out.print("<table>");
		
		out.print("<tr>");
		out.print("<td>IMC</td><td>CLASSIFICAÇÃO</td><td>OBESIDADE (grau)</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>MENOR QUE 18,5 </td><td> MAGREZA </td><td>0</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>ENTRE 18,5 E 24,9 </td><td> NORMAL </td><td>0</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>ENTRE 25,0 E 29,9 </td><td> SOBREPESO </td><td>I</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>ENTRE 30,0 E 39,9 </td><td> OBESIDADE </td><td>II</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>MAIOR QUE 40,0 </td><td> OBESIDADE GRAVE</td><td>III</td>");
		out.print("</tr>");
		
	
		out.print("</table>");
		
		out.print("<h3>Seu IMC é: "+imc+" </h3>");
		
		out.print("</body>");
		out.print("</html>");
		
		
		
	}
}
