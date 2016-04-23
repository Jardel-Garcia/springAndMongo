package br.com.redeSocial.service;

import java.util.List;

import org.springframework.context.ApplicationContext;

import br.com.redeSocial.documentos.Publicacao;
import br.com.redeSocial.repositorios.PublicacaoRepository;
import br.com.redeSocial.util.SpringUtil;

public class PublicacaoService {

	private PublicacaoRepository db;
	
	public PublicacaoService(){
	
		ApplicationContext context =SpringUtil.getContext();
		db =  context.getBean(PublicacaoRepository.class);
	}
	
	public void insert(Publicacao u){
		db.save(u);
	}
	
	public List<Publicacao> getAll(){
		
		return db.findAll();
	}
	
	public List<Publicacao> getByUsuario(String idUsuario){
		
		return db.findByUsuario(idUsuario);
	}

}

