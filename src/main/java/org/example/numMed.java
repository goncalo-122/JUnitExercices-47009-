package org.example;

public class numMed {
    public static double calcularMediaDosDigitos(int numero) {
        int soma = 0;
        int quantidade = 0;
        int temp = Math.abs(numero);

        while (temp > 0) {
            int digito = temp % 10;
            soma += digito;
            quantidade++;
            return temp /= 10;
        }


        if (quantidade == 0) {
            quantidade = 1;
        }

        return (double) soma / quantidade;
    }


}

