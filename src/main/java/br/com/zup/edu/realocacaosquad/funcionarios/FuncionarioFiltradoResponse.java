package br.com.zup.edu.realocacaosquad.funcionarios;

import br.com.zup.edu.realocacaosquad.client.FuncionarioResponse;

public class FuncionarioFiltradoResponse {

    private final Long id;
    private final String nome;
    private final String cpf;
    private final CargoDoFuncionario cargo;

    public FuncionarioFiltradoResponse(FuncionarioResponse funcionario) {
        this.id = funcionario.getId();
        this.nome = funcionario.getNome();
        this.cpf = funcionario.getCpf();
        this.cargo = CargoDoFuncionario.valueOf(funcionario.getCargo().name());
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

    public CargoDoFuncionario getCargo() {
        return cargo;
    }
}
