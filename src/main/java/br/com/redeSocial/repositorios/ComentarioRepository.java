package br.com.redeSocial.repositorios;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.redeSocial.documentos.Comentario;

@Repository
public interface ComentarioRepository  extends MongoRepository<Comentario, Integer> {

	@Query("{'publicacao' :{'$ref' : 'publicacao' , '$id' : ?0}}")
	public List<Comentario> findByPublicacaoId(String idComentario);
}