// FOR TRADICIONAL PERCORRE O ARRAY SALVANDO O INDICE
// FOR-EACH PERCCORE O ARRAY IMPRIMINDO APENAS O ARRAY, SEM SALVAR INDICE

package arrays;

public class PercorrendoArrays {
    public static void main(String[]args) {

        int soma = 0;
        int[] numeros = {10, 20, 30, 40, 50};
        for (int i = 0; i < numeros.length; i++) { // ARRAY CRESCENTE
            System.out.println(numeros[i]);
            soma += numeros[i];
        }

        for (int i = numeros.length-1; i >= numeros.length; i--) { // ARRAY DECRESCENTE
            System.out.println(numeros[i]);
        }
        System.out.println("Soma: "+soma);

        int[] valores = {5, 8, 12, 20, 7};
        int soma1 = 0;
        for (int i = 0; i < valores.length; i++) {
            soma1 += valores[i];
        }
        System.out.println("Soma dos valores: "+soma1);

        int[] numeros1 = {7, 12, 3, 20, 15, 4};
        int quantidade = 0;
        for (int i = 0; i < numeros1.length; i++) {
            if (numeros1[i] > 10) {
                quantidade++;
            }
        }
        System.out.println("Quantidade de valores maiores que 10: "+quantidade);

        int[] numeros2 = {25, 8, 42, 13, 7, 31};
        int maior = numeros2[0];
        int menor = numeros2[0];

        for (int i = 1; i < numeros2.length; i++) {
            if(numeros2[i] > maior) {
                maior = numeros2[i];
            }
            if (menor > numeros2[i]) {
                menor = numeros2[i];
            }
        }
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);

        String[] nomes = {"Ana", "Carlos", "Pedro", "Maria"};
        for (String nome : nomes) { // USADO PARA QUANDO PRECISAR SO IMPRIMIR A LISTA
            System.out.println(nome); // O NOME SERIA SO UMA VARIAVEL TEMPORARIA, RECEBENDO A CADA VOLTA UM ELEMENTO DO NOMES
        }

        int[] valores1 = {5, 10, 15, 20, 25};
        for (int i = 0; i < valores1.length; i++) {
            valores1[i] += 10;
            System.out.println(valores1[i]);
        }

        int[] numeros4 = {5, 12, 8, 20, 3, 15};
        for (int i = 0; i < numeros4.length; i++) {
            if (numeros4[i] > 10) {
                numeros4[i] *= 2;
            }
            System.out.println(numeros4[i]);
        }
    }
}
