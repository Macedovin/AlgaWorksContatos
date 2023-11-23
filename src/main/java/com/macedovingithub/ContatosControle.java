package com.macedovingithub;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ContatosControle {
	
	private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();
	
	static {
		
//		Contato contato = new Contato();
//		
//		contato.setId("1");
//		contato.setNome("João");
//		contato.setTelefone("00000-0000");
//		
//		LISTA_CONTATOS.add(contato);

//   	Using constructor 	
		
		LISTA_CONTATOS.add(new Contato("1", "Maria", "+55 21 00000-0000"));
		LISTA_CONTATOS.add(new Contato("2", "João", "+55 21 00000-0000"));
		LISTA_CONTATOS.add(new Contato("3", "Normandes", "+55 21 00000-0000"));
		LISTA_CONTATOS.add(new Contato("4", "Thiago", "+55 21 00000-0000"));
		LISTA_CONTATOS.add(new Contato("5", "Alexandre", "+55 21 00000-0000"));
	}	
	
	@GetMapping
	public String index() {
		return "index";
	}

}
