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
public class TAula01ExecBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade, meses, dias, idDias;
        
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade"));
        meses = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe quantos meses deste seu ultimo niver"));
        dias = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe quantos dias deste no ultimo mês"));

        idDias = (idade * 365) + (meses * 30) + dias;

        JOptionPane.showMessageDialog(null, idade + " anos, " + meses + " meses e " 
                + dias+ " dias = " + idDias + " dias.");
        //3 anos, 2 meses e 15 dias = 1170 dias.
    }

}
