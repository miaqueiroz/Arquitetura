/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import static java.lang.System.exit;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author Aluno
 */
public class ControleCliente {
    ArrayList<Cliente> clientes = new ArrayList<>();
    
    
    public void inserirCliente(Cliente c){
        int i = 0;
        while(clientes != null){
            if(c.getNome().equals(clientes.get(i).getNome()) || c.getNome().length() < 5){
                System.out.println("NOME INCORRETO OU JA CADASTRADO.");
                exit(0);
            }
            
            i++;    
        }
        clientes.add(c);
    }
}