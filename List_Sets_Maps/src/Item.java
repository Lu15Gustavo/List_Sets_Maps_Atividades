import java.util.ArrayList;
import java.util.Scanner;

public class Item {
    private String nome;
    private double preco;
    private int quant;

    static ArrayList<Item> Carrinho = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public Item(String nome, double preco, int quant){
        this.nome =nome;
        this.preco = preco;
        this.quant = quant;
    }


    public static void adicionarItem(String nome, double preco, int quant){
        Carrinho.add(new Item(nome, preco, quant));
        System.out.println("Item adicionado com sucesso ao carrinho de compra.\n");
    }

    public static void removerItem(String nome){
        for (int i = 0; i < Carrinho.size(); i++) 
        {
            if (Carrinho.get(i).getNome().equalsIgnoreCase(nome)) {
                Carrinho.remove(i);
                System.out.println("Item removido com sucesso.\n");
            }    
        }
        System.out.println("Item não encontrado.\n");
    }

    public static double calcularCarrinho(){
        double total = 0;
        for (Item item : Carrinho) {
            total += item.preco * item.quant;
        }
        System.out.println("Total: " + total + "\n");
        return total;
    }

    public static void exibirLista(){
        if (Carrinho.size() == 0) {
            System.out.println("Seu carrinho esta vazio.\n");
            return;
        }
        else{
            for (Item item : Carrinho) 
            {
                System.out.println(item);
            }
        }    
    }   

    @Override
    public String toString(){
        return " \n Nome: " + getNome() + "\n" + " Preço: " + getPreco() + "\n" + " Qauntidade: " + getQuant() + "\n";
    }




    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setQuant(int quant) {
        this.quant = quant;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuant() {
        return quant;
    }
}
