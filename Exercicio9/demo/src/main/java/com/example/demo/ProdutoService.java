package Exercicio9.demo.src.main.java.com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoResponseDTO criarProduto(ProdutoRequestDTO produtoRequestDTO) {
        Produto produto = new Produto();
        produto.setNome(produtoRequestDTO.getNome());
        produto.setPreco(produtoRequestDTO.getPreco());
        produto.setDescricao(produtoRequestDTO.getDescricao());
        Produto produtoSalvo = produtoRepository.save(produto);
        return mapToResponseDTO(produtoSalvo);
    }

    public ProdutoResponseDTO atualizarProduto(Long id, ProdutoRequestDTO produtoRequestDTO) {
        Produto produto = produtoRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        produto.setNome(produtoRequestDTO.getNome());
        produto.setPreco(produtoRequestDTO.getPreco());
        produto.setDescricao(produtoRequestDTO.getDescricao());
        Produto produtoAtualizado = produtoRepository.save(produto);
        return mapToResponseDTO(produtoAtualizado);
    }

    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }

    public ProdutoResponseDTO obterProdutoPorId(Long id) {
        Produto produto = produtoRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        return mapToResponseDTO(produto);
    }

    public List<ProdutoResponseDTO> obterTodosProdutos() {
        List<Produto> produtos = produtoRepository.findAll();
        return produtos.stream().map(this::mapToResponseDTO).collect(Collectors.toList());
    }

    public List<ProdutoResponseDTO> obterProdutosPorNome(String nome) {
        List<Produto> produtos = produtoRepository.findByNomeContainingIgnoreCase(nome);
        return produtos.stream().map(this::mapToResponseDTO).collect(Collectors.toList());
    }

    private ProdutoResponseDTO mapToResponseDTO(Produto produto) {
        ProdutoResponseDTO responseDTO = new ProdutoResponseDTO();
        responseDTO.setId(produto.getId());
        responseDTO.setNome(produto.getNome());
        responseDTO.setPreco(produto.getPreco());
        responseDTO.setDescricao(produto.getDescricao());
        return responseDTO;
    }
}

