package entities;

import java.util.List;
import java.util.Objects;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private String celular;

    public PessoaFisica() {

    }

    public PessoaFisica(Integer id, String nome, String email, String cpf, String celular) {
        super(id, nome, email);
        this.cpf = cpf;
        this.celular = celular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public void imprimir() {
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("CPF: " + getCpf());
        System.out.println("Celular: " + getCelular());
    }

    public static void cadastrar(List<Pessoa> pessoas, Integer id, String nome, String email, String cpf, String celular) {
        PessoaFisica pessoaFisica = new PessoaFisica(id, nome, email, cpf, celular);
        pessoas.add(pessoaFisica);
    }

    @Override
    public String toString() {
        return "\nid: " + getId() +
                "\nNome: " + getNome() +
                "\nEmail: " + getEmail() +
                "\nCPF: " + getCpf() +
                "\nCelular: " + getCelular();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PessoaFisica that = (PessoaFisica) o;
        return Objects.equals(cpf, that.cpf) && Objects.equals(celular, that.celular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cpf, celular);
    }
}
