package view;

import controller.FatorialDuplo;

public class Principal {
    public static void main(String[] args) {

        FatorialDuplo fatorialDuplo = new FatorialDuplo();

        int valor = 9;
         if(valor % 2 != 0 && valor < 0);

         int resultado = fatorialDuplo.calcFatorialDuplo(valor);

        System.out.println("Fatorial duplo de " + valor + " é: " +resultado);

    }
}
