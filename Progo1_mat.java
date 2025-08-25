package com.mycompany.aula1;
import java.util.Scanner;



public class Progo1_mat {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double numero1, numero2, resultado = 0;
        String operador, continuar;
        
        System.out.print("Digite o primeiro número: ");
        numero1 = ler.nextInt();
        
        System.out.print("Digite o Operador: ");
        operador = ler.next();
        
        System.out.print("Digite o segundo número: ");
        numero2 = ler.nextDouble();
        
        if(operador.equals("+")){
            resultado = numero1 + numero2;
        }else if(operador.equals("-")){
            resultado = numero1 - numero2;
        }else if(operador.equals("*")){
            resultado = numero1 * numero2;
        }else if(operador.equals("/")){
            if (numero2 != 0) {
             resultado = numero1 / numero2;
        }else {
            System.out.println("Erro! Divisão por zero não é permitida.");
        }
        }
        
        System.out.print("Seu resultado é " + resultado);
        
        //System.out.print("\nDeseja fazer outro cálculo? (s/n): ");
        //continuar = ler.next();
        
        //while(continuar.equalsIgnoreCase("s"));
        
        //System.out.println("Calculadora encerrada. Até mais!");
    }
}
