package br.coop.unimed.atualiza.legago.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.coop.unimed.atualiza.legago.repository.TransacaoRepository;
import br.coop.unimed.atualiza.legago.treads.MinhaThread1;
import br.coop.unimed.atualiza.legago.treads.MinhaThread2;



@Service
public class AtualizaLegadoService {
	
	@Autowired
	TransacaoRepository  transacaoRepository;
	
	public void chamaTreads() {  
		
		 MinhaThread1 thread1 = new MinhaThread1(transacaoRepository);
	     MinhaThread2 thread2 = new MinhaThread2();
	     
	     

	    // Inicia as threads
	    thread1.start();
	    //thread2.start();
	    
		
		
    }

}
