/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
        if(nome.equals("Brasil")){
            this.limite += 100.00; 
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade <= 18){
            this.limite = 100.00;
        }else if(idade < 35 ){
            this.limite = 300.00;
        }else{
            this.limite = 500.00;
        }
    }

    
    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", telefone=" + telefone + ", limite=" + limite + ", pais=" + pais + '}';
    }
    
    
}
