
package boletin6_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Hector Pose Carames
 */
public class Positivo {
        
    int numero;    
    
    public void positivo(){
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
        if (numero>0){
            JOptionPane.showMessageDialog(null, "El numero es positivo");
        }
    }
    
}
