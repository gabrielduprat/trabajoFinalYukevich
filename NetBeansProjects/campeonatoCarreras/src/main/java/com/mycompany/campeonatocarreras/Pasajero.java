/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campeonatocarreras;

/**
 *
 * @author Gabriel
 */
public class Pasajero {
   String nombreApellido;
   String dni;
   String fechaNacimiento;

    public Pasajero(String nombreApellido, String dni, String fechaNacimiento) {
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Pasajero() {
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public String getDni() {
        return dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    
}
