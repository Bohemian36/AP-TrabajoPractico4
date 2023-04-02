import java.io.FileWriter;   
import java.io.IOException;  
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Tres {
  public static void main(String[] args) {
  /*  try {
      //Creación
      FileWriter writeInFile = new FileWriter("Bandas.txt");
        //Agregar contenido al archivo
        writeInFile.write("\nBink 182 \nTwenty one pilots \nParamore \nMy chemical romance \nBob Marley \nCharly Garcia \nNirvana \nQueen \nLana del Rey \nPink Floyd");
        writeInFile.close();
      System.out.println("El archivo fue creado");
    } catch (IOException x) {
      System.out.println("Hubo un error");
      x.printStackTrace();
    }*/
      
      //Lectura del archivo
            try{
           File extra = new File("/storage/emulated/0/Bandas.txt");
           Scanner lect = new Scanner(extra);
           while(lect.hasNextLine()){
           String cont = lect.nextLine();
               System.out.println(cont);
    }
                }catch(FileNotFoundException e){
                System.out.println("El archivo no existe");
      
      
      
  }
    
}
}
