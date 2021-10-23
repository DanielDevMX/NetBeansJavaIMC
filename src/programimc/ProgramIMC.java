
package programimc;
import java.util.Scanner;

public class ProgramIMC {
    
    public static void main(String[] args) {
        char Hombre = 'H';
        char Mujer = 'M';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String n = scanner.next();
        System.out.println("Introduce tu edad: ");
        int e = scanner.nextInt();
        System.out.println("Introduce tu sexo (H o M): ");
        char s = scanner.next().charAt(0);
        if (s == Hombre || s == Mujer ){
        System.out.println("Introduce tu peso: ");
        double p = scanner.nextDouble();
        System.out.println("Introduce tu altura: ");
        double a = scanner.nextDouble();       
        persona p1 = new persona (n, e, "", s, p, a); 
        p1.esMayorDeEdad(e);
        p1.IntSexo(s);
        System.out.println(p1);
        p1.calcularIMC(a, p, s);
        if (p1.esMayorDeEdad(e) == true) {
            System.out.println("Usted es mayor de edad");
        }
        else     
            System.out.println("Usted es menor de edad");
        }
        else
        {  System.out.println("Oops, Parece que introducieste un caracter invalido");return;}
        
    }
}