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
public class exec03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //3. Informar um saldo e imprimir o saldo com reajuste de 1%.
        double saldo;

        saldo = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Informe seu saldo"));
        JOptionPane.showMessageDialog(null, "Saldo atualizado em 1% é de: "
                + String.format("%,.2f", saldo * 1.01));
    }

}
