//package br.coop.unimed.atualiza.legago.domain.enums;
//
//import br.coop.unimed.util.IdentifiableEnum;
//
//public enum StatusTransacao  implements IdentifiableEnum{
//	
//	/**
//     * A transação foi inserida no banco, mas ainda não foi feito o upload do arquivo
//     */
//    NOVO((byte) 1),
//
//    /**
//     * Já foi realizado o upload do arquivo e o mesmo já se encontra ativo perante o sistema
//     */
//    ATIVO((byte) 2),
//
//    /**
//     * O arquivo foi validado e possui erros que não podem ser aprovados/ignorados
//     */
//    INVALIDO((byte) 3),
//
//    /**
//     * O arquivo foi cancelado e não poderá ser mais ativo
//     */
//    CANCELADO((byte) 4),
//
//    /**
//     * O arquivo foi devolvido e não poderá ser mais ativo
//     */
//    DEVOLVIDO((byte) 5),
//
//    /**
//     * O arquivo foi está aguardando aprovação
//     */
//    AGUARDANDO((byte)6),
//
//    /**
//     * O envio do arquivo foi cancelado
//     */
//    NAO_ENVIADO((byte)7),
//
//    /**
//     * O prazo para o envio do arquivo foi expirado
//     */
//    PRAZO_ENVIO_ERRO_APROVACAO_EXPIRADO((byte)8);
//
//    private byte value;
//
//    StatusTransacao(final byte value) {
//        this.value = value;
//    }
//
//    @Override
//    public Byte getValue() {
//        return this.value;
//    }
//
//    public static StatusTransacao valueOf(byte value) {
//        for (final StatusTransacao status : values()) {
//            if (value == status.value) {
//                return status;
//            }
//        }
//        return null;
//    }
//
//}
