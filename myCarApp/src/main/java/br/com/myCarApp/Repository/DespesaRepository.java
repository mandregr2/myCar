package br.com.myCarApp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.myCarApp.Models.Despesa;
@Repository
public interface DespesaRepository extends CrudRepository<Despesa, String>{

}
