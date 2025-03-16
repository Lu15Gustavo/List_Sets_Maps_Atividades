public class Festa {
    public static void main(String[] args) {
        Convidado.adicionarConvidado("Luis", 2328084);
        Convidado.adicionarConvidado("Samuel", 2328084);
        Convidado.adicionarConvidado("Alanys", 2328084);
        Convidado.adicionarConvidado("Peterson", 2328084);
        Convidado.adicionarConvidado("Rafael", 2328084);
        Convidado.adicionarConvidado("Rodrigo", 2328084);
        Convidado.adicionarConvidado("Luis", 2328084);

        Convidado.exibirConvidados();
        Convidado.removerConvidadoPorCdConvite(2328084);
        Convidado.exibirConvidados();
    }
}
