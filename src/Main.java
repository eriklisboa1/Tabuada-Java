import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void LimparTela() {
        for (int i = 0; i < 30; i++) {
            System.out.println("");
        }
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int a, b;
        boolean run = true;
        while (run) {
            System.out.println("1-SOMAR:\n2-MULTPLICAR:\n3-SUBTRAIR:\n4-DIVIDIR:\n5-SAIR:\n");
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    //LimparTela();
                    System.out.println("Digite o primeiro Valor: ");
                    a = scanner.nextInt();
                    int somar = somar(a);
                    break;
                case 2:
                    // LimparTela();
                    System.out.println("Digite o primeiro Valor: ");
                    a = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Digite o primeiro Valor: ");
                    a = scanner.nextInt();
                    int subtrair = subtrair(a);
                    //LimparTela();
                    break;
                case 4:
                    System.out.println("Digite o primeiro Valor: ");
                    float i = scanner.nextInt();
                    float dividir = dividir(i);
                    //LimparTela();
                    break;
                case 5:
                    run = false;
                    LimparTela();
                    System.out.println("Programa Encerreado");
                    break;
                default:
                    LimparTela();
                    System.out.println("Digite uma opção correta:");
                    break;
            }
        }
    }


    public static int somar(int a) {
        int resul = 0;
        for (int i = 0; i < 10; i++) {
            resul = a + i;
            System.out.println(a + " + " + i + " = " + resul);
        }
        return resul;
    }

    public static int subtrair(int a) {
        int resul = 0;
        for (int i = 0; i < 10; i++) {
            resul = a - i;
            System.out.println(a + " - " + i + " = " + resul);
        }
        return resul;
    }

    public static int multiplicar(int a) {
        int resul = 0;
        for (int i = 0; i < 10; i++) {
            resul = a * i;
            System.out.println(a + " * " + i + " = " + resul);
        }
        return resul;
    }

    public static float dividir(float a) {
        float resul = 0;
        for (int i = 0; i < 10; i++) {
            resul = a / i;
            System.out.println(a + " / " + i + " = " + resul);
        }
        return resul;
    }

}
