/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author Aluno
 */
public class Pais {
    private String nome;
    private String sigla;
    private int digito; 

    public Pais() {
    }

    public Pais(String nome, String sigla, int digito) {
        this.nome = nome;
        this.sigla = sigla;
        this.digito = digito;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }
    
    //hashCode retorna um inteiro como tamanho do objeto, seo objeto for igual,
    //possui o mesmo tamanho.
    //seria basicamente um equals(). em String, porem mais otimizado para uso
    //de grande volume de dados.
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "Pais{" + "nome=" + nome + ", sigla=" + sigla + '}';
    }      
    
}
