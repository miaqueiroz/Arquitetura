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
public class Cliente {
    private String nome;
    private String telefone;
    private double limite;
    private Pais pais;
    private int idade;

    public Cliente() {
    }

    public Cliente(String nome, String telefone, double limite, Pais pais, int idade) {
        this.nome = nome;
        this.telefone = telefone;
        this.limite = limite;
        this.pais = pais;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome.length() >= 5){
            this.nome = nome;
        }else{
            throw new Exception("Nome deve ter pelo menos 5 caracteres.");
        }
        
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws Exception {
        if(telefone.length() != this.getPais().getDigito()){
            throw new Exception("Telefone invalido para seu pais.");
        }else{
            this.telefone = telefone;
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
        if(pais.equals("Brasil")){
            this.limite += 100.00; 
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
       this.idade = idade;
        if(idade <= 18){
            this.limite = 100.00;
        }else if(idade < 35 ){
            this.limite = 300.00;
        }else{
            this.limite = 500.00;
        }
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nome);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", telefone=" + telefone + ", limite=" + limite + ", pais=" + pais + ", idade=" + idade + '}';
    }
    
}
