import javax.swing.*;
import java.awt.*;

public class JFrameMenuB extends JFrame
{
   MenuB menu = new MenuB();
   
    public JFrameMenuB()
   {  
      initComponents();
      
   }
   
   private void initComponents()
   {
      setSize(250, 150);
      setTitle("MENU");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(menu);
      setVisible(true);
       
   }   
}