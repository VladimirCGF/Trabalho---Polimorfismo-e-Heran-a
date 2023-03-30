package application;

import entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa(1, "Vladimir", "Vladimir@Gmail.com");
        PessoaFisica pessoaFisica = new PessoaFisica(1, "Coutinho", "Coutinho@Gmail.com", "069.445.491-58", "99239-6589");
        PessoaJuridica pessoaJuridica = new PessoaJuridica(1, "Gimenes", "Gimenes@Gmail.com", "00.394.460/0058-87", "123.123.123", "7070-7070");

        imprimir(pessoa);
        imprimir(pessoaFisica);
        imprimir(pessoaJuridica);

        sc.close();
    }

    public static void imprimir(Pessoa pessoa) {
        System.out.println("\nID: " + pessoa.getId());
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Email: " + pessoa.getEmail());
        if (pessoa instanceof PessoaFisica pessoaFisica) {
            System.out.println("CPF: " + ((PessoaFisica) pessoa).getCpf());
            System.out.println("Celular: " + pessoaFisica.getCelular());
        } else if (pessoa instanceof PessoaJuridica pessoaJuridica) {
            System.out.println("CNPJ: " + ((PessoaJuridica) pessoa).getCnpj());
            System.out.println("Inscrição Estatual: " + pessoaJuridica.getInscricaoEstadual());
            System.out.println("Telefone: " + pessoaJuridica.getTelefone());
        }
    }
}
