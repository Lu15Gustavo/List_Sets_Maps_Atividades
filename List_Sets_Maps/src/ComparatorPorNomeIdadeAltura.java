import java.util.Comparator;

public class ComparatorPorNomeIdadeAltura {

    public static class ComparatorNome implements Comparator<Pessoa>{
        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            return p1.getNome().compareToIgnoreCase(p2.getNome());
        }
    }
    public static class ComparatorIdade implements Comparator<Pessoa> {
        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            return Integer.compare(p1.getIdade(), p2.getIdade());
        }
    }

    public static class ComparatorAltura implements Comparator<Pessoa> {

        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            return Double.compare(p1.getAltura(), p2.getAltura());
        }
    }

    public static class ComparatorNomeIdadeAltura implements Comparator<Pessoa> {

        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            int resultado = p1.getNome().compareToIgnoreCase(p2.getNome());

            if (resultado == 0) {
                resultado = Integer.compare(p1.getIdade(), p2.getIdade());
            }

            if (resultado == 0) {
                return Double.compare(p1.getAltura(), p2.getAltura());
            }
            return resultado;
        }
    }
    
}