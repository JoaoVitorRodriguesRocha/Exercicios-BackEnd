package Exercicio7e8.demo.src.main.java.com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{nome}")
    public ClienteDTO getCliente(@PathVariable String nome) {
        return ClienteMapper.toDTO(clienteService.getCliente(nome));
    }
}

