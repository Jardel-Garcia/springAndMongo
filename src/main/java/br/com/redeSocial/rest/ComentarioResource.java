package br.com.redeSocial.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.redeSocial.documentos.Comentario;
import br.com.redeSocial.service.ComentarioService;

@Path("/comentarios")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class ComentarioResource {

	ComentarioService service = new ComentarioService();

	@GET
	public List<Comentario> get() {
		return service.getAll();
	}

	@GET
	@Path("/publicacao/{id}")
	public List<Comentario> getByPublicacao(@PathParam("id") String id) {
		return service.getByPublicacaoId(id);
	}

	@POST
	public void save(Comentario c) {
		service.insert(c);
	}

}
