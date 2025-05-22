/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_mascotas_v0_01;

/**
 *
 * @author thebe
 */
public class Gato extends Mascota {
    public Gato(String nombre, int edad) {
        super(nombre, edad, "Gato");
    }

    @Override
    public void emitirSonido() {
        System.out.println("Miau");
    }
}