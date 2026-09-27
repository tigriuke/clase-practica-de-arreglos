/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Samuel Lopez
 */
public class Estudiante {
    
    private String nombre;
    private int edad;
    private int id;
    private double notaDesarrollo;
    private double notaTecnologia;
    
    public Estudiante(String nombre, int edad, int id, double notaDesarrollo, double notaTecnologia){
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.notaDesarrollo = notaDesarrollo;
        this.notaTecnologia = notaTecnologia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNotaDesarrollo() {
        return notaDesarrollo;
    }

    public void setNotaDesarrollo(double notaDesarrollo) {
        this.notaDesarrollo = notaDesarrollo;
    }

    public double getNotaTecnologia() {
        return notaTecnologia;
    }

    public void setNotaTecnologia(double notaTecnologia) {
        this.notaTecnologia = notaTecnologia;
    }

    public double getNotaDefinitiva() {
        return notaTecnologia * 0.4 + notaDesarrollo * 0.6;
    }
    
    
}
