package com.bcp.springboot.tipocambio.app.dao;

import java.util.List;

import com.bcp.springboot.tipocambio.app.entity.TipoCambio;

public interface CustomerTipoCambioRepository {
	TipoCambio customFindById(Long id);
	Integer customSave(TipoCambio tipoCambio);
	Integer customUpdate(TipoCambio tipoCambio);
	List<TipoCambio> customFindAll();
}
