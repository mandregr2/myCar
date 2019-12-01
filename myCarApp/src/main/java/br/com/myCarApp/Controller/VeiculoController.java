package br.com.myCarApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.myCarApp.Models.Veiculo;
import br.com.myCarApp.Repository.VeiculoRepository;

@Controller
public class VeiculoController {

	@Autowired
	private VeiculoRepository ve;

	@RequestMapping(value = "/cadastrarVeiculo", method = RequestMethod.GET)
	public String form() {
		return "/web-inf/views/Veiculo/formVeiculo.html";
	}

	@RequestMapping(value = "/cadastrarVeiculo", method = RequestMethod.POST)
	public String form(Veiculo veiculo) {

		ve.save(veiculo);

		return "redirect:/cadastrarVeiculo";
	}
}
