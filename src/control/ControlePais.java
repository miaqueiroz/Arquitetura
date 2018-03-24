
package control;

import static java.lang.System.exit;
import java.util.ArrayList;
import model.Pais;

/**
 *
 * @author Aluno
 */
public class ControlePais {
    ArrayList<Pais> paises = new ArrayList<>();
    
    public void inserirPais(Pais p){
        int i = 0;
        while(paises != null){
            if(p.getNome().equals(paises.get(i).getNome()) || p.getNome().equals("") || p.getSigla().equals("")){
                System.out.println("PAÍS JA CADASTRADO OU CAMPO NÃO INFORMADO.");
                exit(0);
            }
            
            i++;    
        }
        paises.add(p);
    }
    
    public ArrayList<Pais> list(){
        return this.paises;
    }
}
