import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EliminarB extends JPanel implements ActionListener
{
  JButton btnBuscar, btnEliminar;//visibilidad a nivel de clase
  JTextField txtNombre;
  ManejoPersona datos = new ManejoPersona();
  MostrarDatosB jfm = new MostrarDatosB();
  
  
  public EliminarB()
  {
    setLayout(new GridLayout(7,2));
    JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
    txtNombre = new JTextField(20);
    add(lblNombre);
    add(txtNombre);
    
    btnBuscar = new JButton("Buscar");
    btnBuscar.addActionListener(this);
    btnEliminar = new JButton("Eliminar");
    btnEliminar.addActionListener(this);
    add(btnBuscar);
    add(btnEliminar);
    
  }//Método Constructor
  
  public void actionPerformed(ActionEvent e)
  {
    boolean ban = false;
    int num=0;
    String bu = txtNombre.getText();
    String buscarPer [][] = new String[10][3];
    if (e.getSource() == btnBuscar) 
      {
         if(txtNombre.getText() == null || txtNombre.getText().isEmpty())
         {
          JOptionPane.showMessageDialog(null, "Debe de ir al menos el nombre de la persona",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.requestFocus();
         }
        else
          {
            buscarPer=jfm.obtenerDatos();
            for(int x=0;x<10;x++){
               if(bu.equals(buscarPer[x][0])){
                  JOptionPane.showMessageDialog(null, "Se encontro el datos \n"+buscarPer[x][0]+" "+buscarPer[x][1]+" Tel: "+buscarPer[x][2],
                   "Aviso", JOptionPane.INFORMATION_MESSAGE);
                  ban = true;
                  num = x;
                  break;
               }
            }
            if(ban==false){
               JOptionPane.showMessageDialog(null, "No se encontro el dato",
               "Aviso", JOptionPane.INFORMATION_MESSAGE);	
            }
          }
      }
      if(e.getSource() == btnEliminar){
         if(ban == true){
            for(int x=num;x<9;x++){
               buscarPer[x][0]=buscarPer[x+1][0];
               buscarPer[x+1][0]=null;
               buscarPer[x][1]=buscarPer[x+1][1];
               buscarPer[x+1][1]=null;
               buscarPer[x][2]=buscarPer[x+1][2];
               buscarPer[x+1][2]=null;
               buscarPer[x][3]=buscarPer[x+1][3];
               buscarPer[x+1][3]=null;
               buscarPer[x][4]=buscarPer[x+1][4];
               buscarPer[x+1][4]=null;
               buscarPer[x][5]=buscarPer[x+1][5];
               buscarPer[x+1][5]=null;
            }
            
         }
      }
  }
}