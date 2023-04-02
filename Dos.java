import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;   
import java.io.IOException;


    public class Dos {
            
        public static void main (String[] args) throws FileNotFoundException{
    
           //Creación del archivo
            /*     try {
            FileWriter archivo = new FileWriter("Zeta.txt");
            //Agregar contenido al archivo
            archivo.write("36"+" 82"+" 12"+" 27"+" 90");
            archivo.close();
            System.out.println("El archivo se creo correctamente.");
            }catch (IOException x){
            System.out.println("Hubo un error");
            x.printStackTrace();
 } */
            //Lectura del archivo
            try{
            File extra = new File("/storage/emulated/0/Zeta.txt");
            Scanner lect = new Scanner(extra);
            while(lect.hasNextLine()){
            String cont = lect.nextLine();
            System.out.println("El contenido del archivo es: "+cont);
    }
            }catch(FileNotFoundException e){
            System.out.println("El archivo no existe");
 }
            System.out.println("--------------------");
                
           //Suma y multiplicación del contenido del archivo      
            File archivo = new File("Zeta.txt");
            char op = ' ';
            int resultado = sumar(archivo,op);
            System.out.println(resultado);
      }

    private static int sumar(File arch, char op) throws FileNotFoundException {
            int mult=0, suma=0;
            boolean ingreso = true;	
        Scanner numeros = new Scanner(arch);
        if (op == ' ') {
            System.out.println("La suma total de los números es: ");
            while (numeros.hasNextInt()) { 		 
            suma = suma+numeros.nextInt();
            }return suma;
        }else{ 
            System.out.println("La multiplicacion total de los números es: ");
            while (numeros.hasNextInt()) { 
	       if (ingreso) {
		  mult = numeros.nextInt();
		  ingreso = false;
		  }else
		  mult = mult*numeros.nextInt();
	          }return mult;
     }	     
   }	
 }
