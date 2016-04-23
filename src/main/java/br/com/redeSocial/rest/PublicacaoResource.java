package br.com.redeSocial.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.redeSocial.documentos.Publicacao;
import br.com.redeSocial.service.PublicacaoService;

@Path("/publicacoes")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class PublicacaoResource {

	PublicacaoService service = new PublicacaoService();

	@GET
	public List<Publicacao> get() {
		return service.getAll();
	}

	@GET
	@Path("/publicacao/{id}")
	public List<Publicacao> getByUsuario(@PathParam("idUsuario") String id) {
		return service.getByUsuario(id);
	}

	@POST
	public void save(Publicacao p) {
		service.insert(p);
	}
}