/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campeonatocarreras;

/**
 *
 * @author Gabriel
 */
public class Horario {
   String partida;
   String llegada;

    public Horario(String partida, String llegada) {
        this.partida = partida;
        this.llegada = llegada;
    }

    public String getPartida() {
        return partida;
    }

    public String getLlegada() {
        return llegada;
    }
   
}
