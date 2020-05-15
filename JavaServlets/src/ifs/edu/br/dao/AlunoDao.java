package ifs.edu.br.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ifs.edu.br.aluno.Aluno;

public class AlunoDao {

		private Connection connection;

		public AlunoDao() {
			this.connection = new ConnectionFactory().getConnection();
		}

		public void inserir(Aluno aluno) {
			String sql = "INSERT INTO public.aluno(matricula, nome, cpf, email, endereco, cidade, estado) VALUES (?, ?, ?, ?, ?, ?, ?)";
			try {
				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setString(1, aluno.getMatricula());
				stmt.setString(2, aluno.getNome());
				stmt.setString(3, aluno.getCpf());
				stmt.setString(4, aluno.getEmail());
				stmt.setString(5, aluno.getEndereco());
				stmt.setString(6, aluno.getCidade());
				stmt.setString(7, aluno.getEstado());
				stmt.execute();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}