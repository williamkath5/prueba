package POO3;
import javax.swing.JOptionPane;
//Instancias y las va a llamar mediante su constructor
public class OperacionAPP {
    public static void main(String[] args) 
    {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero 1:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero 2:"));
        
        Operacion op = new Operacion();
        
        op.sumar(numero1, numero2);
        op.restar(numero1, numero2);
        op.multiplicacion(numero1, numero2);
        op.division(numero1, numero2);
        
        op.mostrarResultados();
    }
    
}
