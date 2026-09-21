/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import Modelo.Estudiante;
import javax.swing.JOptionPane;

/**
 *
 * @author coffe
 */
public class VistaArray {
    
    public static void listarEstudiantes(Estudiante[] estudiantes) {
        String message = "";
        
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null) {
                
                message += "\n[" + i + "] " + estudiantes[i].getNombre() + " - " + estudiantes[i].getEdad() + " años";
            }
        }
        
        JOptionPane.showMessageDialog(null, message,"Lista de estudiantes", JOptionPane.INFORMATION_MESSAGE );
    }
    
    public int pedirNumeroEstudiantes(){
        try{
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos estudiantes desea ingresar", "Ingrese un número", JOptionPane.QUESTION_MESSAGE));
            if(numero <= 0){
            JOptionPane.showMessageDialog(null, "Error, número inválido", "Mensaje de error", JOptionPane.WARNING_MESSAGE);
            return 0;
            }
            else{
            return numero;
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, número inválido", "Mensaje de error", JOptionPane.WARNING_MESSAGE);
            return 0;
        }
    }

}
