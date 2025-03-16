import java.util.HashSet;
import java.util.Set;

public class Contato {
    private String nome;
    private long numtel;
        public Contato (String nome, long numtel){
            this.nome = nome;
            this.numtel = numtel;
        }
        static Set<Contato> SetdeContatos = new HashSet<>();
        public static void adicionarContato(String nome, long numtel)
        {
            for (Contato contato : SetdeContatos) 
            {
                if (contato.getNome().equalsIgnoreCase(nome)) 
                {
                    if (contato.getNumtel() == numtel) 
                    {
                        System.out.println("Contato já existi.");
                        return;
                    }
                }
            }
            SetdeContatos.add(new Contato(nome, numtel));
        }
    
        public static void exibirContato()
        {
            for (Contato contato : SetdeContatos) 
            {
                System.out.println(contato);
            }
        }
    
        public static void pesquisarPorNome(String nome)
        {
            for (Contato contato : SetdeContatos) 
            {
                if (contato.getNome().equalsIgnoreCase(nome)) 
                {
                    System.out.println(contato);
                    return;
                }
            }
            System.out.println("Contato não encontrado.");
        }
    
        public static void atualizarNumContato(String nome, long novoNum)
        {
            for (Contato contato : SetdeContatos) 
            {
                if (contato.getNome().equalsIgnoreCase(nome)) 
                {
                    contato.setNumtel(novoNum);
                }
            }
        }


    @Override
    public String toString() 
    {
        return "\n Nome: " + getNome() + "\n Numero: " + getNumtel();
    }



    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumtel(long numtel) {
        this.numtel = numtel;
    }
    public String getNome() {
        return nome;
    }
    public long getNumtel() {
        return numtel;
    }
}
