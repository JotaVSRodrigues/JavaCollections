package br.com.alura.screenmatch.modelos;

public class Animal {
    private String especie;
    private String classe;
    private String alimentacao;

    public void seAlimentar(){
        System.out.println(getEspecie() + "está se alimentando de " + getAlimentacao());
    }

    public Animal(String especie, String classe) {
        this.especie = especie;
        this.classe = classe;
    }

    public String getEspecie() {
        return especie;
    }

    public String getClasse() {
        return classe;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }
}
