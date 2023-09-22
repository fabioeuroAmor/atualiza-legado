package br.coop.unimed.atualiza.legago.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "TRANSACAO")
@NoArgsConstructor
@AllArgsConstructor
public class Transacao implements Serializable, BaseEntity<Long>{
	
	private static final long serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false, precision = 10)
    private Long id;

//    @Column(name = "ID_STATUS_TRANSACAO", nullable = false)
//    @Convert(converter = StatusTransacaoConverter.class)
//    private StatusTransacao status;

    @Column(name = "ETIQUETA", length = 16)
    private String etiqueta;

    @Column(name = "CD_UNIMED_UPLOAD", nullable = false, precision = 4)
    private short cdUnimedUpload;

    @Column(name = "CD_UNIMED_ORIGEM", nullable = true, precision = 4)
    private Short cdUnimedOrigem;

    @Column(name = "CD_UNIMED_DESTINO", nullable = true, precision = 4)
    private Short cdUnimedDestino;

    @Column(name = "TOKEN_GED", nullable = true, length = 32)
    private String tokenGed;

    @Column(name = "NOME_ARQUIVO", nullable = true, length = 32)
    private String nomeArquivo;

//    @Column(name = "PROTOCOLO_PTU", nullable = false, precision = 5)
//    @Convert(converter = ProtocolConverter.class)
//    private Protocol protocoloPtu;

    @Column(name = "VERSAO_PTU", nullable = false, length = 10)
    private String versaoPtu;

    @Column(name = "DATA", nullable = true)
    private LocalDateTime data;

    @Column(name = "RASCUNHO", nullable = false)
    private Boolean rascunho;
//
//    @Column(name = "FG_ERRO_APROVACAO", nullable = false)
//    private Boolean erroAprovacao;
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "transacao")
//    private Set<Pendencia> pendencias;
//
//    @Column(name = "DS_CHECKSUM")
//    private String checksum;
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "transacao")
//    private Set<MensagemHistorico> mensagens;
//
//    @OneToOne(fetch = FetchType.LAZY, mappedBy = "transacao")
//    private CamaraTransacao camaraTransacao;
//
//    @OneToOne(fetch = FetchType.LAZY, mappedBy = "transacao")
//    private ErroAprovacaoTransacao erroaprovacaoTransacao;
//
//    @Column(name = "DT_LIMITE_ENVIO")
//    private LocalDateTime dtLimiteEnvio;
//
//    @Column(name = "ID_INTEGRACAO")
//    private Long idIntegracao;
//
//    @Column(name = "TRANSACAO_PAI")
//    private Long idTransacaoPai;
//
//    @Column(name = "FG_COBR_ANEXO")
//    private Boolean cobrAnexo;
//
//    @Column(name = "DATA_EXPURGO")
//    private LocalDateTime dataExpurgo;
//
//    @Column(name = "FG_EXPURGADO")
//    private Boolean expurgado;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "ID_USUARIO")
//    private Usuario usuario;
//
//    @Column(name = "TP_PGTO_DOC1_A550")
//    @Convert(converter = TipoPagamentoA550Converter.class)
//    private TipoPagamentoA550 tpPgtoDoc1A550;
//
//    @Column(name = "TP_PGTO_DOC2_A550")
//    @Convert(converter = TipoPagamentoA550Converter.class)
//    private TipoPagamentoA550 tpPgtoDoc2A550;
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "transacao")
//    private Set<Solicitacao> solicitacao;
//
//    @Column(name = "TP_ARQUIVO_A550")
//    @Convert(converter = TipoArquivoA550Converter.class)
//    private TipoArquivoA550 tpArquivoA550;
//
//    @Column(name = "TP_ARQUIVO_PARCIAL_A550")
//    @Convert(converter = TipoArquivoParcialConverter.class)
//    private TipoArquivoParcial tpArquivoParcialA550;
//
//    @Column(name = "TP_ARQUIVO_PARCIAL_A560")
//    @Convert(converter = TipoArquivoParcialConverter.class)
//    private TipoArquivoParcial tpArquivoParcialA560;
//
//    @Column(name = "TP_ARQUIVO_NDC_A560")
//    @Convert(converter = TipoArquivoNdcA560Converter.class)
//    private TipoArquivoNdcA560 tpArquivoNdcA560;

}
