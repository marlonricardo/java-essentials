package com.mro;
public class EstruturaSelecao {
    public static void main(String[] args) {
        int hour = 20;

        //Condicionais if/else
        if(hour > 0 && hour < 12){
            System.out.println("Bom dia!");
        }else if(hour >= 12 && hour < 18){
            System.out.println("Boa tarde!");
        }else if(hour >= 18 && hour <= 23){
            System.out.println("Boa noite!");
        }else{
            System.out.println("Hora inválida!");
        }

        System.out.println();

        //Switch Structure
        int month = 3;
        int days;
        //Inside switch, we need to add the variable that will be analyzed. Less used than if/else
        //switch is used only when you need to test equality, byte, short, char or int are allowed - String and Enum
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 0;
                System.out.println("Inválido!");
        }
        System.out.println(days + " dias");
    }
}
