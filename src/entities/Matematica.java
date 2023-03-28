package entities;

public class Matematica {

    public static void play() {

        Matematica matematica = new Matematica();

        System.out.println("Soma de 2: " + matematica.soma2(2, 2));
        System.out.println("Soma de 3: " + matematica.soma3(3, 3, 3));
        System.out.println("Soma de 4: " + matematica.soma4(4, 4, 4, 4));
        System.out.println("Subtração de 2: " + matematica.subtracao2(10, 2));
        System.out.println("Subtração de 3: " + matematica.subtracao3(20, 5, 3));
        System.out.println("Subtração de 4: " + matematica.subtracao4(100, 50, 25, 10));
        System.out.println("Multiplicação de 2: " + matematica.multiplicacao2(5, 2));
        System.out.println("Multiplicação de 3: " + matematica.multiplicacao3(3, 4, 5));
        System.out.println("Multiplicação de 4: " + matematica.multiplicacao4(2, 2, 2,2));
        System.out.println("Divisão de 2: " + matematica.divisao2(25, 5));
        System.out.println("Divisão de 3: " + matematica.divisao3(50, 2, 1));
        System.out.println("Divisão de 4: " + matematica.divisao4(100, 2, 2, 2));

        OperacoesInteiras operacoesInteiras = new OperacoesInteiras();

        System.out.println("Subtração de 2: " + operacoesInteiras.subtracao2(10 ,2));
        System.out.println("Subtração de 2: " + operacoesInteiras.subtracao2(20 ,2));
        System.out.println("Multiplicação de 2: " + operacoesInteiras.multiplicacao2(5, 2));
        System.out.println("Divisão de 2: " + operacoesInteiras.divisao2(25, 5));

    }

    public int soma2(int a, int b) {
        return a + b;
    }

    public int soma3(int a, int b, int c) {
        return a + b + c;
    }

    public int soma4(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // Operação de subtração
    public int subtracao2(int a, int b) {
        return a - b;
    }

    public int subtracao3(int a, int b, int c) {
        return a - b - c;
    }

    public int subtracao4(int a, int b, int c, int d) {
        return a - b - c - d;
    }

    // Operação de multiplicação
    public int multiplicacao2(int a, int b) {
        return a * b;
    }

    public int multiplicacao3(int a, int b, int c) {
        return a * b * c;
    }

    public int multiplicacao4(int a, int b, int c, int d) {
        return a * b * c * d;
    }

    // Operação de divisão
    public int divisao2(int a, int b) {
        return a / b;
    }

    public int divisao3(int a, int b, int c) {
        return a / b / c;
    }

    public int divisao4(int a, int b, int c, int d) {
        return a / b / c / d;
    }

}
