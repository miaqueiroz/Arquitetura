
package control;

import static java.lang.System.exit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Pais;

/**
 *
 * @author Aluno
 */
public class PaisDAO {
    ArrayList<Pais> paises = new ArrayList<>();
    
    public void inserirPais(Pais p)throws Exception{
        if(paises.contains(p) || p.getNome().equals("") || p.getSigla().equals("")){
            throw new Exception ("PAÍS JA CADASTRADO OU CAMPO NÃO INFORMADO.");
        }
        paises.add(p);
    }
    public Pais lerPais(String nome){ 
        for(int i = 0; i < paises.size() ; i++){
            if(paises.get(i).getNome().equals(nome)){
                return paises.get(i);
            }
        } 
        return null;        
    }
    
    public void alterarPais(Pais c) throws Exception{
        Pais alt = lerPais(c.getNome());
        alt.setDigito(c.getDigito());
    }
    
    public void excluirPais(String nome){
        for(int i = 0; i < paises.size() ; i++){
            if(paises.get(i).getNome().equals(nome)){
               paises.remove(paises.get(i));
            }
            
        } 
    }
    
    public ArrayList<Pais> list(){
        return this.paises;
    }
}
