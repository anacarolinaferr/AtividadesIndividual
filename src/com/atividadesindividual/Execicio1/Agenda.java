package com.atividadesindividual.Execicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Agenda {
    private List<Pessoa> pessoa = new ArrayList<>();

    public void armazenarPessoa(Pessoa pessoa){
        this.pessoa.add(pessoa);
    }

    public void removerPessoa(String nome){
        for(int i = 0; i < pessoa.size(); i++){
            Pessoa p = pessoa.get(i);
            if(p.getNome().equals(nome)) {
                pessoa.remove(p);
                break;
            }
        }
    }

    public int buscarPessoa(String nome){
        int posicao = 0;
        for(int i = 0; i < pessoa.size(); i++){
            Pessoa p = pessoa.get(i);
            if(p.getNome().equals(nome)) {
                posicao = i;
            }
        }
        return posicao;
    }

    public void exibirTodaAgenda(){
        for (Pessoa listaPessoas: pessoa) {
            System.out.println(listaPessoas);
        }
    }
    public void exibirPessoa(int index){
        System.out.println(pessoa.get(index));
    }

    public void listarPessoasEmOrdemAlfabéticaDeNome(){
        List<Pessoa> pessoas = pessoa.stream()
                .sorted((Pessoa a, Pessoa b) -> a.getNome().compareTo(b.getNome()))
                .collect(Collectors.toList());

        for (Pessoa listaPessoas: pessoas) {
            System.out.println(listaPessoas);
        }
    }

    public void listarPessoasEmOrdemAlfabeticaDeEndereco(){
        List<Pessoa> pessoas = pessoa.stream()
                .sorted((Pessoa a, Pessoa b) -> a.getEndereco().compareTo(b.getEndereco()))
                .collect(Collectors.toList());

        for (Pessoa listaPessoas: pessoas) {
            System.out.println(listaPessoas);
        }
    }

    public void listarPessoasPorIdade(){
        List<Pessoa> pessoas = pessoa.stream()
                .sorted((Pessoa a, Pessoa b) -> b.getIdade().compareTo(a.getIdade()))
                .collect(Collectors.toList());

        for (Pessoa listaPessoas: pessoas) {
            System.out.println(listaPessoas);
        }
    }
}
