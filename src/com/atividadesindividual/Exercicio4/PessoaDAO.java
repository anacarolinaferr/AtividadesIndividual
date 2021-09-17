package com.atividadesindividual.Exercicio4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO implements Persistivel<Pessoa>{

    private File file;
    private ArquivoUtil arquivoUtil;

    public PessoaDAO(String arquivo) {
        file = new File(arquivo);
        arquivoUtil = new ArquivoUtil(file);
    }

    @Override
    public void salva(Pessoa pessoa) {
        String registro = pessoa.getNome();
        try {
            arquivoUtil.escreve(registro);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void salva(List<Pessoa> lista) {
        lista.forEach(pessoa -> salva(pessoa));
        arquivoUtil.fechaArquivo();
    }

    @Override
    public Pessoa obter(String id) {
        return null;
    }

    @Override
    public List<Pessoa> listagem() {
        List<Pessoa> pessoaExistentes = new ArrayList<>();
        try {
            List<String> registros = this.arquivoUtil.retornaRegistros();
            String[] nomes = registros.get(0).split(";");
            for (String nome : nomes) {
                Pessoa pessoaConvertido = converte(nome);
                pessoaExistentes.add(pessoaConvertido);
            }
            return pessoaExistentes;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private Pessoa converte(String registro) {
        String[] campos = registro.split(";");
        Pessoa pessoa = new Pessoa(campos[0]);
        return pessoa;
    }

    public List<Pessoa> ordenaPorNome(List<Pessoa> pessoa){
        pessoa.sort((Pessoa a, Pessoa b) -> a.getNome().compareTo(b.getNome()));
        return pessoa;
    }
}

