package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.*;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalComPratica {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Zebra", "Mamifero");
        Animal animal2 = new Animal("Sardinha", "Peixe");
        Cachorro cachorro1 = new Cachorro("Bulldog", "Mamifero");
            cachorro1.setApelido("Tony");
            cachorro1.setBrincadeira("Correr");
        Cachorro cachorro2 = new Cachorro("Sharpei", "Mamifero");
            cachorro2.setApelido("Hulk");
            cachorro2.setBrincadeira("Morder");

        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(animal1);
        animais.add(animal2);
        animais.add(cachorro1);
        animais.add(cachorro2);
        for (Animal animal : animais){
            System.out.println(animal);
            if (animal instanceof Cachorro cachorro){ // casting de classe Animal -> Cachorro
                System.out.println(cachorro.getApelido());
                System.out.println(cachorro.getBrincadeira());
            }
        }


        ArrayList<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("Notebook",  4500.00f);
        Produto produto2 = new Produto("Geladeira", 5000.00f);
        Produto produto3 = new Produto("Alcool", 20.50f);
        Produto produto4 = new Produto("Garrafinha", 90.25f);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        int contador = 0;
        float soma = 0;

        for (Produto produto : produtos){
            soma += produto.getPreco();
            contador++;
        }

        float media = soma/contador;
        System.out.println("A média do preço dos produtos é: " + media);

        var circulo1 = new Circulo();
        System.out.printf("%.2f", circulo1.calcularArea(20));


        ContaBancaria conta1 = new ContaBancaria(1234, 2000.00f);
        ContaBancaria conta2 = new ContaBancaria(1234, 80000.00f);
        ContaBancaria conta3 = new ContaBancaria(1234, 10000.00f);

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        for (int i = 0; i < contas.size(); i++){
            float[] saldos = new float[]{contas.get(i).getSaldo()};
            for (float s : saldos){

            }
        }

        for (ContaBancaria conta : contas){
            conta.getSaldo();
        }

    }
}
