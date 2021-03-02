import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BuscarB extends JPanel implements ActionListener
{
  JButton btnBuscar;//visibilidad a nivel de clase
  JTextField txtNombre;
  ManejoPersona datos = new ManejoPersona();
  MostrarDatosB jfm = new MostrarDatosB();
  
  
  public BuscarB()
  {
    setLayout(new GridLayout(7,2));
    JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
    txtNombre = new JTextField(20);
    add(lblNombre);
    add(txtNombre);
    
    btnBuscar = new JButton("Buscar");
    btnBuscar.addActionListener(this);
    add(btnBuscar);
    
  }//Método Constructor
  
  public void actionPerformed(ActionEvent e)
  {
    
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
            String bu = txtNombre.getText();
            String buscarPer [][] = new String[10][3];
            buscarPer=jfm.obtenerDatos();
            boolean ban = false;
            for(int x=0;x<10;x++){
               if(bu.equals(buscarPer[x][0])){
                  JOptionPane.showMessageDialog(null, "Se encontro el datos \n"+buscarPer[x][0]+" "+buscarPer[x][1]+" Tel: "+buscarPer[x][2],
                   "Aviso", JOptionPane.INFORMATION_MESSAGE);
                  ban = true;
                  break;
               }
            }
            if(ban==false){
               JOptionPane.showMessageDialog(null, "No se encontro el dato",
               "Aviso", JOptionPane.INFORMATION_MESSAGE);	
            }
          }
      }
  }
}