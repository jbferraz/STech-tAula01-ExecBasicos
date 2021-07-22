/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taula01.execbasicos;

import javax.swing.JOptionPane;

/**
 *
 * @author jairb
 */
public class exec06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * 6. Desenvolva um algoritmo em Java que leia um número inteiro e 
         * imprima o seu antecessor e seu sucessor.
         */
        int num;
        
        num = Integer.parseInt(
                JOptionPane.showInputDialog(null,"Informe um num. inteiro"));
        JOptionPane.showMessageDialog(null, "Num antecessor é: " + (num - 1) + 
                "\nNum digitado foi: " + num +
                "\nNum sucessor é: " + (num+1));
    }
    
}
