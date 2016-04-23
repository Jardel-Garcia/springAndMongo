package br.com.redeSocial.service;

import java.util.List;

import org.springframework.context.ApplicationContext;

import br.com.redeSocial.documentos.Usuario;
import br.com.redeSocial.repositorios.UsuarioRepository;
import br.com.redeSocial.util.SpringUtil;

public class UsuarioService {

	private UsuarioRepository db;
	
	public UsuarioService(){
		ApplicationContext context =SpringUtil.getContext();
		db =  context.getBean(UsuarioRepository.class);
	}
	
	public void insert(Usuario u){
		db.save(u);
	}
	
	public List<Usuario> getAll(){
		return db.findAll();
	}
	
	public Usuario getById(String id){
		return db.findByIdUsuario(id);
	}

}

