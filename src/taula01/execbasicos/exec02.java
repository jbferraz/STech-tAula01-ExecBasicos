/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taula01.execbasicos;

/**
 *
 * @author jairb
 */
public class exec02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Fazer um programa que imprima a média aritmética dos 
        //números 8,9 e 7. A média dos números 4, 5 e 6. A soma 
        //das duas médias. A média das médias

        double m1, m2, soma, mg;

        m1 = (8 + 9 + 7) / 3;
        m2 = (4 + 6 + 6) / 3;
        soma = m1 + m2;
        mg = soma / 2;
        
        System.out.println("A média dos valores 8,9 e 7 é: " + m1);
        System.out.println("A média dos valores 4, 5 e 6 é: " + m2);
        
        System.out.println("A soma das duas médias é: "+ soma);
        System.out.println("A média geral é: " + mg);
    }

}
