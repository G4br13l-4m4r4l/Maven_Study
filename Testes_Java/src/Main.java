import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
    P4 - As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia,
    e R$ 1,00 se forem compradas pelo menos 12.
    Escreva um algoritmo (sequência de passos) que leia o número de maçãs compradas,
    calcule e escreva o custo total da compra.
 */

        double menosDoze = 1.30;
        double dozeOuMais = 1.00;
        double valorFinal = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite quantos serão comprados: ");
        int total = input.nextInt();
        for (int i = 1; i <= total; i++) {
            if(total< 12){
                valorFinal += menosDoze;
            }else{
                valorFinal+=dozeOuMais;
            }
        }

        System.out.printf("O valor total ficou: R$ %.2f",valorFinal);

    }
}

