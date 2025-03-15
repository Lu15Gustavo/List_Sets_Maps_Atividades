import java.util.InputMismatchException;
import java.util.Scanner;

public class CarrinhoDeCompra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        

        do {
            System.out.println("1 - Adicionar item.");
            System.out.println("2 - Remover item.");
            System.out.println("3 - Calcular total.");
            System.out.println("4 - Exibir Carrinho.");
            System.out.println("5 - Sair do programa.");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    try {
                        System.out.println("Digite o nome do produto: ");
                        String nome = sc.nextLine();

                        System.out.println("Preço: ");
                        double preco = sc.nextDouble();
                        System.out.println("Quantidade de itens:");
                        int quant  = sc.nextInt();
                        Item.adicionarItem(nome, preco, quant); 
                    } 
                    catch (InputMismatchException e) 
                    {
                        System.out.println("ERR: Valor não reconhecido");
                        sc.nextLine();
                    }   
                break;
                case 2:
                    System.out.println("Digite o nome do item que deseja remover: ");
                    String nome = sc.nextLine();
                    Item.removerItem(nome);

                break;
                case 3:
                    Item.calcularCarrinho();
                break;    
                case 4:
                    Item.exibirLista();
                break;

                default:
                    System.out.println("Opção invalida, tente novamente");
                break;
            }

        } while (opcao != 5);
        sc.close();
    }
}
