/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import java.util.Date;

/**
 *
 * @author csantamariacameselle
 */
public class Tempo {

    private final Date hoy = new Date();

    public long diferencia(Date fin) {
        return (fin.getTime() - hoy.getTime()) / 1000;
    }
}
