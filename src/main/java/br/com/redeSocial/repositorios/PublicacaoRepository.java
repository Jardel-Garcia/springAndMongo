package br.com.redeSocial.repositorios;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.redeSocial.documentos.Publicacao;

@Repository
public interface PublicacaoRepository  extends MongoRepository<Publicacao, String> {

	@Query("{'usuario' :{'$ref' : 'usuario' , '$idUsuario' : ?0}}")
	public List<Publicacao> findByUsuario(String idUsuario);
}