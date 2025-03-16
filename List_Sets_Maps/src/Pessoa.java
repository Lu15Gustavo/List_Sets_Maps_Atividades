public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }



    @Override
    public String toString() {
        return "\n Nome: " + getNome() + "\n Idade: " + getIdade() + "\n Altura: " + getAltura() + "\n";
    }











    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getAltura() {
        return altura;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
}
