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
        String nomeIn = nome.toUpperCase();
        System.out.println(new StringBuilder(nomeIn).reverse());
    }

    public static void palindromo(String nome){
        String nomeEntrada;
        nomeEntrada = nome.replace(" ", "").toUpperCase();
        StringBuilder invertido = new StringBuilder(nomeEntrada).reverse();
        System.out.println(nomeEntrada.equals((String) invertido.toString())?"É palíndromo!":"Não é palíndromo!");
    }
}
