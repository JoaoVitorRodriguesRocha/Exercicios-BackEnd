package Exercicio7e8.demo.src.main.java.com.example.demo;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class ClienteService {
    private Map<String, Cliente> clientes = new HashMap<>();

    public ClienteService() {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Cliente1");
        cliente1.setSaldo(1000.0);
        cliente1.setSenha("senha1");
        clientes.put(cliente1.getNome(), cliente1);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Cliente2");
        cliente2.setSaldo(2000.0);
        cliente2.setSenha("senha2");
        clientes.put(cliente2.getNome(), cliente2);
    }

    public Cliente getCliente(String nome) {
        return clientes.get(nome);
    }

    public void atualizarSaldo(String nome, double quantidade) {
        Cliente cliente = clientes.get(nome);
        if (cliente != null) {
            cliente.setSaldo(cliente.getSaldo() + quantidade);
        }
    }
}
