// usar /* en el inicio del bloque y */ en el final del bloque,
// para comentar el bloque que no deseen ejcutar y no les valla a generar algun inconveniente con los otros

package estructuras_de_repeticion;

// import java.util.*; Asi se puede llamar toda la libreria por si se necesitan mas funciones de la libreria java.util
import java.util.Scanner; // Asi se llama solo la funcion Scanner de la libreria java.util

public class Estructuras_de_repeticion {

    
    public static void main(String[] args) {
        
        //Ejemplo con While
        
        Scanner sc = new Scanner(System.in);
        
        String entrada;
        
        System.out.println("Digite un mensaje para while ");
        entrada = sc.nextLine();
        
        while (!entrada.equals("salir")){
            System.out.println("El Mensaje fue: " + entrada);
            System.out.println("Digite un mensaje ");
            entrada = sc.nextLine();
        }
        while (!entrada.toLowerCase().equals("salir")){ //.toLowerCase() convierte todo en minuscula
            System.out.println("El Mensaje fue: " + entrada);
            System.out.println("Digite un mensaje ");
            entrada = sc.nextLine();
        }
        while (!entrada.toUpperCase().equals("SALIR")){ //.toUpperCase() convierte todo en mayuscula
            System.out.println("El Mensaje fue: " + entrada);
            System.out.println("Digite un mensaje ");
            entrada = sc.nextLine();
        }
        
        // Ejemplo Do While
        //String entrada; se tiene que definir la variable fuera del do
        do{
            System.out.println("Digite el mensaje para do ");
            entrada = sc.nextLine();
            System.out.println("El mensaje fue: "+ entrada);
        }while (!entrada.toLowerCase().equals("salir"));
        
        
        // Ejemplo for
        
        int n, sumatoria = 0;
        System.out.println("Ejemplo for Digite un valor para n: ");
        n = sc.nextInt();
        for (int k = 3; k <= n; k += 1){ // se puede usar k++ para incrementar la variable
            System.out.println("Estoy sumando el valor " + k);
            sumatoria += k;
        }
        System.out.println("Sumatoria = " + sumatoria);
        
        // Ejercicio 1, programa que imprima los numero positivos del 1 a 100
        System.out.println("Ejercicio 1 ej. while Numeros del 1 al 100: ");
        int j = 1;
        while (j <= 100){
            System.out.print(j + "\t"); // \t deja un espacio e imprime todo en la misma linea, sin println
            j++; //j = j + 1 - j += 1
        }
        
        System.out.println("Ejercicio 1 ej. do while, Numeros del 1 al 100: ");
        int m = 1;
        do{
            System.out.print(m + "\t");
            m++;
        }while (m <= 100);
        
        System.out.println("Ejercicio 1 ej. for, Numeros del 1 al 100: ");
        int f;
        for (f = 1; f <= 100; f++){
            System.out.print(f + "\t");
        }
        
        // Ejercicio 2, programa de promedios
        int num;
        float cantC = 0, cantP = 0, cantN = 0, pC, pP, pN;
        
        System.out.println("Ejercioio 2 Promedios: Digite la cantidad de numeros a ingresar");
        num = sc.nextInt();
        
        for (int L = 1; L <= num; L++){
            System.out.println("Ingrese un numero: ");
            float nume = sc.nextFloat();
            if (nume == 0){
                cantC++;
            }else{
                if (nume > 0){
                    cantP++;
                }else{
                    cantN++;
                }
            }
        }
        pC = (cantC / num) * 100;
        pP = (cantP / num) * 100;
        pN = (cantN / num) * 100;
        System.out.println("El porcentaje de numeros Ceros es: " + Math.round(pC) + "%");
        System.out.println("El porcentaje de numeros Positivos es: " + Math.round(pP) + "%");
        System.out.println("El porcentaje de numeros Negativos es: " + Math.round(pN) + "%");
        
        // Ejercicio 3, Factorial
        
        int t, o;
        
        System.out.println("Ejercicio 3, Factorial: Digite un numero para calcular el factorial: ");
        t = sc.nextInt();
        o = 1;
        for (int s = 2; s <= t; s++){
            o *= s; // es igual que o = o * s
        }
        System.out.print("El factorial de: " + t);
        System.out.println(" es: " + o );
    }
    
}
// usar /* en el inicio del bloque y */ en el final del bloque,
// para comentar el bloque que no deseen ejcutar y no les valla a generar algun inconveniente con los otros