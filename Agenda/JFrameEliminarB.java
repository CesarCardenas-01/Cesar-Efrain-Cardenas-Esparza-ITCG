import javax.swing.*;
import java.awt.*;

public class JFrameEliminarB extends JFrame
{
   EliminarB el = new EliminarB();
   
    public JFrameEliminarB()
   {  
      initComponents();
      
   }
   
   private void initComponents()
   {
      setSize(250, 150);
      setTitle("Eliminar");
      setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
      setResizable(false);
      setContentPane(el);
      setVisible(true);
       
   }   
}