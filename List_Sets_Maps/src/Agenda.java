public class Agenda {
    public static void main(String[] args) {
        Contato.adicionarContato("Luis", 33998284169L);
        Contato.adicionarContato("Samuel", 31927285460L);
        Contato.adicionarContato("Alanys", 12966782345L);
        Contato.adicionarContato("Rafael", 31456845562L);
        Contato.adicionarContato("Peterson", 349456456432L);
        Contato.adicionarContato("Rodrigo", 339483445234L);
        Contato.adicionarContato("Thiago", 119887723421L);
        Contato.adicionarContato("Luis", 33998284169L);

        Contato.exibirContato();
        Contato.pesquisarPorNome("Peterson");
        Contato.atualizarNumContato("Luis", 33998284160L);
        Contato.exibirContato();
        
    }
}
