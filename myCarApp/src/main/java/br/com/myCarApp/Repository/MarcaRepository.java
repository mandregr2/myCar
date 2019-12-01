package br.com.myCarApp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.myCarApp.Models.Marca;
@Repository
public interface MarcaRepository extends CrudRepository<Marca, String>{

}
