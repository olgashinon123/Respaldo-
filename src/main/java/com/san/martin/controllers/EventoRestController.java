package com.san.martin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.san.martin.models.entity.Evento;
import com.san.martin.models.services.IEventoService;

@RestController
@RequestMapping("/api_evento")
public class EventoRestController {
	
	@Autowired
	private IEventoService eventoService;
	
	@GetMapping("/eventos")
	public List<Evento> index(){
		return eventoService.findAll();
	}

}
