package Exercicio9.demo.src.main.java.com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ProdutoResponseDTO criarProduto(@RequestBody ProdutoRequestDTO produtoRequestDTO) {
        return produtoService.criarProduto(produtoRequestDTO);
    }

    @PutMapping("/{id}")
    public ProdutoResponseDTO atualizarProduto(@PathVariable Long id, @RequestBody ProdutoRequestDTO produtoRequestDTO) {
        return produtoService.atualizarProduto(id, produtoRequestDTO);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id) {
        produtoService.deletarProduto(id);
    }

    @GetMapping("/{id}")
    public ProdutoResponseDTO obterProdutoPorId(@PathVariable Long id) {
        return produtoService.obterProdutoPorId(id);
    }

    @GetMapping
    public List<ProdutoResponseDTO> obterTodosProdutos() {
        return produtoService.obterTodosProdutos();
    }

    @GetMapping("/search")
    public List<ProdutoResponseDTO> obterProdutosPorNome(@RequestParam String nome) {
        return produtoService.obterProdutosPorNome(nome);
    }
}

