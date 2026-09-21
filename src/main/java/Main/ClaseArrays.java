/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;
import Vista.VistaArray;
import Controlador.ControladorArray;
/**
 *
 * @author coffe
 */
public class ClaseArrays {

    public static void main(String[] args) {
        
        VistaArray vista = new VistaArray();
        ControladorArray controlador = new ControladorArray(vista);
        controlador.iniciar();
    }
    
    
}
