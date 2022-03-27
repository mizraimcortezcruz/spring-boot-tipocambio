package com.bcp.springboot.tipocambio.app.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bcp.springboot.tipocambio.app.dao.TipoCambioRepository;
import com.bcp.springboot.tipocambio.app.entity.TipoCambio;

@Service
public class TipoCambioServiceImpl implements TipoCambioService{
	
	@Autowired
	private TipoCambioRepository TipoCambioRepository;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public TipoCambio customFindById(Long id) {
		logger.info("customFindById");
		return null;
	}

	@Override
	public Integer customSave(TipoCambio tipoCambio) {
		logger.info("TipoCambioServiceImpl customSave");
		return TipoCambioRepository.customSave(tipoCambio);
	}

	@Override
	public Integer customUpdate(TipoCambio tipoCambio) {
		logger.info("customUpdate");
		return null;
	}

	@Override
	public List<TipoCambio> customFindAll() {
		logger.info("customFindAll");
		return null;
	}

}
