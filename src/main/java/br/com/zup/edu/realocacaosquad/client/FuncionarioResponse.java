package br.com.zup.edu.realocacaosquad.client;

public class FuncionarioResponse {

    private final Long id;
    private final String nome;
    private final String cpf;
    private final Cargo cargo;

    public FuncionarioResponse(Long id, String nome, String cpf, Cargo cargo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Cargo getCargo() {
        return cargo;
    }
}
