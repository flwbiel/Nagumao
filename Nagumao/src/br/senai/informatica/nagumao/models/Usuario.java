package br.senai.informatica.nagumao.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Usuario {
	
	private Long id;
	private String nome;
	private String email;
	private String senha;
	@DateTimeFormat(pattern = "aaaa/MM/dd")
	private Date dataNascimento;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		
		
		this.email = email;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", dataNascimento="
				+ dataNascimento + "]";
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
