package com.san.martin.models.services;

import java.util.List;

import com.san.martin.models.entity.Referencia;

public interface IReferenciaService {
	
	public List<Referencia> findAll();
	public Referencia findById(Long id);
	public Referencia saveReferencia(Referencia referencia);
	public void deletereferenciaById(Long id);
	
	

}
