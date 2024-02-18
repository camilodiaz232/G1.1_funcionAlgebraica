import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        // Creacion de la variables
        Double x, y, resultado;

        // Metodo para la lectura de valores ingresados
        Scanner lectura =new Scanner(System.in);

        // Captura del valor X
        System.out.println("Ingrese valor de X: ");
        x = Double.parseDouble(lectura.next());  //Se realiza el parse porque la lectura inicial la toma como String

        // Captura del valor de Y
        System.out.println("Ingrese valor de Y: ");
        y= Double.parseDouble(lectura.next());  //Se realiza el parse porque la lectura inicial la toma como String

        // Evaluacion de la formula
        resultado = Math.pow(x,2)+(2*x*y)+Math.pow(y,2);

        // Presentacion del Resultado
        System.out.println("El resultador de la funcion algebraica es: "+resultado);
    }
}
