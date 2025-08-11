package br.com.alura.screenmatch.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(2);
        lista.add(9);
        lista.add(5);
        lista.add(20);

        Collections.sort(lista);
        System.out.println(lista);

        List<Titulo> titulo = new ArrayList<>();

        Titulo titulo1 = new Titulo("Duro de Matar");
        Titulo titulo2 = new Titulo("O Exterminador do Futuro");
        Titulo titulo3 = new Titulo("Duna");

        titulo.add(titulo1);
        titulo.add(titulo2);
        titulo.add(titulo3);
        titulo.sort(Comparator.comparing(Titulo::getNome));

        System.out.println(titulo);

    }
}
