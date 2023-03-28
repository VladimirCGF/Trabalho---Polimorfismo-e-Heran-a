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

        List<Pessoa> pessoas = new ArrayList<>();

        PessoaFisica.cadastrar(pessoas, 1, "Vladimir", "Vladimir@gmail.com", "069.445.491-58", "99239-6589");
        PessoaJuridica.cadastrar(pessoas, 1, "Vladimir", "Vladimir@gmail.com", "SeiLa","123.123.123","7070-7070");
        pessoas.forEach(System.out::println);

        sc.close();
    }
}
