//package br.coop.unimed.atualiza.legago.domain.converte;
//
//
//
//import javax.persistence.AttributeConverter;
//import javax.persistence.Converter;
//
//import br.coop.unimed.atualiza.legago.domain.enums.StatusTransacao;
//
//@Converter
//public class StatusTransacaoConverter implements AttributeConverter<StatusTransacao, Integer> {
//
//    @Override
//    public Integer convertToDatabaseColumn(StatusTransacao attribute) {
//        return attribute.getValue().intValue();
//    }
//
//    @Override
//    public StatusTransacao convertToEntityAttribute(Integer dbData) {
//        return StatusTransacao.valueOf(dbData.byteValue());
//    }
//
//}
