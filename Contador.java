import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner parametro = new Scanner(System.in);
        System.out.println("Digite o Primeiro Número");
        int parametroUm = parametro.nextInt();
        System.out.println("Digite o Segundo Número");
        int parametroDois = parametro.nextInt();

        try{
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e){
            System.out.println("O segundo número deve ser maior que o primeiro inserido no sistema!");
        }
    }

    static void contar(Integer parametroUm, Integer parametroDois) throws ParametrosInvalidosException{

        if(parametroUm >= parametroDois){
             throw new ParametrosInvalidosException();
        }

        Integer contagem = parametroDois - parametroUm;

        for(int i= 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }



    }
}
