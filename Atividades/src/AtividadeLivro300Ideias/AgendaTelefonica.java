package AtividadeLivro300Ideias;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AgendaTelefonica {
    private List<String> lista = new ArrayList<>();
    public void incluir(String[] elemento){
        lista.add(Arrays.toString(elemento));
    }
    public void alterar(int posicao, String[] elemento){
        lista.set(posicao, Arrays.toString(elemento));
    }
    public void excluir(int posicao){
        lista.remove(posicao);
    }
    public void pesquisar(int posicao){
        System.out.println("O elemento da lista é: "+lista.get(posicao));
    }
    public void imprimirLista(){
        System.out.println(lista);
    }
}
