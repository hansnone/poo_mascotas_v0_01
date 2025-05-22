/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_mascotas_v0_01;

/**
 *
 * @author thebe
 */
public class Periquito extends Mascota {
    public Periquito(String nombre, int edad) {
        super(nombre, edad, "Periquito");
    }

    @Override
    public void emitirSonido() {
        System.out.println("Pío pío");
    }
}
