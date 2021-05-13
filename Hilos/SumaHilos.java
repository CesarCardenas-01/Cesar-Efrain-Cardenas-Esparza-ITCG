public class SumaHilos extends Thread{

   private int[] numeros;
   private double resultado;
   
   public SumaHilos(int[] numeros){
      this.numeros = numeros;
      this.resultado = 0;
   }
   
   @Override
   public void run(){
      
      int suma=0;
      for(int x=0;x<numeros.length;x++){
         suma = suma + numeros[x];
      }
      this.resultado = (double)suma;
   }
   
   public double getResultado(){
      return resultado;
   }
   
}