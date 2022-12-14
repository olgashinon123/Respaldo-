package com.san.martin.models.services;

import java.util.List;

import com.san.martin.models.entity.Archivo;

public interface IArchivoService {
	
	public List<Archivo> findAll(); 
	
	public Archivo findById(Long id);
	
	public Archivo save(Archivo archivo);
	
	public void delete(Long id);


}
