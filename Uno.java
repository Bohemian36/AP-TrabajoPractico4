import java.util.*;
import java.util.Scanner;

public class Uno {
    public static void main (String [] args) {

        int [] z = new int [3];
        
        Scanner zeta = new Scanner (System.in);
            System.out.print("Escribí un número: ");
            z[0] = zeta.nextInt();
            System.out.print("Escribí un segundo número");
            z[1] = zeta.nextInt();
            System.out.print("Escribí un tercer número");
            z[2] = zeta.nextInt();
            
            System.out.print("\nLos números elegidos son: "+z[0]+" "+z[1]+" "+z[2]);
    
    int pri=0,seg=0,ter=0;
    boolean ascendente = false;

    System.out.print ("\nY su ascendente es: ");
    
    if (((z[0]>z[1]) && (z[0]>z[2])) && ((z[1]<z[0]) && (z[1]>z[2]))) {
       pri=z[0];
       seg=z[1];
       ter=z[2];
    }else if ((z[0]>z[1] && z[0]>z[2]) && (z[2]<z[0] && z[2]>z[1])) {
        pri=z[0];
        seg=z[2];
        ter=z[1];
    }else if ((z[1]>z[0] && z[1]>z[2]) && (z[0]<z[1] && z[0]>z[2])) {
        pri=z[1];
        seg=z[0];
        ter=z[2];
    }else if ((z[1]>z[0] && z[1]>z[2]) && (z[2]<z[1] && z[2]>z[0])) {
         pri=z[1];
         seg=z[2];
         ter=z[0];
    }else if ((z[2]>z[0] && z[2]>z[1]) && (z[1]<z[2] && z[1]>z[0])) {
         pri=z[2];
         seg=z[1];
         ter=z[0];
    }else{
         pri=z[2];
         seg=z[0];
         ter=z[1];
 }
      int [] asc = new int[3];

      if (ascendente) {
      asc[0]=pri;
      asc[1]=seg;
      asc[2]=ter;

      }else {

      asc[0]=ter;
      asc[1]=seg;
      asc[2]=pri;
}
    for (int i=0; i< asc.length; i++ ) {
     System.out.print(asc[i]+" ");
}
}
}
