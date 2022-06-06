import java.util.Scanner;
import java.util.regex.*;

// Exercícios para fazer apenas com uma classe, com o método main e que pode utilizar métodos auxiliares (da mesma classe)
// Estes exercícios servem para praticar a escrita de código em Java, visto que estes programas seguem uma forma mais próxima
// dos programas em C que da programação por objetos

public class ExerciciosI {

    // Tomohiko Sakamoto Algorithm
    public static int dia_da_semana(int y, int m, int d) {
        int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
        if (m < 3) y -= 1;
        return (y + y / 4 - y / 100 + y / 400 + t[m - 1] + d) % 7;
    }

    public static boolean isPrime(int n) {

        if (n <= 1) return false;
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) throws java.lang.Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduz o número da pergunta: ");
        int num = input.nextInt();

        switch(num) {
            case 1: {
                // Escrever um programa que, dada uma data em dia (1..31), mês (1..12) e ano
                // calcule o dia da semana dessa data
                System.out.println("Introduz uma data no formato DD/MM/AAAA");
                String data = input.next();
                String regex = Pattern.quote("/");
                String[] arr = data.split(regex);

                Integer dia = Integer.valueOf(arr[0]);
                Integer mes = Integer.valueOf(arr[1]);
                Integer ano = Integer.valueOf(arr[2]);

                int value = dia_da_semana(ano, mes, dia);

                switch(value) {
                    case 0: System.out.println("Domingo.");         break;
                    case 1: System.out.println("Segunda-feira.");   break;
                    case 2: System.out.println("Terça-feira.");     break;
                    case 3: System.out.println("Quarta-feira.");    break;
                    case 4: System.out.println("Quinta-feira.");    break;
                    case 5: System.out.println("Sexta-feira.");     break;
                    case 6: System.out.println("Sábado.");          break;
                }
                break;
            }
            case 2: {
                // Programa que determine a soma de duas datas em dias, horas, minutos e segundos
                System.out.println("Introduz uma data no formato DD-HH-MM-SS");
                String data1 = input.next();
                String regex = Pattern.quote("-");
                String[] arr1 = data1.split(regex);

                System.out.println("Introduz outra data no formato DD-HH-MM-SS");
                String data2 = input.next();
                String[] arr2 = data2.split(regex);

                Integer dia1 = Integer.valueOf(arr1[0]);
                Integer hora1 = Integer.valueOf(arr1[1]);
                Integer min1 = Integer.valueOf(arr1[2]);
                Integer sec1 = Integer.valueOf(arr1[3]);

                Integer dia2 = Integer.valueOf(arr2[0]);
                Integer hora2 = Integer.valueOf(arr2[1]);
                Integer min2 = Integer.valueOf(arr2[2]);
                Integer sec2 = Integer.valueOf(arr2[3]);

                if ((sec1 + sec2) >= 60) {
                    sec1 = 0;
                    min1++;
                } else sec1 += sec2;

                if ((min1 + min2) >= 60) {
                    min1 = 0;
                    hora1++;
                } else min1 += min2;

                if ((hora1 + hora2 >= 24)) {
                    hora1 = 0;
                    dia1++;
                } else hora1 += hora2;

                dia1 += dia2;
                System.out.println(dia1.toString() + " dias " + hora1.toString() + " horas " + min1.toString() + " minutos e " + sec1.toString() + " segundos");
                break;
            }
            case 3: {
                // Programa que aceite n classificações (números reais) de uma UC, e indique o número de classificações em
                // cada um dos intervalos: [0, 5[ ; [5, 10[ ; [10, 15[ ; [15, 20[
                
                System.out.println("Introduza o número de classificações que quer introduzir: ");
                int quantidade = input.nextInt();

                int zeroAcinco = 0;
                int cincoAdez = 0;
                int dezAquinze = 0;
                int quinzeAvinte = 0;

                for (int i = 0; i < quantidade; i++) {
                    System.out.println("Introduza uma classificação:");
                    int n = input.nextInt();

                    if (n < 5) zeroAcinco++;
                    else if (n < 10) cincoAdez++;
                    else if (n < 15) dezAquinze++;
                    else quinzeAvinte++;
                }

                System.out.printf("Número de classificações no intervalo [0, 5[  : %d%n", zeroAcinco);
                System.out.printf("Número de classificações no intervalo [5, 10[ : %d%n", cincoAdez);
                System.out.printf("Número de classificações no intervalo [10, 15[: %d%n", dezAquinze);
                System.out.printf("Número de classificações no intervalo [15, 20[: %d%n", quinzeAvinte);
    
                break;
            }
            case 6: {
                // Programa que lê um inteiro n e imprime todos os números primos inferiores a n
                System.out.println("Introduza um inteiro: ");
                int n = input.nextInt();

                for (int i = 0; i < n; i++) {

                    if (isPrime(i))
                        System.out.println(i);

                    if (i == n-1) {
                        System.out.println("Repetir o programa [s/n]");
                        String op = input.next();

                        if (op.equals("s")) {
                            System.out.println("Introduza um inteiro: ");
                            n = input.nextInt();
                            i = 0;
                        }
                    }
                }

                break;
            }
        }
        input.close();
    }
}

// Java development kit: https://www.oracle.com/java/technologies/downloads/
// Packages https://docs.oracle.com/javase/8/docs/api/ 