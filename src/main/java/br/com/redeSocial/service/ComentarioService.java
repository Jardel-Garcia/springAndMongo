package br.com.redeSocial.service;

import java.util.List;

import org.springframework.context.ApplicationContext;

import br.com.redeSocial.documentos.Comentario;
import br.com.redeSocial.repositorios.ComentarioRepository;
import br.com.redeSocial.util.SpringUtil;

public class ComentarioService {

	private ComentarioRepository db;	
	
	public ComentarioService(){
		ApplicationContext context =SpringUtil.getContext();
		db =  context.getBean(ComentarioRepository.class);		
	}
	
	public void insert(Comentario c){
		db.save(c);
	}
	
	public List<Comentario> getAll(){
		return db.findAll();
	}
	
	public List<Comentario> getByPublicacaoId(String id){
		return db.findByPublicacaoId(id);
	}
}

