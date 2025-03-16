import java.util.ArrayList;
import java.util.Scanner;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    static int cont = 0;
    static ArrayList<Livro> ListadeLivros = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
    }
    public static void adicionarLivro(String titulo, String autor, int ano){
        ListadeLivros.add(new Livro(titulo, autor,ano));
        System.out.println("Livro adicionado com sucesso.");
    }
    public static void pesquisarPorAutor(String autor){
        
        for (Livro livro : ListadeLivros) {
            cont = 0;
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                System.out.println(livro);
                cont++;
            }
        }
        if(cont >= 1){
            return;
        }
        System.out.println("Livro não encontrado");
    }
    public static void pesquisarPorInterAno(int anoI, int anoF){
        cont = 0;
        for (int i = 0; i < ListadeLivros.size(); i++) {
            if (ListadeLivros.get(i).getAno() >= anoI && ListadeLivros.get(i).getAno() <= anoF) {
                System.out.println(ListadeLivros.get(i));
                cont++;
            }
        }
        if(cont >= 1){
            return;
        }
         System.out.println("Nenhum livro encontrado no intervalo desses anos.");
    }
    public static void pesquisarPorTitulo(String titulo){
        cont = 0;
        for (Livro livro : ListadeLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(livro);
                cont++;
            }
        }
        if(cont >= 1){
            return;
        }
        System.out.println("Livro não encontrado");
    }
    @Override
    public String toString() {
        return "\n Titulo: " + getTitulo() + "\n Autor: " + getAutor() + "\n Ano de publicação: " + getAno();
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAno() {
        return ano;
    }
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
}
