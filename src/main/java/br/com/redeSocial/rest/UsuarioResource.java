package br.com.redeSocial.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.redeSocial.documentos.Usuario;
import br.com.redeSocial.service.UsuarioService;

@Path("/usuarios")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class UsuarioResource {

	UsuarioService service = new UsuarioService();
	
	@GET
	public List<Usuario> get() {
		
		return service.getAll();
	}
	
	@GET
	@Path("/usuario/{id}")
	public Usuario getById(@PathParam("id") String id) {
		return service.getById(id);
	}
	
	@POST
	public void save(Usuario e){
		service.insert(e);
	}

}
