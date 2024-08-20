import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o Primeiro Numero");
        int parametroUm = scan.nextInt();
        System.out.println("Digite o Segundo Numero");
        int parametroDois = scan.nextInt();

        try {
            contar(parametroUm,parametroDois);
            System.out.println("Primeiro Numero: " + parametroUm + " Segundo Numero: " + parametroDois);
        }catch (ParametrosInvalidosException e){
            e.printStackTrace();
            System.out.println("O primeiro Numero deve ser menor que o Segundo");
        }
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (parametroUm = parametroUm; parametroUm <= parametroDois; parametroUm++) System.out.println("Contando " + parametroUm); {

        }
    }
}
