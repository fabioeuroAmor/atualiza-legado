package br.coop.unimed.atualiza.legago.treads;

import org.springframework.stereotype.Component;

@Component
public class MinhaThread2 extends Thread {
	
	@Override
    public void run() {
        // Código que será executado quando a thread for iniciada
		while(true) {
			System.out.println("Teste 2");
		}
    }

}
