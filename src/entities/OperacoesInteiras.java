package entities;

public class OperacoesInteiras extends Matematica {


    public int subtracao2(int a, long b) {
        return super.subtracao2(a, (int) b);
    }

    public int subtracao2(int a, float b) {
        return super.subtracao2(a, (int) b);
    }

    public int multiplicacao2(float a, double b) {
        return super.multiplicacao2((int) a, (int) b);
    }

    public int divisao2(int a, Double b) {
        return super.divisao2(a, (int) b.doubleValue());
    }
}
