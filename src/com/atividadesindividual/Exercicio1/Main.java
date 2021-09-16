package com.atividadesindividual.Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("Carol","Rua Violeta","999889966",34,1.74));
        pessoas.add(new Pessoa("Cassio","Rua Rosas","999889977",40,1.82));
        pessoas.add(new Pessoa("Chris","Rua Cravos","999889988",35,1.70));
        pessoas.add(new Pessoa("Ana","Rua Margaridas","999889999",20,1.70));
        pessoas.add(new Pessoa("Rosa","Rua Samambaia","999889911",71,1.60));
        pessoas.add(new Pessoa("Osvaldo","Rua Copo de Leite","999889922",62,1.70));
        pessoas.add(new Pessoa("Yara","Rua Verde","999889933",10,1.55));
        pessoas.add(new Pessoa("Yency","Rua Azul","999889944",14,1.68));
        pessoas.add(new Pessoa("Yuri","Rua Roxa","999889955",2,1.20));
        pessoas.add(new Pessoa("Ayla","Rua Amarela","999889900",2,1.20));

        for (Pessoa pessoaLista: pessoas) {
            agenda.armazenarPessoa(pessoaLista);
        }

        System.out.println("\nPessoas na lista\n");
        agenda.exibirTodaAgenda();

        System.out.println("\nAdicionando Roseli na lista\n");
        agenda.armazenarPessoa(new Pessoa("Roseli","Rua Laranja","999889970",50,1.65));
        agenda.exibirTodaAgenda();

        System.out.println("\nRemovendo a pessoa com o nome Carol\n");
        agenda.removerPessoa("Carol");
        agenda.exibirTodaAgenda();

        System.out.println("\nBusca pessoa com o nome Cássio na lista e retorna sua posição\n");
        System.out.println("Posição-->"+agenda.buscarPessoa("Cassio"));

        System.out.println("\nBusca a pessoa na posição(index) 4 e exibe a pessoa\n");
        agenda.exibirPessoa(4);

        System.out.println("\nLista de pessoas por nome em ordem alfabética\n");
        agenda.listarPessoasEmOrdemAlfabéticaDeNome();

        System.out.println("\nLista de pessoas por endereço em ordem alfabética\n");
        agenda.listarPessoasEmOrdemAlfabeticaDeEndereco();

        System.out.println("\nLista de pessoas por idade em ordem decrescente\n");
        agenda.listarPessoasPorIdade();
    }
}
