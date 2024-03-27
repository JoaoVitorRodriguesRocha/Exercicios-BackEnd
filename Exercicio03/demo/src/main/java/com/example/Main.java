package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.OscarService;

import com.example.Indicacao;

import com.example.Filme;

import com.example.Ator;
import com.example.Indicavel;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private OscarService oscarService;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Criando instâncias de filmes e atores
        Filme filme1 = new Filme();
        // Definindo atributos do filme1
        Ator ator1 = new Ator();
        // Definindo atributos do ator1

        // Criando uma indicação com os objetos criados acima
        Indicacao indicacao1 = new Indicacao(filme1, "Melhor Filme");
        Indicacao indicacao2 = new Indicacao(ator1, "Melhor Ator");

        try {
            // Adicionando as indicações ao serviço
            oscarService.adicionarIndicacao(indicacao1);
            oscarService.adicionarIndicacao(indicacao2);
        } catch (Exception e) {
            System.out.println("Erro ao adicionar indicação: " + e.getMessage());
        }

        // Mostrando a lista de indicados
        System.out.println("Lista de Indicados:");
        oscarService.mostrarListaIndicados();
    }
}
