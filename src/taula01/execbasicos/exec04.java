/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taula01.execbasicos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author jairb
 */
public class exec04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * 4. Escrever um algoritmo que lê: - a porcentagem do IPI a ser
         * acrescido no valor das peças - 
         * o código da peça 1, valor unitário da peça 1, quantidade de peças 1
         * o código da peça 2, valor unitário da peça 2, quantidade de peças 2 
         * O algoritmo deve calcular o valor total a ser pago e apresentar 
         * o resultado. Fórmula : 
         * (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
         */
        double ipi, valor1, valor2, result;
        int quant1, quant2;
        DecimalFormat df = new DecimalFormat("0.00");

        ipi = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Informe o % de IPI"));
        JOptionPane.showInputDialog(null,"Informe o código do Prod. 1");
        valor1 = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Informe o valor un. do Prod. 1"));
        quant1 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Informe a quant. do Prod. 1"));
        JOptionPane.showInputDialog(null,"Informe o código do Prod. 2");
        valor2 = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Informe o valor un. do Prod. 2"));
        quant2 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Informe a quant. do Prod. 2"));
        result = (valor1*quant1 + valor2*quant2)*(ipi/100 + 1);
        
        //String.format
        JOptionPane.showMessageDialog(null,"O valor final é: R$ " + 
                String.format("%,.2f", result));
        //DecimalFormat
        JOptionPane.showMessageDialog(null,"2.0 O valor final é: R$ " + 
                df.format(result));
    }

}
