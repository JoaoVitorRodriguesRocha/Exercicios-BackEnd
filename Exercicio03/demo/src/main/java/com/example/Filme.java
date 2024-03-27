package com.example;
import org.springframework.stereotype.Component;

import com.example.Indicavel;


@Component
public class Filme implements Indicavel{
    private boolean elegivel;
    private short numeroDeIndicacoes;
    private String nome;
    private String genero;

    public Filme(String nome, String genero, boolean elegivel) {
        this.nome = nome;
        this.genero = genero;
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

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getNome(){
        return nome;
    }

    public String getGenero(){
        return genero;
    }

    @Override
    public String toString() {
        return "Filme nome: " + nome + ", genero: " + genero;
    }

}
