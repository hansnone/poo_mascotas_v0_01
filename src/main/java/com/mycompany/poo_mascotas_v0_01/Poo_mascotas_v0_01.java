/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo_mascotas_v0_01;
import java.util.ArrayList;

public class Poo_mascotas_v0_01 {
    public static void main(String[] args) {
        // Crear lista de mascotas
        ArrayList<Mascota> mascotas = new ArrayList<>();
        
        // Agregar diferentes tipos de mascotas
        mascotas.add(new Perro("Rex", 3));
        mascotas.add(new Gato("Luna", 2));
        mascotas.add(new Pez("Nemo", 1));
        mascotas.add(new Periquito("Paco", 2));
        mascotas.add(new Conejo("Tambor", 1));
        mascotas.add(new Hamster("Bola", 1));

        // Recorrer la lista y mostrar información de cada mascota
        System.out.println("=== Sistema de Mascotas ===");
        for (Mascota mascota : mascotas) {
            System.out.println("\nMascota: " + mascota.getNombre());
            System.out.println("Tipo: " + mascota.getTipo());
            System.out.println("Edad: " + mascota.getEdad() + " años");
            System.out.print("Sonido: ");
            mascota.emitirSonido();
        }
    }
}
