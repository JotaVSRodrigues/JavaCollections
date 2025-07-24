package br.com.alura.screenmatch.modelos;

import java.lang.Math;

public class Circulo implements Forma{

    @Override
    public double calcularArea(double raio) {
        double pi = (float) Math.PI;
        double raioQuadrado = Math.pow(raio, 2);

        double areaCirculo = pi * (raioQuadrado);
        return areaCirculo;
    }
}
