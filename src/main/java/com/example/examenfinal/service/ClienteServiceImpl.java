package com.example.examenfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.examenfinal.model.Cliente;
import com.example.examenfinal.repository.ClienteRepository;

////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
@Service
public class ClienteServiceImpl extends GenericServiceImpl<Cliente, Long> implements ClienteService{

		@Autowired
	    ClienteRepository clienteRepository;
	    
	    @Override
	    public CrudRepository<Cliente, Long> getDao() {
	        return clienteRepository;
	    }  
		
}
////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////