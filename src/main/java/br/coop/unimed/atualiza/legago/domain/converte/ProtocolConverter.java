//package br.coop.unimed.atualiza.legago.domain.converte;
//
//import br.coop.unimed.ptu.shared.Protocol;
//
//import javax.persistence.AttributeConverter;
//import javax.persistence.Converter;
//
//@Converter
//public class ProtocolConverter implements AttributeConverter<Protocol, Integer> {
//
//    @Override
//    public Integer convertToDatabaseColumn(Protocol attribute) {
//        return attribute.getValue().intValue();
//    }
//
//    @Override
//    public Protocol convertToEntityAttribute(Integer dbData) {
//        return Protocol.valueOf(dbData.shortValue());
//    }
//
//}
