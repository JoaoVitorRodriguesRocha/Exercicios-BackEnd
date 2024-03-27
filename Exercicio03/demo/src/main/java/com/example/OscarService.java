package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class OscarService {
    private List<Indicacao> indicacoes;

    @Autowired
    private Filme filme;

    @Autowired
    private Ator ator;

    public OscarService() {
        this.indicacoes = new ArrayList<>();
    }

    public void adicionarIndicacao(Indicacao indicacao) throws Exception {
        Indicavel indicavel = indicacao.getIndicavel();
        if (indicavel.isElegivel()) {
            indicavel.incrementarIndicacoes();
            indicacoes.add(indicacao);
        } else {
            throw new Exception("Erro: Indicável não é elegível.");
        }
    }

    public void mostrarListaIndicados() {
        for (Indicacao indicacao : indicacoes) {
            System.out.println("Categoria: " + indicacao.getCategoria() + ", Indicado: " + indicacao.getIndicavel().toString());
        }
    }

    public void salvarIndicadosEmArquivo(String nomeArquivo) {
        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            for (Indicacao indicacao : indicacoes) {
                writer.write(indicacao.getIndicavel().toString() + ", " + indicacao.getCategoria() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
