
package com.mycompany.bolean;

import javax.swing.JOptionPane;


public class Bolean {

    public static void main(String[] args) {
        int entera=1011223344;
        float decimal=1255.5555f;
        double decimal_Extensa=1255.5556667778899;
        boolean comprador= decimal_Extensa<decimal;
        JOptionPane.showMessageDialog(null,"Nuestra variable \n" +comprador);
    }
}
