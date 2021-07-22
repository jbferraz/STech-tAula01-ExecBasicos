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
public class exec05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * 5. Crie um algoritmo que leia o valor do salário mínimo e o valor 
         * do salário de um usuário, calcule a quantidade de salários mínimos 
         * esse usuário ganha e imprima o resultado. (1SM=R$788,00)
         */
        
        double salMinino, salUser, result;
        
        salMinino = Double.parseDouble(
                JOptionPane.showInputDialog(null,"Informe o valor Salário minimo"));
        salUser = Double.parseDouble(
                JOptionPane.showInputDialog(null,"Informe o valor do seu Salário"));
        
        result = salUser/salMinino;
        JOptionPane.showMessageDialog(null, String.format("%,.1f", result) + 
                "SM=R$ " + String.format("%,.2f",salUser));
    }
    
}
