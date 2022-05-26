import java.util.Scanner;

/*Faça um programa que pergunte em que turno você Trabalha.
Peça para digitar: (vale 2 pontos)
M-matutino
V-vespertino
N-noturno.
Imprima a mensagem “Bom dia!” ou “Boa Tarde” ou “Boa Noite” ou “Valor
inválido”, conforme o caso.*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual turno você trabalha: ");
        System.out.println("M - Matutino");
        System.out.println("V - Vespertino");
        System.out.println("N - Noturno");

        String turno = sc.nextLine();

        if(turno.equals("m")){
            System.out.println("Bom Dia!");
        }else if(turno.equals("v")) {
            System.out.println("Bom Tarde!");
        }else if(turno.equals("n")){
            System.out.println("Boa Noite!");
        }else{
            System.out.println("Valor Inválido");
        }


    }
}
