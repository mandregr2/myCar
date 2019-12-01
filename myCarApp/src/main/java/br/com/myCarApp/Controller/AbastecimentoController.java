package br.com.myCarApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.myCarApp.Models.Abastecimento;
import br.com.myCarApp.Repository.AbastecimentoRepository;

@Controller
public class AbastecimentoController {

	@Autowired
	private AbastecimentoRepository ar;
	
	@RequestMapping(value = "/cadastrarAbastecimento", method = RequestMethod.GET)
	public String form() {
		return "/web-inf/views/Abastecimento/formAbastecimento.html";
	}
	
	@RequestMapping(value = "/cadastrarAbastecimento", method = RequestMethod.POST)
	public String form(Abastecimento abastecimento) {
		
		ar.save(abastecimento);
		
		return "redirect:/cadastrarAbastecimento";
	}
}
