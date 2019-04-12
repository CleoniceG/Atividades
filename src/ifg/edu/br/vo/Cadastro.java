
package ifg.edu.br.vo;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
  List<Funcionario> emprego = new  ArrayList<>(); 

public void cadastro(Funcionario funcionario){
    emprego.add(funcionario);
    
}
public void lista() {
    for (int i = 0 ;i< emprego.size();i++){
        System.out.println("-------------------------");
        System.out.println("Nome:" +((Funcionario)emprego.get(i)).getNome());
        System.out.println("Idade:"+((Funcionario)emprego.get(i)).getIdade());
        System.out.println("Codigo:"+((Funcionario)emprego.get(i)).getCodigo());
        System.out.println("Setor"+((Funcionario)emprego.get(i)).getSetor());
        System.out.println("-------------------------");
    }
}
public void excluiFuncionario(int cod){
    for (int i = 0; i < emprego.size();i++){
        if (((Funcionario )emprego.get(i)).getCodigo()==cod){
            emprego.remove(i);
        }
    }
}
}