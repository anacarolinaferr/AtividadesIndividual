package com.atividadesindividual.Exercicio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nome,cpf,endereco,email,telefone;
        Scanner nomeEntrada  = new Scanner(System.in);
        System.out.println("Entre com um nome!");
        nome = nomeEntrada.nextLine();

        Scanner cpfEntrada  = new Scanner(System.in);
        System.out.println("Entre com um cpf!");
        cpf = cpfEntrada.nextLine();

        Scanner emailEntrada  = new Scanner(System.in);
        System.out.println("Entre com um email!");
        email = emailEntrada.nextLine();

        Scanner telefoneEntrada  = new Scanner(System.in);
        System.out.println("Entre com um telefone!");
        telefone = telefoneEntrada.nextLine();

        boolean resNome = Cliente.nomeValido(nome);
        boolean resCpf = Cliente.cpfValido(cpf);
        boolean resEmail = Cliente.emailValido(email);
        boolean restelefone = Cliente.telefoneValido(telefone);

        if(resNome == true && resCpf == true  && resEmail == true && restelefone == true){
            System.out.println("Cliente cadastrado!");
        }else{
            System.out.println("Cliente não pode ser cadastrado!");
        }
    }
}
