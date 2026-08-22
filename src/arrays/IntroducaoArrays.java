package arrays;
import java.util.Arrays;

public class IntroducaoArrays {
    public static void main(String[]args) {
        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 30;

        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println(numeros[0]);
        System.out.println(numeros[2]);
        System.out.println(numeros[4]);
        numeros[1] = 200;
        numeros[3] = 400;
        System.out.println(numeros[1]);
        System.out.println(numeros[3]);
        System.out.println(Arrays.toString(numeros));

        double[] notas = new double[4];
        notas[0] = 7.5;
        notas[1] = 8.0;
        notas[2] = 6.5;
        notas[3] = 9.0;
        System.out.println(Arrays.toString(notas));
        System.out.println(notas.length);
        System.out.println(notas[notas.length-1]);

    }
}
