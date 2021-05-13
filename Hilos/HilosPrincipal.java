import java.util.*;

public class HilosPrincipal{
   
   public static void main(String args[]){
      
      Scanner leer = new Scanner(System.in);
      int vol;
      double rMedia, rSuma, rSumaC;
      
      System.out.println("Volumen del Vector: ");
      vol = leer.nextInt();
      int[] vector = new int[vol];
      
      for(int x=0;x<vol;x++){
         vector[x] = (int)(Math.random()*100+1);
         System.out.println("["+(x+1)+"]. "+vector[x]);
      }
      
      SumaHilos hsuma = new SumaHilos(vector);
      SumaCuadradosHilos hsumac = new SumaCuadradosHilos(vector);
      MediaHilos hmedia = new MediaHilos(vector);
      
      hsuma.start();
      hsumac.start();
      hmedia.start();
      
      try{
         hsuma.join();
         hsumac.join();
         hmedia.join();
         
         rSuma = hsuma.getResultado();
         System.out.println("Suma = "+rSuma);
         rSumaC = hsumac.getResultado();
         System.out.println("Suma Cuadrados = "+rSumaC);
         rMedia = hmedia.getResultado();
         System.out.println("Media = "+rMedia);  
      } catch(InterruptedException ex){
         System.out.println(ex.getMessage());
      }
   }
}