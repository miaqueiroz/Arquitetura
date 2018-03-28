
package control;

import static java.lang.System.exit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Pais;

/**
 *
 * @author Aluno
 */
public class ControlePais {
    ArrayList<Pais> paises = new ArrayList<>();
    
    public void inserirPais(Pais p)throws Exception{
        if(paises.contains(p) || p.getNome().equals("") || p.getSigla().equals("")){
            throw new Exception ("PAÍS JA CADASTRADO OU CAMPO NÃO INFORMADO.");
        }
        paises.add(p);
    }
    
    public ArrayList<Pais> list(){
        return this.paises;
    }
}
