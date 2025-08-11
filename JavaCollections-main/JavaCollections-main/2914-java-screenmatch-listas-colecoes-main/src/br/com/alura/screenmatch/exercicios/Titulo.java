package br.com.alura.screenmatch.exercicios;

public class Titulo implements Comparable<Titulo> {
    private String nome;

    @Override
    public String toString() {
        return "Título: " + getNome();
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
