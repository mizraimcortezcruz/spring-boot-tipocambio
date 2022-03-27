package com.bcp.springboot.tipocambio.app.dao;
import com.bcp.springboot.tipocambio.app.entity.TipoCambio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoCambioRepository extends 
	JpaRepository<TipoCambio, Long>,CustomerTipoCambioRepository{

}
