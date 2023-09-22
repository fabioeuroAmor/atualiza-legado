package br.coop.unimed.atualiza.legago.treads;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import br.coop.unimed.atualiza.legago.domain.Transacao;
import br.coop.unimed.atualiza.legago.repository.TransacaoRepository;
import lombok.RequiredArgsConstructor;

//@Slf4j
@Component
@RequiredArgsConstructor
public class MinhaThread1 extends Thread {
	
   
	
	private TransacaoRepository transacaoRepository;

    @Autowired
    public MinhaThread1(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }
	

	@Override
    public void run() {
		
//	   List<Long> ids = Arrays.asList(41L, 42L, 25L,82L,74L);
//       ArrayList<Transacao> teste = (ArrayList<Transacao>) transacaoRepository.findAllById(ids);    
//		
//		for (Transacao trans : teste) {
//			System.out.println("ID: "+ trans.getId());
//			System.out.println("ETIQUETA: "+ trans.getEtiqueta());
//		}
		
		
//		ArrayList<Transacao> teste2 = (ArrayList<Transacao>) transacaoRepository.findAllATransacaoTeste();
//		
//		for (Transacao trans2 : teste2) {
//			System.out.println("ID: "+ trans2.getId());
//			System.out.println("ETIQUETA: "+ trans2.getEtiqueta());
//		}
		
		
	
//		// Número da página que você deseja recuperar (a primeira página é 0)
//		int pageNumber = 1;
//
//		// Número de elementos por página
//		int pageSize = 1355;
//
//		// Crie o objeto Pageable usando PageRequest.of
//		Pageable pageable = PageRequest.of(pageNumber, pageSize);
//
//		// Agora você pode usar este objeto pageable para consultar o banco de dados
//		Page<Transacao> page = transacaoRepository.findAll(pageable);
//
//		// Recupere os elementos da página atual
//		List<Transacao> content = page.getContent();
//
//		// Informações sobre a página
//		int totalPages = page.getTotalPages();
//		long totalElements = page.getTotalElements();
//		int currentPageNumber = page.getNumber();
//		
//		
//		//PARA PEGAR A PROXIMA PAGINA RETORNADA DO BANCO DE DADOS
//		Page<Transacao> currentPage = transacaoRepository.findAll(pageable);
//
//		// Verifique se há uma próxima página
//		if (currentPage.hasNext()) {
//		    Pageable nextPageable = currentPage.nextPageable();
//		    Page<Transacao> nextPage = transacaoRepository.findAll(nextPageable);
//
//		    // Agora você pode trabalhar com os resultados da próxima página
//		    List<Transacao> nextPageContent = nextPage.getContent();
//		} else {
//		    // Não há próxima página
//		}

		System.out.println("Quantidade de regitro atualizado no banco: " + getAllPages().size()); 		
		
		
        // Código que será executado quando a thread for iniciada
//		while(true) {
//			System.out.println("Teste 1 ");
//		}
    }
	
	//Pega todas as paginas de acordo com a query que  irei criar no Repository
	private List<Transacao> getAllPages() {
        List<Transacao> allEntities = new ArrayList<>();
        int pageNumber = 0;
        int pageSize = 100; // Defina o tamanho da página conforme necessário

        while (true) {
            Pageable pageable = PageRequest.of(pageNumber, pageSize);
            Page<Transacao> page = transacaoRepository.findAll(pageable);
            List<Transacao> pageContent = page.getContent();
            
            //Faz a atualizacao por pagina em lotes do pageSize
            atualizarBancoDeDadosEmLotes(pageContent);

            if (pageContent.isEmpty()) {
                // Não há mais páginas para ler
                break;
            }

            allEntities.addAll(pageContent);
            pageNumber++;
        }

        return allEntities;
    }
	
	//Criar o metodo que recebe a quantidade por pagina e atualiza no banco
	@Transactional
	private void atualizarBancoDeDadosEmLotes(List<Transacao> registros) {
        int batchSize = 100;
        //List<YourEntity> registros = myRepository.buscarProximosRegistros(batchSize);
        while (!registros.isEmpty()) {
            for (Transacao registro : registros) {
                // Execute suas operações de atualização aqui para cada registro
            	/// Se o objeto existir, você pode simplesmente chamar o método save para atualizá-lo            	
            	transacaoRepository.save(registro);
            }
            transacaoRepository.flush(); // Força a persistência dos registros atuais
            registros.clear(); // Limpa os registros processados
            // Você pode verificar condições para fazer o commit ou rollback
        }
    }
}
