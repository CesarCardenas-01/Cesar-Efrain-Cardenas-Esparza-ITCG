import javax.swing.*;
import java.awt.*;
import java.util.*;

public class MostrarDatosB extends JPanel
{
   JTable tabla;
   JScrollPane scroll = new JScrollPane();
   ManejoPersona mp = new ManejoPersona();
   ArrayList<Persona> datosPer = new ArrayList<Persona>();
   
   public MostrarDatosB()
   {
      datosPer = mp.datos();
      String titulos[] = {"Nombre", "Apellidos", "Telefono", "Tipo"};
      String info[][] = obtenerDatos();
      setLayout(new GridLayout(1,1));
      
      tabla = new JTable(info, titulos);
      tabla.setEnabled(false);
      tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
      scroll.setViewportView(tabla);
      add(scroll);
   }
   
   public String[][] obtenerDatos()
   {
      int x=0;
      String informacion[][] = new String[datosPer.size()][4];
      Iterator<Persona> itrPersona = datosPer.iterator();
      while(itrPersona.hasNext()){
            Persona persona = itrPersona.next();
            informacion[x][0] = persona.getNombre();
            informacion[x][1] = persona.getApellidos();
            informacion[x][2] = persona.getTelefono();
            informacion[x][3] = persona.getTipo();
            x++;
           }
      return informacion; 
   }
   
}