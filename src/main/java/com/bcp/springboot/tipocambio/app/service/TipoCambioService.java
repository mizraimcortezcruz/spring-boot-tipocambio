package com.bcp.springboot.tipocambio.app.service;

import java.util.List;

import com.bcp.springboot.tipocambio.app.entity.TipoCambio;

public interface TipoCambioService {
	TipoCambio customFindById(Long id);
	Integer customSave(TipoCambio tipoCambio);
	Integer customUpdate(TipoCambio tipoCambio);
	List<TipoCambio> customFindAll();
}
