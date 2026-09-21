/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import Modelo.Estudiante;

/**
 *
 * @author coffe
 */
public class VistaArray {
    
    public static void listarEstudiantes(Estudiante[] estudiantes) {
        System.out.println("Lista de estudiantes:");
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null) {
                System.out.println("[" + i + "] " + estudiantes[i].nombre + " - " + estudiantes[i].edad + " años");
            }
        }
    }

}
