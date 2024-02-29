package AtividadeLivro300Ideias;

public class Main {
    public static void main(String[] args) {
        AgendaTelefonica agendaTelefonica = new AgendaTelefonica();
        agendaTelefonica.incluir(new String[]{"Pedro, 31987312023"});
        agendaTelefonica.incluir(new String[]{"Jorge, 4233234324234"});
        agendaTelefonica.incluir(new String[]{"Klebin, 23423423424"});
        agendaTelefonica.incluir(new String[]{"Bolsonaro, 2434322434234"});
        agendaTelefonica.imprimirLista();
        agendaTelefonica.incluir(new String[]{"shiweuew, 1930912831209"});
        agendaTelefonica.alterar(4, new String[]{"Lula, 40028922"});
        agendaTelefonica.excluir(4);
        agendaTelefonica.pesquisar(1);
        agendaTelefonica.imprimirLista();
    }
}
