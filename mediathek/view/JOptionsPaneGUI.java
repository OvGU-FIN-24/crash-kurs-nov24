package mediathek.view;

import javax.swing.JOptionPane;

public class JOptionsPaneGUI implements GUI {

    @Override
    public void sayHello() {
        JOptionPane.showMessageDialog(null, WELCOME, "HELLO", JOptionPane.INFORMATION_MESSAGE);

    }
    
}
