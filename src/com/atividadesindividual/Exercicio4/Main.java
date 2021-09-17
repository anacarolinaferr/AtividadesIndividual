package com.atividadesindividual.Exercicio4;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        PessoaDAO pessoaDAO = new PessoaDAO("nomes.txt");

        List<Pessoa> pessoasCadastrados = pessoaDAO.listagem();
        pessoasCadastrados.forEach(System.out::println);

        pessoaDAO.ordenaPorNome(pessoasCadastrados);
        System.out.println(pessoasCadastrados);

        pessoaDAO.salva(pessoasCadastrados);
    }
}
