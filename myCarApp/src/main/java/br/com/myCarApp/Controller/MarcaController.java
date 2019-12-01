package br.com.myCarApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.myCarApp.Models.Marca;
import br.com.myCarApp.Repository.MarcaRepository;

@Controller
public class MarcaController {

	@Autowired
	private MarcaRepository mr;

	@RequestMapping(value = "/cadastrarMarca", method = RequestMethod.GET)
	public String form() {
		return "/web-inf/views/marca/formMarca.html";
	}

	@RequestMapping(value = "/cadastrarMarca", method = RequestMethod.POST)
	public String form(Marca marca) {

		mr.save(marca);

		return "redirect:/cadastrarMarca";
	}
}
