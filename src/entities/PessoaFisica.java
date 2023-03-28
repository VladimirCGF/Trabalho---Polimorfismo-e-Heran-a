package entities;

import java.util.List;

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
}
