import java.util.ArrayList;



public class AppPessoa {
    public static void main(String[] args) {
        ArrayList<Pessoa> ListadePessoa = new ArrayList<>();
       
        Pessoa p1 = new Pessoa("Luís", 20, 1.73);
        Pessoa p2 = new Pessoa("Alanys", 20, 1.69);
        Pessoa p3 = new Pessoa("Ana Clara", 20, 1.70);
        Pessoa p4 = new Pessoa("Maciel", 20, 1.75);
        Pessoa p5 = new Pessoa("Samuel", 24, 1.81);
        Pessoa p6 = new Pessoa("Peterson", 27, 1.68);
        Pessoa p7 = new Pessoa("Alanys", 25, 1.65);

        ListadePessoa.add(p1);
        ListadePessoa.add(p2);
        ListadePessoa.add(p3);
        ListadePessoa.add(p4);
        ListadePessoa.add(p5);
        ListadePessoa.add(p6);
        ListadePessoa.add(p7);


        for (Pessoa pessoa : ListadePessoa) {
            System.out.println(pessoa);
        }

        ListadePessoa.sort(new ComparatorPorNomeIdadeAltura.ComparatorNome());

        for (Pessoa pessoa : ListadePessoa) {
            System.out.println(pessoa);
        }

        ListadePessoa.sort(new ComparatorPorNomeIdadeAltura.ComparatorIdade());
        
        for (Pessoa pessoa : ListadePessoa) {
            System.out.println(pessoa);
        }

        ListadePessoa.sort(new ComparatorPorNomeIdadeAltura.ComparatorAltura());

        for (Pessoa pessoa : ListadePessoa) {
            System.out.println(pessoa);
        }

        ListadePessoa.sort(new ComparatorPorNomeIdadeAltura.ComparatorNomeIdadeAltura());

        for (Pessoa pessoa : ListadePessoa) {
            System.out.println(pessoa);
        }
    }
}
