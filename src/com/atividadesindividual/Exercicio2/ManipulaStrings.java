package com.atividadesindividual.Exercicio2;

import java.util.Scanner;

public class ManipulaStrings {

    public static void main(String[] args) {
        String nome;
        Scanner nomeEntrada  = new Scanner(System.in);
        System.out.println("Entre com um nome!");
        nome = nomeEntrada.nextLine();
        inverteString(nome);
        palindromo(nome);
    }

    public static void inverteString(String nome){
        String invertido = "";
        for (int i = nome.toCharArray().length-1; i>=0;i--){
            invertido += nome.toCharArray()[i];
        }
        System.out.println(invertido.toUpperCase());
    }

    public static void palindromo(String nome){
        String invertido = "", nomeEntrada;
        nomeEntrada = nome.replace(" ", "");
        for (int i = nomeEntrada.toCharArray().length-1; i>=0;i--){
            invertido += nomeEntrada.toCharArray()[i];
        }
        System.out.println(nomeEntrada.toUpperCase().equals(invertido.toUpperCase())?"É palíndromo!":"Não é palíndromo!");
    }
}
