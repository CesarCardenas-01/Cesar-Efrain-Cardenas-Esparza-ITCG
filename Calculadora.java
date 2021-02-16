import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame implements ActionListener{
   
   
   JLabel etiqueta1, etiqueta2, resultado;
   JTextField text1, text2, result;
   JButton botonSuma, botonResta, botonPor, botonDiv;
   public Calculadora(){
      
      initComponents();
   }
   
   private void initComponents(){
      
      //configurar los parametros de la ventana
      setSize(230, 170);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      
      //Crear los componentes
      etiqueta1 = new JLabel("Numero 1: ");
      text1 = new JTextField(10);
      etiqueta2 = new JLabel("Numero 2: ");
      text2 = new JTextField(10);
      resultado = new JLabel("Resultado: ");
      result = new JTextField("0.0",10);
      result.setEditable(false);
      botonSuma = new JButton("+");
      botonResta = new JButton("-");
      botonPor = new JButton("x");
      botonDiv = new JButton("/");
      
      //Crear el contenedor
      JPanel panel = new JPanel();
      
      //Anadir los componentes al contenedor
      panel.add(etiqueta1);
      panel.add(text1);
      panel.add(etiqueta2);
      panel.add(text2);
      panel.add(resultado);
      panel.add(result);
      panel.add(botonSuma);
      panel.add(botonResta);
      panel.add(botonPor);
      panel.add(botonDiv);
      
      //Asociar al contenedor a la ventana
      setContentPane(panel);
      setVisible(true);
      
      botonSuma.addActionListener(this);
      botonResta.addActionListener(this);
      botonPor.addActionListener(this);
      botonDiv.addActionListener(this);
   }
   
   public void actionPerformed(ActionEvent e){
      
      double num1=0.0d, num2=0.0d, respuesta=0.0d;
      String resp;
      if(text1.getText().equals("") || text2.getText().equals(""))
         JOptionPane.showMessageDialog(null, "No estan llenos todos los espacios",
              "Error", JOptionPane.ERROR_MESSAGE);
      else{
         num1 = Double.parseDouble(text1.getText());
         num2 = Double.parseDouble(text2.getText());
      }
      if(e.getSource()==botonSuma)
         respuesta = num1 + num2;
      if(e.getSource()==botonResta)
         respuesta = num1 - num2;
      if(e.getSource()==botonPor)
         respuesta = num1 * num2;
      if(e.getSource()==botonDiv)
         respuesta = num1 / num2;
      result.setText(String.valueOf(respuesta));
   }
   
}