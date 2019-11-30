package br.com.myCarApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.myCarApp.Repository.UsuarioRepository;

@Controller
public class UsuarioController {
	 @Autowired
	 private UsuarioRepository ur;
	
	 @GetMapping(value = "/login", method=RequestMethod.GET)
	 public String login() {
		 
		 return "/web-inf/views/Usuario/login.html";
	 }

	 @GetMapping(value = "/web-inf/views/Usuario/login.html", method = RequestMethod.POST)
	 public String login() {
		 
		 return "webapp/index.html";
	 }
}
