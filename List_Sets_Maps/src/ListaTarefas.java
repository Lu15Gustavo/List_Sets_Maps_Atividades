
import java.util.Scanner;

public class ListaTarefas {
    
        public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println(" 1 - Adicionar tarefa. \n 2 - Remove tarefa. \n 3 - Lista de tarefas \n 4 - Descrição da tarefa \n 5 - Sair do programa");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite sua nova tarefa: ");
                    String nova = sc.nextLine();
                    Tarefas.adicionarTarefa(nova);
                    System.out.println("Tarefa adicionada com sucesso");
                break;

                case 2:
                    System.out.println("Digite a tarefa que remove: ");
                    String remove = sc.nextLine();
                    Tarefas.removerTarefa(remove);
                break;

                case 3:
                    Tarefas.exibirLista();
                break;

                default:
                        System.out.println("Valor invalido. Olhe as opções");
                break;
            }
            
        } while (opcao != 5);
        sc.close();
    }
}
