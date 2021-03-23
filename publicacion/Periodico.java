package publicacion;

public class Periodico extends Publicacion implements Periodicidad
{
    private String secciones;
    private String editor;
    private int anio;
    private String titulo;
    
    public String getTitulo(){
     return titulo;
    }
    
    public void setTitulo(String titu){
        titulo = titu;
    }
    
    public String getSecciones(){
     return secciones;
    }
    
    public void setSecciones(String secc){
        secciones = secc;
    }
    
    public String getEditor(){
     return editor;
    }
    
    public void setEditor(String edi){
        editor = edi;
    }
    
    public int getYear(){
     return anio;
    }
    
    public void setYear(int year){
        anio = year;
    }
        
   @Override
    public String getPeriodicidad()//implementación del método
    {
     return periodicidad;
    }
        
  }