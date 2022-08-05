package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendedor implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome_vendedor;
	private String nome_loja;
	private String celular;	
	private String email;
	
	public Vendedor() {
		
	}

	public Vendedor(Integer id, String nome_vendedor, String nome_loja, String celular, String email) {
		super();
		this.id = id;
		this.nome_vendedor = nome_vendedor;
		this.nome_loja = nome_loja;
		this.celular = celular;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome_vendedor() {
		return nome_vendedor;
	}

	public void setNome_vendedor(String nome_vendedor) {
		this.nome_vendedor = nome_vendedor;
	}

	public String getNome_loja() {
		return nome_loja;
	}

	public void setNome_loja(String nome_loja) {
		this.nome_loja = nome_loja;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Vendedor [id=" + id + ", nome_vendedor=" + nome_vendedor + ", nome_loja=" + nome_loja + ", celular="
				+ celular + ", email=" + email + "]";
	}

	
}
