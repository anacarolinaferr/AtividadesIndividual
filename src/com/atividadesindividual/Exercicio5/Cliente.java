package com.atividadesindividual.Exercicio5;

public class Cliente {
    private Integer id;
    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private String telefone;

    public Cliente(Integer id, String nome, String cpf, String endereco, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    public static boolean nomeValido(String nome) {
        boolean resultado = (nome.length() > 3 && nome.length() < 50) ? true : false;
        return resultado;
    }

    public static boolean cpfValido(String cpf) {
        ValidaCPF validaCPF = new ValidaCPF();
        boolean resultado = validaCPF.isCPF(cpf);
        return resultado;
    }

    public static boolean emailValido(String email) {
        boolean resultado = (email.contains("@")) ? true : false;
        return resultado;
    }

    public static boolean telefoneValido(String telefone) {
        String telefone_sem_mask = telefone.replace(" ", "").replace("-", "");
        boolean resultado = (telefone_sem_mask.length() == 11) ? true : false;
        return resultado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + "\'" +
                ", cpf='" + cpf + "\'" +
                ", endereco='" + endereco + "\'" +
                ", email='" + email + "\'" +
                ", telefone='" + telefone + "\'" +
                '}';
    }
}
