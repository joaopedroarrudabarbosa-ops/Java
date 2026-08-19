package exercicios;

public class SistemaAcesso {
    public static void main(String[]args) {
        int idade = 20;
        boolean temIngresso = true;
        boolean estaBloqueado = false;

        if (idade >= 18 && temIngresso && !estaBloqueado) {
            System.out.println("Acesso Permitido!");
        }
        else {
            System.out.println("Acesso Negado");
        }
    }
}
