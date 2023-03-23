package com.example.examenfinal.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.examenfinal.model.Carta;
import com.example.examenfinal.repository.Carta;
////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
@Service
public class CartaServiceImpl extends GenericServiceImpl<Carta, Long> implements CartaService{

		@Autowired
	    CartaRepository cartaRepository;
	    
	    @Override
	    public CrudRepository<Carta, Long> getDao() {
	        return cartaRepository;
	    }  
		
}
////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////