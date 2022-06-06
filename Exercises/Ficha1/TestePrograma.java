import java.util.Scanner;

public class TestePrograma {
    public static void main(String[] args) {

        // Inicialização do scanner
        Scanner input = new Scanner(System.in);
        ExerciciosII f = new ExerciciosII(); // criar um objeto da classe que implementa os métodos

        System.out.println("Introduz o número da pergunta: ");
        int num = input.nextInt();

        switch(num) {
            case 1: {
                // lê um valor de temperatura em graus celsius e devolve em farenheit
                System.out.println("Introduza uma temperatura em graus Celsius:");
                double tempC = input.nextDouble();
                double tempF = f.celsiusParaFarenheit(tempC);
                System.out.printf("Temperatura em Farenheit: %f%n", tempF);
                break;
            }
            case 2: {
                //  Ler dois valores inteiros e invocar um método que determine o máximo dos dois
                System.out.println("Introduza um inteiro:");
                int a = input.nextInt();
                System.out.println("Introduza outro inteiro:");
                int b = input.nextInt();

                int max = f.maximoNumeros(a, b);

                System.out.printf("O número maior é: %d%n", max);

                break;
            }
            case 3: {
                // Ler um nome e um saldo e imprimir um texto com os valores obtidos na leitura
                System.out.println("Introduza um nome:");
                String nome = input.next();
                System.out.println("Introduza um saldo:");
                double saldo = input.nextDouble();

                String info = f.criaDescricaoConta(nome, saldo);
                System.out.println(info);

                break;
            }
            case 4: {
                // chato
                break;
            }
            case 5: {
                
                break;
            }
            case 6: {
                long a = f.factorial(5);
                break;
            }
            case 7: {
                // Determina a data e a hora do sistema, calcule o fatorial de 5000 e determine a hora após tal ciclo
                long duration = f.tempoGasto();
                System.out.println(duration);
                break;
            }
        }

        input.close();
    }

}