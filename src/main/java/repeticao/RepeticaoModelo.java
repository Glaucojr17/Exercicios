package repeticao;

import java.util.Scanner;

public class RepeticaoModelo {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o numero da tabuada:");
        int numeroDaTabuada = input.nextInt();

        for (int contador=1; contador <= 10; contador++ ) {
            int valorResultado = numeroDaTabuada * contador;
            System.out.println(numeroDaTabuada + " X " + contador + " = " + valorResultado);
            }
        input.close();

    }

}
