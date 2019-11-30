package br.com.myCarApp.Repository;

import org.springframework.data.repository.CrudRepository;

import br.com.myCarApp.Models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{

}
