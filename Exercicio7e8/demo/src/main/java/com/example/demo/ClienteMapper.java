package Exercicio7e8.demo.src.main.java.com.example.demo;

public class ClienteMapper {
    public static ClienteDTO toDTO(Cliente cliente) {
        ClienteDTO dto = new ClienteDTO();
        dto.setNome(cliente.getNome());
        dto.setSaldo(cliente.getSaldo());
        return dto;
    }

    public static Cliente toModel(ClienteDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setNome(dto.getNome());
        cliente.setSaldo(dto.getSaldo());
        return cliente;
    }
}
