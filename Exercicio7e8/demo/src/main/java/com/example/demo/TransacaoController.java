package Exercicio7e8.demo.src.main.java.com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public TransacaoDTO realizarTransacao(@RequestBody TransacaoDTO transacaoDTO) {
        clienteService.atualizarSaldo(transacaoDTO.getPagador(), -transacaoDTO.getQuantidade());
        clienteService.atualizarSaldo(transacaoDTO.getRecebedor(), transacaoDTO.getQuantidade());
        return transacaoDTO;
    }
}