/*Faça um programa que receba 3 números inteiros e retorne o maior entre
eles seguido de "eh o maior". Use a seguinte fórmula:*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior =0;

        System.out.println( "Digite 3 números inteiros: ");
        String numeros = sc.nextLine();
        String[] number = numeros.split(" ");

        int a = Integer.parseInt(number[0]);
        int b = Integer.parseInt(number[1]);
        int c = Integer.parseInt(number[2]);

        //não entendi como a função retornaria o maior utilizando apenas 2 dos numeors e fiz assim!
        if((a<b)&&(c<b)){
            maior = b;
        }else if((a<c)&&(b<c)){
            maior = c;
        }else if((b<a)&&(c<a)) {
            maior = a;
        }
        System.out.println(maior + " eh o maior");




    }
}
