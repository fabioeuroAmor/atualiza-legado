package br.coop.unimed.atualiza.legago;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.coop.unimed.atualiza.legago.service.AtualizaLegadoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class AtualizaLegadoRunner implements ApplicationRunner {
	
	@Autowired 
	AtualizaLegadoService atualizaLegadoService;
 

    @Override
    public void run(ApplicationArguments args) {
        log.info("Starting : atualiza-legado [{}]", "Ira chamar as threads"); 
        
        atualizaLegadoService.chamaTreads();
    }
}