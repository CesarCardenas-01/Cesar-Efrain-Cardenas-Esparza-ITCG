package publicacion;

public class Revista extends Publicacion implements Periodicidad
{
    private String ISSN;
    private String titulo;
    private double precio;
    private int numeroPag;
    private int numero;
    private int anio;
    
    public String getISSN(){
     return ISSN;
    }
    
    public void setISSN(String issn){
        ISSN = issn;
    }
    
    public String getTitulo(){
     return titulo;
    }
    
    public void setTitulo(String titu){
        titulo = titu;
    }
    
    public double getPrecio(){
     return precio;
    }
    
    public void setPrecio(int pre){
        precio = pre;
    }
    
    public int getNumero(){
     return numero;
    }
    
    public void setNumero(int num){
        numero = num;
    }
    
     public int getAnio(){
     return anio;
    }
    
    public void setAnio(int year){
        anio = year;
    }
    
    public int getNumpag(){
     return numeroPag;
    }
    
    public void setNumpag(int pag){
        numeroPag = pag;
    }
    
   @Override
    public String getPeriodicidad()//implementación del método
    {
     return periodicidad;
    }
        
  }