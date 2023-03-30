package entities;

import java.util.List;
import java.util.Objects;

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

    @Override
    public void imprimir() {
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Inscrição Estadual: " + getInscricaoEstadual());
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("Telefone: " + getTelefone());
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PessoaJuridica that = (PessoaJuridica) o;
        return Objects.equals(cnpj, that.cnpj) && Objects.equals(inscricaoEstadual, that.inscricaoEstadual) && Objects.equals(telefone, that.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cnpj, inscricaoEstadual, telefone);
    }
}
