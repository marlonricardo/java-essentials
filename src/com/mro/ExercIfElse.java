package com.mro;
/*Escreva um programa que imprime na saída os valores assumidos por x
* Esta variável x deve iniciar com algum valor escolhido por você
* Se x for par, x deve receber o valor dele mesmo somado com 5
* Se x for ímpar, x deve receber o valro dele multiplicado por 2
* Utilize a estrutura if-else para resolver o exercício
* */

import java.util.Scanner;

public class ExercIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o número de x: ");
        int x = scan.nextInt();

        if(x < 0){
            System.out.println("Você deve escolher um valor maior que zero!");
        }else if(x % 2 == 0){
            x += 5;
            System.out.println(x);
        }else{
            x *= 2;
            System.out.println(x);
        }




    }
}
