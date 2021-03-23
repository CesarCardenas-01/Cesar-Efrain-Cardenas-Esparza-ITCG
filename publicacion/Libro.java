package publicacion;

public class Libro extends Publicacion
{
    private String ISBN;
    private String edicion;
    private String autor;
    private String titulo;
    private double precio;
    private int numeroPag;
       
    public String getISBN(){
     return ISBN;
    }
    
    public void setISBN(String isbn){
       ISBN = isbn;
    }
    
    public String getTitulo(){
     return titulo;
    }
    
    public void setTitulo(String titu){
        titulo = titu;
    }
    
    public String getEdicion(){
     return edicion;
    }
    
    public void setEdicion(String ed){
        edicion = ed;
    }
    
     public String getAutor(){
     return autor;
    }
    
    public void setAutor(String au){
        autor = au;
    }
    
    public double getPrecio(){
     return precio;
    }
    
    public void setPrecio(int pre){
        precio = pre;
    }
    
    public int getNumpag(){
     return numeroPag;
    }
    
    public void setNumpag(int pag){
        numeroPag = pag;
    }
}