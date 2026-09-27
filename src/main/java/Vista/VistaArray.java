/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import Modelo.Estudiante;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel Lopez
 */
public class VistaArray {
    
    public int validarInt(String mensaje, double limiteInferior, double limiteSuperior){
        while(true){
            try{
                int numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje, "Ingrese un número", JOptionPane.QUESTION_MESSAGE));
                if(numero < limiteInferior || numero > limiteSuperior){
                    JOptionPane.showMessageDialog(null, "Error, número debe estar entre " + limiteInferior + " y " + limiteSuperior, "Mensaje de error", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    return numero;
                }
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error, número inválido." + "\nPrueba a escribirlos con coma ',' ", "Mensaje de error", JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }
    
    public double validarDouble(String mensaje, double limiteInferior, double limiteSuperior){
        
        while(true){
            try{
                double numero = Double.parseDouble(JOptionPane.showInputDialog(null, mensaje, "Ingrese un número", JOptionPane.QUESTION_MESSAGE));
                if(numero < limiteInferior || numero > limiteSuperior){
                    JOptionPane.showMessageDialog(null, "Error, número debe estar entre " + limiteInferior + " y " + limiteSuperior, "Mensaje de error", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    return numero;
                }
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error, número inválido." + "\nPrueba a escribirlos con coma ',' ", "Mensaje de error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    public int pedirNumeroEstudiantes(){
        return validarInt("Cuantos estudiantes desea ingresar?", 0, 100);
    }
    
    public double pedirNotaTecnologia(){
        return validarDouble("Ingrese su nota de tecnologia:", 0, 5);
    }
    
    public double pedirNotaDesarrollo(){
        return validarDouble("Ingrese su nota de desarollo:", 0, 5);
    }
    
    public int pedirId(){
        return validarInt("Ingrese su codigo de estudiante:", 0, 10000000);
    }
    
    public int pedirEdad(){
        return validarInt("Ingrese la edad del estudiante:", 0, 110);
    }
    
    
    public double pedirLimite(){
        return validarDouble("Ingrese un número decimal entre 0 y 4,9; \nSe mostraran todos los estudiatntes con una nota definitiva superior a ese número.", 0, 4.9);
    }
    
    public String pedirNombre(){
        return JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
    }
    
    public double pedirAdicion(){
        return validarDouble("Ingrese un número decimal entre 0 y 0.5; \nSe sumara este numero a todas las notas de desarrollo de los estudiantes almacenados.", 0, 0.5);
    }
    
    
    public void listarEstudiantes(Estudiante[] estudiantes) {
        String message = "";
        
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null) {
                
                message += "\n[" + i + "] " + estudiantes[i].getNombre() + " - " + estudiantes[i].getEdad() + " años" + "\nCódigo de estudiante: " + estudiantes[i].getId() + "\nNota de desarrollo: " + estudiantes[i].getNotaDesarrollo() + "\nNota de Tecnologia: " + estudiantes[i].getNotaTecnologia();
            }
        }
        
        JOptionPane.showMessageDialog(null, message,"Lista de estudiantes", JOptionPane.INFORMATION_MESSAGE );
    }
    
    

    public static void modificarEstudiante(Estudiante[] estudiantes, String nombreBuscado) {
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

}
