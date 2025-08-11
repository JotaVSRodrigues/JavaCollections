package br.com.alura.screenmatch.modelos;

public class ContaBancaria {
    private int numero;
    private float saldo;

    public ContaBancaria(int numero, float saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
