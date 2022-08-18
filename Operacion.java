package POO3;
//Atributos y metodos
public class Operacion {
    //Atributos globales
    double suma;
    double resta;
    double multiplicacion;
    double division;
    //Metodos para sumar ambos numeros
    
    //void=mi objeto, No retorne algo
    //void= retornar algo return
    public void sumar(double numero1, double numero2){
        //variable local
        suma = numero1 + numero2;
    }
    
    //Metodos para restar
    public void restar(double numero1, double numero2){
        resta = numero1 - numero2;
    }
    
    //Metodos para multiplicar
    public void multiplicacion(double numero1, double numero2){
        multiplicacion = numero1 * numero2;
    }
    
    //Metodos para division
    public void division(double numero1, double numero2){
        division = numero1 / numero2;
    }
    
    //Metodo para mostrar los resultado
    
    public void mostrarResultados(){
        System.out.println("La suma es:" +suma);
        System.out.println("La resta es:" +resta);
        System.out.println("La multiplicacion es:" +multiplicacion);
        System.out.println("La division es:" +division);
    }
}
