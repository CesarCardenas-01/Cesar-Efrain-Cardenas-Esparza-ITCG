import javax.swing.*;
import java.awt.*;

public class JFrameBuscarB extends JFrame
{
   BuscarB bus = new BuscarB();
   
    public JFrameBuscarB()
   {  
      initComponents();
      
   }
   
   private void initComponents()
   {
      setSize(250, 150);
      setTitle("BUSCAR");
      setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
      setResizable(false);
      setContentPane(bus);
      setVisible(true);
       
   }   
}