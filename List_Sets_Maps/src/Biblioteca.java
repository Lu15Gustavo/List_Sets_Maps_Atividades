import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("1 - Adicionar livro.");
            System.out.println("2 - Pesquisar por autor.");
            System.out.println("3 - Pesquisar por ano de intervalo");
            System.out.println("4 - Pesquisar por titulo.");
            System.out.println("5 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                        System.out.println("Digite o Titulo do livro: ");
                        String titulo = sc.nextLine();

                        System.out.println("Digite o autor do livro: ");
                        String autor = sc.nextLine();

                        System.out.println("Digite o ano de lançamento: ");
                        int ano = sc.nextInt();

                        Livro.adicionarLivro(titulo, autor, ano);
                    break;
                case 2:
                        System.out.println("Digite o autor que deseja pesquisar: ");
                        autor = sc.nextLine();
                        Livro.pesquisarPorAutor(autor);     
                    break;
                case 3:
                        System.out.println("Digite o ano inicial: ");
                        int anoI = sc.nextInt();
                        
                        System.out.println("Digite o ano final: ");
                        int anoF = sc.nextInt();

                        Livro.pesquisarPorInterAno(anoI, anoF);
                    break;    
                case 4:
                        System.out.println("Digite o titulo do livro: ");
                        titulo = sc.nextLine();
                        Livro.pesquisarPorTitulo(titulo);        
                    break;
                case 5:
                        System.out.println("Saindo...");
                    break;            
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        } while (opcao != 5);
        sc.close();
    }
}
