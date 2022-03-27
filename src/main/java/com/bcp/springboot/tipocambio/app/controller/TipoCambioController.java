package com.bcp.springboot.tipocambio.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bcp.springboot.tipocambio.app.service.TipoCambioServiceImpl;
import com.bcp.springboot.tipocambio.app.entity.TipoCambio;

@RestController
@RequestMapping("/tipocambio")
public class TipoCambioController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private TipoCambioServiceImpl tipoCambioService;
	
	@PostMapping(value = "/save", produces = "application/json")	
	public List<TipoCambio> saveTipoCambio(@RequestBody TipoCambio tipoCambio){
		logger.info("TipoCambioController saveTipoCambio");
		tipoCambioService.customSave(tipoCambio);
		return null;
	}
}
