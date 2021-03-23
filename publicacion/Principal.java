package publicacion;

import java.util.*;

public class Principal {

    public static void main(String[] args) {
        int ctrlpub = 0, opc=0, alta=0;
      //Se podrá realizar un ArrayList de tipo Object?
      //Pregunta de reflexión y de calificación
      //Respuesta:
      //Si se puede realizar un ArrayList de tipo object, solo que no lo implemente porque
      //no me quedaba muy en claro su estructura, asi que lo deje con un arreglo ya que se
      //me facilita mas eso.
      
        Scanner leer = new Scanner(System.in);
        Object publicaciones [] = new Object[10]; //reservamos espacio
        Revista revista = new Revista();
        Libro libro = new Libro();
        Periodico periodico = new Periodico();
        
        do{
         System.out.println("M E N U");
         System.out.println("[1] Dar de alta una publicacion");
         System.out.println("[2] Mostrar las publicaciones");
         System.out.println("[3] Salir");
         System.out.println("Elige una opcion: ");
         opc = leer.nextInt();
         switch(opc){
            case 1:
               System.out.println("DAR DE ALTA");
               System.out.println("[1] Revista");
               System.out.println("[2] Periodico");
               System.out.println("[3] Libro");
               System.out.println("Elige una opcion: ");
               alta = leer.nextInt();
               leer.nextLine();
               switch(alta){
                  case 1:
                     //Revista
                     System.out.println("REVISTA");
                     System.out.println("INGRESE LOS SIGUIENTES DATOS");
                     System.out.println("ISSN: ");
                     revista.setISSN(leer.nextLine());
                     System.out.println("Titulo: ");
                     revista.setTitulo(leer.nextLine());
                     System.out.println("Precio: ");
                     revista.setPrecio(leer.nextDouble());
                     System.out.println("Numero del libro: ");
                     revista.setNumero(leer.nextInt());
                     System.out.println("Anio: ");
                     revista.setAnio(leer.nextInt());
                     System.out.println("Numero de Paginas: ");
                     revista.setNumpag(leer.nextInt());
                     publicaciones[ctrlpub] = revista;
                     ctrlpub++;
                     leer.nextLine();
                     break;
                  case 2:
                     //Periodico
                     System.out.println("PERIODICO");
                     System.out.println("INGRESE LOS SIGUIENTES DATOS");
                     System.out.println("Titulo: ");
                     periodico.setTitulo(leer.nextLine());
                     System.out.println("Secciones: ");
                     periodico.setSecciones(leer.nextLine());
                     System.out.println("Editor: ");
                     periodico.setEditor(leer.nextLine());
                     System.out.println("Anio: ");
                     periodico.setYear(leer.nextInt());
                     publicaciones[ctrlpub] = periodico;
                     ctrlpub++;
                     break;
                  case 3:
                     //Libro
                     System.out.println("LIBRO");
                     System.out.println("INGRESE LOS SIGUIENTES DATOS");
                     System.out.println("ISBN: ");
                     libro.setISBN(leer.nextLine());
                     System.out.println("Titulo:");
                     libro.setTitulo(leer.nextLine());
                     System.out.println("Autor: ");
                     libro.setAutor(leer.nextLine());
                     System.out.println("Edicion: ");
                     libro.setEdicion(leer.nextLine());
                     System.out.println("Precio: ");
                     libro.setPrecio(leer.nextDouble());
                     System.out.println("Numero de Paginas");
                     libro.setNumpag(leer.nextInt());
                     publicaciones [ctrlpub] = libro; //guarda el objeto en el arreglo
                     ctrlpub++;
                     leer.nextLine();
                     break;
               }
               break;
            case 2:
               //Ahora mostramos el contenido del arreglo     
         
               //Mostrar el arreglo
               for(int i = 0; i < ctrlpub; i ++ )
               {
                  System.out.println("  " + publicaciones [i].getClass());
                  if(publicaciones[i] instanceof Revista)
                  {
                     Revista rev1 = new Revista();
                     rev1 = (Revista)publicaciones[i];
                     System.out.println("----REVISTA----");
                     System.out.println("ISSN: " + rev1.getISSN());
                     System.out.println("Titulo: " + rev1.getTitulo());
                     System.out.println("Year: " + rev1.getAnio());
                
                  }
                  else if (publicaciones [i] instanceof Libro )
                  {
                     Libro lib = new Libro();
                     lib = (Libro)publicaciones[i];
                     System.out.println("---LIBRO---");
                     System.out.println("ISBN: " + lib.getISBN());
                     System.out.println("Titulo: " + lib.getTitulo());
                     System.out.println("Autor: " + lib.getAutor());
                     System.out.println("Edicion: " + lib.getEdicion());
                  }
                  else if (publicaciones [i] instanceof Periodico )
                  {
                     Periodico per = new Periodico();
                     per = (Periodico)publicaciones[i];
                     System.out.println("---PERIODICO---");
                     System.out.println("Titulo: " + per.getTitulo());
                     System.out.println("Secciones: " + per.getSecciones());
                     System.out.println("Editor: " + per.getEditor());
                  }
               }
               break;
         }
        }while(opc!=3);
     }
   }