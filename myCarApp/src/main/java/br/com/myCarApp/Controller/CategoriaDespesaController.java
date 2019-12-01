package br.com.myCarApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.myCarApp.Models.CategoriaDespesa;
import br.com.myCarApp.Repository.CategoriaDespesaRepository;;

@Controller
public class CategoriaDespesaController {

	@Autowired
	private CategoriaDespesaRepository cd;

	@RequestMapping(value = "/cadastrarCategoriaDespesa", method = RequestMethod.GET)
	public String form() {
		return "/web-inf/views/CategoriaDespesa/formCategoriaDespesa.html";
	}

	@RequestMapping(value = "/cadastrarCategoriaDespesa", method = RequestMethod.POST)
	public String form(CategoriaDespesa categoriaDespesa) {

		cd.save(categoriaDespesa);

		return "redirect:/cadastrarCategoriaDespesa";
	}
}
