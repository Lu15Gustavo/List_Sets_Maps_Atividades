import java.util.HashSet;
import java.util.Set;

public class Convidado {
    private String nome;
    private int cdConvite;
    
    
        static Set<Convidado> SetdeConvidados = new HashSet<>();
    
        public Convidado(String nome, int cdConvite){
            this.nome = nome;
            this.cdConvite = cdConvite;
        }
        public static void adicionarConvidado(String nome, int cdConvite){
            for (Convidado convidado : SetdeConvidados) {
                if (convidado.getNome().equals(nome)) {
                    if (convidado.getCdConvite() == cdConvite) {
                        System.out.println("Convidado com as mesma caracteristicas ja registrado.");
                        return;
                    }
                }
            }
            SetdeConvidados.add(new Convidado(nome, cdConvite));
            System.out.println("Convidado adicionado com sucesso.");
        }
    
        public static void removerConvidadoPorCdConvite(int cdConvite){
            for (Convidado convidado : SetdeConvidados) {
                if (convidado.getCdConvite() == cdConvite) 
                {
                    SetdeConvidados.remove(convidado);
                    System.out.println("Convidado removido com sucesso.");
                    return;
                }
            }
            System.out.println("Convidado não encontrado.");
        }
        public static void exibirConvidados(){
            if (SetdeConvidados.isEmpty()) {
                System.out.println("Lista vazia");
            }
            int i = 1;
            for (Convidado convidado : SetdeConvidados) 
            {
                System.out.println( i + " - " + convidado);
                i++;
            }
        }












        @Override
        public String toString() {
            return "\n Nome: " + getNome() + "\n Codigo de Convite: " + getCdConvite();
        }




    public void setCdConvite(int cdConvite) {
        this.cdConvite = cdConvite;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCdConvite() {
        return cdConvite;
    }
    public String getNome() {
        return nome;
    }
}
