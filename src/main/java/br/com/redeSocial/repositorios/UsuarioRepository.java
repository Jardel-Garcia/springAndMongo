package br.com.redeSocial.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.redeSocial.documentos.Usuario;

@Repository
public interface UsuarioRepository  extends MongoRepository<Usuario, Integer> {

	public Usuario findByIdUsuario(String id);
}
