package br.com.myCarApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.myCarApp.Models.Despesa;
import br.com.myCarApp.Repository.DespesaRepository;

@Controller
public class DespesaController {

	@Autowired
	private DespesaRepository de;
	
	@RequestMapping(value = "/cadastrarDespesa", method = RequestMethod.GET)
	public String form() {
		return "/web-inf/views/Despesa/formDespesa.html";
	}
	
	@RequestMapping(value = "/cadastrarDespesa", method = RequestMethod.POST)
	public String form(Despesa despesa) {
		
		de.save(despesa);
		
		return "redirect:/cadastrarDespesa";
	}
}
