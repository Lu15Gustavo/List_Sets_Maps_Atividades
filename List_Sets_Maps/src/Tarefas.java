import java.util.ArrayList;
import java.util.Scanner;

public class Tarefas {
    private String descricao;

    static ArrayList<Tarefas> ListaTarefas = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
                
        public Tarefas(String descricao)
        {
            this.descricao = descricao;
        }
            
        public static void adicionarTarefa(String descricao){
            ListaTarefas.add(new Tarefas(descricao));
        }

        public static void removerTarefa(String descricao){
            for (int i = 0; i < ListaTarefas.size(); i++) {
                if (ListaTarefas.get(i).descricao.equalsIgnoreCase(descricao)) {
                    ListaTarefas.remove(i);
                    System.out.println("Tarefa removida com sucesso.");
                    return;
                }
            }
            System.out.println("Tarefa não encontrada.");
        }
        public static void exibirLista(){
            int i = 1;
            if (ListaTarefas.size() == 0) {
                System.out.println("A lista vazia.");
            }
            else{
                for (Tarefas tarefas : ListaTarefas) 
                {
                    System.out.println(i + " - " + tarefas.getDescricao());
                    i++;
                }
        }   }
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
        public String getDescricao() {
            return descricao;
        }
}
