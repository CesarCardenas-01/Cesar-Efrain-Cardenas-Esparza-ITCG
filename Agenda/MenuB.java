import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuB extends Panel implements ActionListener
{
   private JButton btnAlta, btnBuscar, btnEliminar, btnModificar, btnMostrar, btnCancelar;
   
   public MenuB()
   { 
     JLabel lblOpc = new JLabel("Selecciona la opcion a realizar", JLabel.RIGHT);
     btnAlta = new JButton("Dar de Alta");
     btnAlta.addActionListener(this);
     btnBuscar = new JButton("Buscar");
     btnBuscar.addActionListener(this);
     btnEliminar = new JButton("Eliminar");
     btnEliminar.addActionListener(this);
     btnModificar = new JButton("Modificar");
     btnModificar.addActionListener(this);
     btnMostrar = new JButton("Mostrar");
     btnMostrar.addActionListener(this);
     btnCancelar = new JButton("Cancelar");
     btnCancelar.addActionListener(this);
     add(lblOpc);
     add(btnAlta);
     add(btnBuscar);
     add(btnEliminar);
     add(btnModificar);
     add(btnMostrar);
     add(btnCancelar);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      
      if(e.getSource()==btnAlta){
         JFrameDatosB datos = new JFrameDatosB();
      }
      if(e.getSource()==btnBuscar){
         JFrameBuscarB buscar = new JFrameBuscarB();
      }
      if(e.getSource()==btnEliminar){
         JFrameEliminarB eliminar = new JFrameEliminarB();
      }
      if(e.getSource()==btnMostrar){
         JFrameMostrarB mostrar = new JFrameMostrarB();
      }
      
      if(e.getSource()==btnCancelar){
         System.exit(0);
      }
   }//actionPerformed
}