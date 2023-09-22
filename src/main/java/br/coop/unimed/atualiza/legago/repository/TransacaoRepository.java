package br.coop.unimed.atualiza.legago.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import br.coop.unimed.atualiza.legago.domain.Transacao;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long>{
	
	@Query("SELECT t FROM Transacao t WHERE t.versaoPtu = 'V_100'")
	Collection<Transacao> findAllATransacaoTeste();

}
