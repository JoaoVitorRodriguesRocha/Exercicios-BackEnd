package Exercicio7e8.demo.src.main.java.com.example.demo;

public class TransacaoMapper {
    public static TransacaoDTO toDTO(Transacao transacao) {
        TransacaoDTO dto = new TransacaoDTO();
        dto.setRecebedor(transacao.getRecebedor());
        dto.setPagador(transacao.getPagador());
        dto.setQuantidade(transacao.getQuantidade());
        return dto;
    }

    public static Transacao toModel(TransacaoDTO dto) {
        Transacao transacao = new Transacao();
        transacao.setRecebedor(dto.getRecebedor());
        transacao.setPagador(dto.getPagador());
        transacao.setQuantidade(dto.getQuantidade());
        return transacao;
    }
}