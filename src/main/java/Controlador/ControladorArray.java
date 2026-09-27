/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.Estudiante;
import Vista.VistaArray;
import javax.swing.JOptionPane;
/**
 *
 * @author Samuel Lopez
 */
public class ControladorArray {
    private VistaArray vista;
    private Estudiante[] estudiantes;
    
    public ControladorArray(VistaArray vista){
        this.vista = vista;
    }
    
    public void iniciar(){
        int n = vista.pedirNumeroEstudiantes();
        estudiantes = new Estudiante[n];
        
        for(int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = registrarEstudiante();
        }
        
        vista.listarEstudiantes(estudiantes);
        
        double filtro = vista.pedirLimite();
        listarEstudiantesConNotaDeTecnologiaMayorA(filtro);
        
        double adicion = vista.pedirAdicion();
        sumarADesarrollo(adicion);
        vista.listarEstudiantes(estudiantes);
    
    
    }
    
    public Estudiante registrarEstudiante(){
        String nombre = vista.pedirNombre();
        int edad = vista.pedirEdad();
        int codigo = vista.pedirId();
        double notaDesarrollo = vista.pedirNotaDesarrollo();
        double notaTecnologia = vista.pedirNotaTecnologia();
        
        Estudiante nuevoEstudiante = new Estudiante(nombre, edad, codigo, notaDesarrollo, notaTecnologia);
        return nuevoEstudiante;
    }
    
    public void modificarEstudiante(String nombreBuscado) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null && estudiantes[i].getNombre().equalsIgnoreCase(nombreBuscado)) {
                String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");
                int nuevaEdad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad:"));

                estudiantes[i].setNombre(nuevoNombre);
                estudiantes[i].setEdad(nuevaEdad); 

                JOptionPane.showMessageDialog(null, "Estudiante modificado exitosamente.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Estudiante no encontrado.");
    }
    
    public void listarEstudiantesConNotaDeTecnologiaMayorA(double filtro){
        
        String mensaje = "";
        
        for(int i = 0; i < estudiantes.length; i++){
            if(estudiantes[i].getNotaTecnologia() > filtro){
                mensaje += "\n[" + i + "] " + estudiantes[i].getNombre() + " - " + estudiantes[i].getEdad() + " años" + "\nCódigo de estudiante: " + estudiantes[i].getId() + "\nNota de desarrollo: " + estudiantes[i].getNotaDesarrollo() + " Nota de Tecnologia: " + estudiantes[i].getNotaTecnologia();
            }
        }
        
        if (mensaje != ""){
            JOptionPane.showMessageDialog(null, mensaje,"Lista de estudiantes", JOptionPane.INFORMATION_MESSAGE );
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay ningun estudiante con una nota mayor a " + filtro,"Lista de estudiantes", JOptionPane.INFORMATION_MESSAGE );
        }
        
        
    }
    
    public void sumarADesarrollo(double adicion){
    
    for(int i = 0; i < estudiantes.length; i++) {
        
        if(estudiantes[i].getNotaDesarrollo() + adicion > 5.0){
           double faltante = 5 - estudiantes[i].getNotaDesarrollo();
           estudiantes[i].setNotaDesarrollo(estudiantes[i].getNotaDesarrollo() + faltante);
        }
        else {
            estudiantes[i].setNotaDesarrollo(estudiantes[i].getNotaDesarrollo() + adicion);
        }
    }
    }
}
