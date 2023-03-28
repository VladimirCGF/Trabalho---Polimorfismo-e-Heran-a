package entities;

import java.util.List;

public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String inscricaoEstadual;
    private String telefone;

    public PessoaJuridica() {

    }


    public PessoaJuridica(Integer id, String nome, String email, String cnpj, String inscricaoEstadual, String telefone) {
        super(id, nome, email);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public static void cadastrar(List<Pessoa> pessoas, Integer id, String nome, String email, String inscricaoEstadual, String cnpj, String telefone) {
        PessoaJuridica pessoaJuridica = new PessoaJuridica(id, nome, email, inscricaoEstadual, cnpj, telefone);
        pessoas.add(pessoaJuridica);
    }

    @Override
    public String toString() {
        return "\nid: " + getId() +
                "\nNome: " + getNome() +
                "\nEmail: " + getEmail() +
                "\nInscrição Estatual: " + getInscricaoEstadual() +
                "\nCNPJ: " + getCnpj() +
                "\nTelefone: " + getTelefone();

    }
}
