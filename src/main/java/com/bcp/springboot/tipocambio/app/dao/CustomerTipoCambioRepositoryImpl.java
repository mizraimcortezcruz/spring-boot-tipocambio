package com.bcp.springboot.tipocambio.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import com.bcp.springboot.tipocambio.app.entity.TipoCambio;

public class CustomerTipoCambioRepositoryImpl implements CustomerTipoCambioRepository{
	
	@PersistenceContext
	private EntityManager em;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public TipoCambio customFindById(Long id) {
		return null;
	}

	@Override
	@Transactional
	@Modifying
	public Integer customSave(TipoCambio tipoCambio) {
		logger.info("CustomerTipoCambioRepositoryImpl customSave");
		String sql="";
		sql ="insert into tipocambio (montoOrigen, monedaOrigen ";
		sql+=", montoDestino, monedaDestino, fechaCreacion, usuarioCreacion) ";
		sql+=" values (?, ?, ?, ?, sysdate(), ?)";
		Integer resultado=0;
		try {
			Query query = em.createNativeQuery(sql);
			query.setParameter(1, tipoCambio.getMontoOrigen());
			query.setParameter(2, tipoCambio.getMonedaOrigen());
			query.setParameter(3, tipoCambio.getMontoDestino());
			query.setParameter(4, tipoCambio.getMonedaDestino());
			query.setParameter(5, tipoCambio.getUsuarioCreacion());
			resultado=query.executeUpdate();
			logger.info("customSave resultado:"+String.valueOf(resultado));
		}catch(Exception e) {
			logger.info("customSave error:"+e.getMessage());
		}finally {
			logger.info("customSave finalizando");
		}
		return resultado;
	}

	@Override
	public Integer customUpdate(TipoCambio tipoCambio) {
		return 0;
		
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<TipoCambio> customFindAll() {
		
		return em.createQuery("from tipocambio").getResultList();
	}

}
