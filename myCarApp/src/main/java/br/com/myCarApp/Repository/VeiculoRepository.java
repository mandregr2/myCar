package br.com.myCarApp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.myCarApp.Models.Veiculo;
@Repository
public interface VeiculoRepository extends CrudRepository<Veiculo, String>{

}
