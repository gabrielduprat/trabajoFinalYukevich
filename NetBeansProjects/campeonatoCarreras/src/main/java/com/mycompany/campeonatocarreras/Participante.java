/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campeonatocarreras;
import java.util.*;
/**
 *
 * @author Gabriel
 */
public class Participante {
   String categoria;
   String matricula;
   int numeroInscripcion;
   Pasajero pasajeros[];
   Horario horarios[]; // Map para almacenar horarios por etapa

    public Participante(String categoria, String matricula, int numeroInscripcion, Pasajero pasajeros[], Horario horarios[]) {
        this.categoria = categoria;
        this.matricula = matricula;
        this.numeroInscripcion = numeroInscripcion;
        this.pasajeros = pasajeros;
        this.horarios = horarios;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }

    public Horario[] getHorarios() {
        return horarios;
    }
   
}
