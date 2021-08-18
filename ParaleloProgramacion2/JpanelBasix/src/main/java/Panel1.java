
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Files;
import javax.swing.JPanel;
import javax.swing.JTextArea;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sistemas07
 */
public class Panel1 extends JPanel implements ActionListener{
    JTextArea textArea;
    
    public Panel1(){
        setLayout(null);
        setBackground(Color.GREEN);
        iniciarComponentes();
         
        
    }

    private void iniciarComponentes() {
         textArea = new JTextArea();
         textArea.setBounds(10, 10, 350, 181);
         
          String texto = "  ESTO ES UN EJEMPLO DEL PANEL";
          textArea.setText(texto);
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
}
