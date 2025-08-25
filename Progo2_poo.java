package com.mycompany.oracle_7;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Progo2_poo {

    public static void main(String[] args) {
        Classe_teste.testando();
        
        Scanner ler = new Scanner(System.in);
        Classe_teste p1 = new Classe_teste("Bubba", 2.08, 4);
        Classe_teste p2 = new Classe_teste("Twitch", 1.73, 3, 2);
        
//        p1.setFields("Bubba", 2.08, 4);
//        p2.setFields("Twitch", 1.73, 3);
        
        System.out.println(p1.getNome() + " " + p1.getAltura() + " " + p1.getSentença());
        System.out.println(p2.getNome() + " " + p2.getAltura() + " " + p2.getSentença() + " " + p2.getNumber());
        
    }
}
