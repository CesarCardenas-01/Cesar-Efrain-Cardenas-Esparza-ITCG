import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelDatosB extends JPanel implements ActionListener
{
  JButton btnGuardar, btnSalir;//visibilidad a nivel de clase
  JTextField txtNombre, txtApellidos, txtTelefono, txtDireccionElec, txtCumple;
  JRadioButton amigo, conocido;
  ManejoPersona datos = new ManejoPersona();
  JFrameMostrarB jfm;
  JFrameMenuB jmenu;
  
  public PanelDatosB()
  {
    setLayout(new GridLayout(7,2));
    JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
    txtNombre = new JTextField(20);
    add(lblNombre);
    add(txtNombre);
    
    JLabel lblApellidos = new JLabel("Apellidos: ", JLabel.RIGHT);
    txtApellidos = new JTextField(30);
    add(lblApellidos);
    add(txtApellidos);
    
    JLabel lblTelefono = new JLabel("Telefono: ", JLabel.RIGHT);
    txtTelefono = new JTextField(15);
    add(lblTelefono);
    add(txtTelefono);
    
    JLabel lblDireccionElec = new JLabel("Direccion Electrononica: ", JLabel.RIGHT);
    txtDireccionElec = new JTextField(30);
    add(lblDireccionElec);
    add(txtDireccionElec);
    
    JLabel lblCumple = new JLabel("Fecha de Cumpleanios: ", JLabel.RIGHT);
    txtCumple = new JTextField(30);
    add(lblCumple);
    add(txtCumple);
    
    ButtonGroup gpoRBotones = new ButtonGroup();
    amigo = new JRadioButton("Amigo", true);
    conocido = new JRadioButton("Conocido");
    gpoRBotones.add(amigo);
    gpoRBotones.add(conocido);
    add(amigo);
    add(conocido);
    
    btnGuardar = new JButton("Guardar");
    btnGuardar.addActionListener(this);
    add(btnGuardar);
  }//M�todo Constructor
  
  public void actionPerformed(ActionEvent e)
  {
    String tipo="Conocido";
    
    if (e.getSource() == btnGuardar) 
      {
         if(amigo.isSelected())
                tipo="Amigo";
         if(txtNombre.getText() == null || txtNombre.getText().isEmpty())
         {
          JOptionPane.showMessageDialog(null, "Debe de ir al menos el nombre de la persona",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.requestFocus();
         }
        else
         if(txtTelefono.getText() == null || txtTelefono.getText().isEmpty())
         {
          JOptionPane.showMessageDialog(null, "Se debe de colocar el tel�fono de la persona",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtTelefono.requestFocus();
         }
        else
          {
           datos.agregar(txtNombre.getText(), txtApellidos.getText(),
           txtTelefono.getText(),tipo);
           JOptionPane.showMessageDialog(null, "Se guardar�n los datos",
              "Aviso", JOptionPane.INFORMATION_MESSAGE);	
            txtNombre.setText("");
            txtApellidos.setText("");
            txtTelefono.setText("");
            txtDireccionElec.setText("");
            txtCumple.setText("");
            txtNombre.requestFocus();
               // datos.mostrar();
           }
         }
  }
}