package com.mro;

public class ExercVehicle {
    public static void main(String[] args) {
        int velocidadePermitida = 80;
        int velocidadeVeiculo = 101;
        int velocidadeConsiderada;
        int valorMulta = 0;

        if(velocidadePermitida < velocidadeVeiculo) {
            if (velocidadePermitida < 100) {
                velocidadeConsiderada = velocidadeVeiculo + 7;
            } else {
                velocidadeConsiderada = velocidadeVeiculo * (int) (velocidadeVeiculo * 0.1);
            }

            int diferenca = velocidadeConsiderada - velocidadePermitida;

            valorMulta = diferenca * 10;
        }else {
            valorMulta = 0;
        }

            System.out.println("Valor da multa: " + valorMulta);
    }
}
