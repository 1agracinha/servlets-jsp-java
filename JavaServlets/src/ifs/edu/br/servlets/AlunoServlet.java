package ifs.edu.br.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ifs.edu.br.aluno.Aluno;
import ifs.edu.br.dao.AlunoDao;

@WebServlet("/CadastrarAluno.do")
public class AlunoServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String matricula = request.getParameter("matricula");
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String email = request.getParameter("email");
		String endereco = request.getParameter("endereco");
		String cidade = request.getParameter("cidade");
		String estado = request.getParameter("estado");
		
		Aluno aluno = new Aluno();
		
		aluno.setMatricula(matricula);
		aluno.setNome(nome);
		aluno.setCpf(cpf);;
		aluno.setEmail(email);
		aluno.setEndereco(endereco);
		aluno.setCidade(cidade);
		aluno.setEstado(estado);
		
		AlunoDao alunoDao = new AlunoDao();
		alunoDao.inserir(aluno);
		
		out.print("<html>");
		out.print("<body>");
		out.print("<p>Aluno "+aluno.getNome()+" cadastrado com sucesso!");
		out.print("</body>");
		out.print("</html>");
		
	}
}
