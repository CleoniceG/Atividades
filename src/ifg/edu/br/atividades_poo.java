
package ifg.edu.br;

import ifg.edu.br.vo.Cadastro;
import ifg.edu.br.vo.Funcionario;
import java.util.Scanner;


public class atividades_poo {

    
    public static void main(String[] args) {
      Scanner in= new Scanner(System.in);
        Cadastro cadastro = new Cadastro();
        int opcao = 5;
        while (opcao !=0){
            
            System.out.println("Escolher");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Deletar");
            System.out.println("3 - Listar");
            System.out.println("4 - Sair");
            opcao = in.nextInt();
            
            switch (opcao){
                case 1 :
                    Funcionario funcionario = new Funcionario();
                    System.out.println("--------------------------");
                    System.out.println("Codigo:");
                    funcionario.setCodigo(in.nextInt());
                    System.out.println("Nome:");
                    funcionario.setNome(in.next());
                    System.out.println("Idade:");
                    funcionario.setIdade(in.nextInt());
                    System.out.println("Setor:");
                    funcionario.setSetor(in.next());
                    System.out.println("---------------------------");
                    cadastro.cadastro(funcionario);
                    break;
                    
                case 2 :
                    System.out.println("---------------------------");
                    System.out.println("Digite o codigo do funcionario para excluir");
                    cadastro.excluiFuncionario(in.nextInt());
                    System.out.println("---------------------------");
                    break;
                    
                case 3 :
                    cadastro.lista();
                    break;
                    
                case 4 :
                    break;
            }
        }
    }
    
}
