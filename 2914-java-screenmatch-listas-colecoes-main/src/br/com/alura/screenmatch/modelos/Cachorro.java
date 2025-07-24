package br.com.alura.screenmatch.modelos;

public class Cachorro extends Animal{
    private String apelido;
    private String brincadeira;

    public Cachorro(String especie, String classe) {
        super(especie, classe);

    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido){
        this.apelido = apelido;
    }

    public String getBrincadeira() {
        return brincadeira;
    }

    public void setBrincadeira(String brincadeira) {
        this.brincadeira = brincadeira;
    }
}
