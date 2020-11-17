
package u3e5;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      boolean continuar=true;
      int opc;
      String palabra;
      //Random r=new Random();
      
      ColaDinamica cola=new ColaDinamica();
      Scanner leer =new Scanner(System.in);
      while(continuar){
          System.out.println("********************");
          System.out.println("Menú");
          System.out.println("1.Insertar");
          System.out.println("2.Mostrar");
          System.out.println("3.Eliminar");
          System.out.println("4.Salir");
          opc=leer.nextInt();
          System.out.println("********************");
          
          switch(opc){
              case 1:
                  System.out.println("Palabra a insertar");
                  palabra=leer.next();
                  //for(int i=0;i<10;i++){
                  //palabra=r.nextInt(500-50+1)+50;
                  cola.Empujar(palabra);
                  break;
              case 2:
                  cola.Mostrar();
                  break;
              case 3:
                  cola.Sacar();
                  break;
              case 4:
                  System.exit(0);
                  break;
              default:
                  System.out.println("Opción incorrecta");
                  break;
          }
      }
    }
    
    
}
