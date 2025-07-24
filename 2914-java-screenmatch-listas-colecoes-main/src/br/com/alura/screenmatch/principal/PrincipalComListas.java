package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        var filmeDoJoao = new Filme("Sinners", 2025);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoJoao);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        // cria uma variavel do tipo Titulo que retorna cada valor de lista em um looping do tamanho size() de lista
        for (Titulo item : lista){
            System.out.println(item);
            if (item instanceof Filme filme){
//              Filme filme = (Filme) item; // transforma o item em um filme
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

       /*
       for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        */

    }
}
