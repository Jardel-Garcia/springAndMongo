package br.com.redeSocial.documentos;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Publicacao {

	private String idPublicacao;
	private String texto;
	@DBRef
	private List<Comentario> comentarios;

	public String getIdPublicacao() {
		return idPublicacao;
	}

	public void setIdPublicacao(String idPublicacao) {
		this.idPublicacao = idPublicacao;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

}
