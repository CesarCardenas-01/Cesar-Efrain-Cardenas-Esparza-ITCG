public class SumaCuadradosHilos extends Thread{

   private int[] numeros;
   private double resultado;
   
   public SumaCuadradosHilos(int[] numeros){
      this.numeros = numeros;
      this.resultado = 0;
   }
   
   @Override
   public void run(){
      
      int suma=0, cuadrados=0;
      for(int x=0;x<numeros.length;x++){
         cuadrados = numeros[x] * numeros[x];
         suma = suma + cuadrados;
      }
      this.resultado = (double)suma;
   }
   
   public double getResultado(){
      return resultado;
   }
   
}