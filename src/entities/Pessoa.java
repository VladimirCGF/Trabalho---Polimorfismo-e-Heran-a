package entities;

import java.util.List;
import java.util.Objects;

public class Pessoa {

    private Integer id;
    private String nome;
    private String email;

    public Pessoa() {
    }
    public Pessoa(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void imprimir() {
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
    }

    public void cadastrar(List<Pessoa> pessoas, Integer id, String nome, String email) {
        Pessoa pessoa = new Pessoa(id, nome, email);
        pessoas.add(pessoa);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id) && Objects.equals(nome, pessoa.nome) && Objects.equals(email, pessoa.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email);
    }

    @Override
    public String toString() {
        return "\nid: " + id +
                "\nNome: " + nome +
                "\nEmail: " + email;

    }
}
