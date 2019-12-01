package br.com.myCarApp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.myCarApp.Models.Abastecimento;

@Repository
public interface AbastecimentoRepository extends CrudRepository<Abastecimento, String>{

}
