package br.com.myCarApp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.myCarApp.Models.CategoriaDespesa;
@Repository
public interface CategoriaDespesaRepository extends CrudRepository<CategoriaDespesa, String> {

}
