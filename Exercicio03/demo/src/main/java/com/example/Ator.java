package com.example;
import org.springframework.stereotype.Component;

import com.example.Indicavel;


@Component
public class Ator implements Indicavel{
    private boolean elegivel;
    private short numeroDeIndicacoes;
    private String nome;
    private String nacionalidade;

    public Ator(String nome, String nacionalidade, boolean elegivel) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.elegivel = elegivel;
        this.numeroDeIndicacoes = 0;
    }

    @Override
    public boolean isElegivel() {
        return elegivel;
    }

    @Override
    public void setElegivel(boolean elegivel) {
        this.elegivel = elegivel;
    }

    @Override
    public short getNumeroDeIndicacoes() {
        return numeroDeIndicacoes;
    }

    @Override
    public void setNumeroDeIndicacoes(short numeroDeIndicacoes) {
        this.numeroDeIndicacoes = numeroDeIndicacoes;
    }

    @Override
    public void incrementarIndicacoes() {
        this.numeroDeIndicacoes++;
    }

    public String getNome(){
        return nome;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }

    @Override
    public String toString() {
        return "Ator nome: " + nome + ", nacionalidade: " + nacionalidade;
    }

}
