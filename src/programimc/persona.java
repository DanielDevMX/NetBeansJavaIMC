
package programimc;

public class persona {
 private String nombre;
    private int edad;
    private final String NSS;
    private char sexo;
    private double peso;
    private double altura;

    public persona() {
        nombre = "";
        edad = 0;
        NSS= generaNSS();
        sexo = comprobarSexo();               
        peso = 0.0;
        altura = 0.0;
    }
     public persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.NSS= generaNSS();
        this.sexo = sexo;
        this.peso = 0.0;
        this.altura = 0.0;
    }
      public persona(String nombre, int edad, String NSS, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
            this.NSS = generaNSS();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void calcularIMC(double altura, double peso, char sexo) {
        //final int under_ideal_weight  = -1;
        //final int ideal_weight = 0;
       // final int overweight = 1;
        double imc;
        char Hombre = 'H';
        char Mujer = 'M';
        imc = peso /(Math.pow(altura, 2));
        

        if (sexo == Hombre){
         if ( imc < 20) {
         System.out.println("Usted esta bajo de peso");
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("Usted esta en el peso ideal");
        } else {
            System.out.println("Usted esta en Sobrepeso");
        }
        }
        else if (sexo == Mujer) {
            if ( imc < 19) {
         System.out.println("Usted esta baja de peso");
        } else if (imc >= 19 && imc <= 24) {
            System.out.println("Usted esta en el peso ideal");
        } else {
            System.out.println("Usted esta en Sobrepeso");
        }
        }
    }
    public boolean esMayorDeEdad(int edad) {
        if (edad >= 18){
            return true;
        }
        else{
            return false;
        }
       
    }      

    private char comprobarSexo() {
        if (sexo != 'H' || sexo != 'M') {
            sexo = 'H';
        }
        return sexo;
    }

    public String toString() {
        return nombre+"/"+edad+"/"+NSS+"/"+sexo+"/"+peso+"/"+altura;
    }
     

    private String generaNSS() {
        double n;
        int n2;
        int nsscreate=0;
        char letra;
        String caracteresalazar;
        String nss;

        for (int i = 0; i < 8; i++) {
            n = Math.floor(Math.random() * (0 - 9) + 9);
            n2 = (int) n;
            nsscreate = nsscreate*10+n2;           
        }               
        caracteresalazar="CHATBOTAGMYFPBZSQVHLCKE";
        int modulo = nsscreate % 23;
        letra = caracteresalazar.charAt(modulo);
        nss = (""+nsscreate+letra+"");
       
        return nss;       
    }
   
   
   
   
    public void IntNombre(String nombre) {
        this.nombre = nombre;
    }

    public void IntEdad(int edad) {
        this.edad = edad;
    }

    public void IntSexo(char sexo) {
        this.sexo = sexo;
    }

    public void IntPeso(double peso) {
        this.peso = peso;
    }

    public void IntAltura(double altura) {
        this.altura = altura;
    }

}
