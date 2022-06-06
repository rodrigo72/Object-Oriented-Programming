import java.io.*;

public class ExerciciosII {
    public double celsiusParaFarenheit (double graus) {
        return (1.8 * graus + 32);
    }

    public int maximoNumeros(int a, int b) {
        if (a > b)
            return a;
        return b;
    }

    public String criaDescricaoConta (String nome, double saldo) {
        // int n = (int) saldo;
        String info = "Nome: " + nome + "; Saldo: " + saldo; 
        return info;
    }

    public long factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public long tempoGasto() {
        long start = System.currentTimeMillis();
        long a = factorial(50000);
        long end = System.currentTimeMillis();
        long temp = end - start;
        return temp;
    }
}
