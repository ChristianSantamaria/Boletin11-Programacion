/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin11 {


    public static void main(String[] args) {
        // TODO code application logic here
        Tempo fechainicio = new Tempo();
        String frase = JOptionPane.showInputDialog("ESCRIBE A SEGUINTE FRASE : A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática ");
        JOptionPane.showMessageDialog(null, "PREME ENTER PARA REMATAR ");
        Date fin = new Date();
        System.out.println("TARDACHES " + fechainicio.diferencia(fin) + "s TEMPO EN ESCRIBIR A FRASE");
    }

}
