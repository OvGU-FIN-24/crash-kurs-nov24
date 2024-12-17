package mediathek;

import mediathek.controller.MediathekController;
import mediathek.view.GUI;
import mediathek.view.JOptionsPaneGUI;

public class Main {

    public static void main(String[] args) {
        GUI gui = new JOptionsPaneGUI();

        MediathekController controller = new MediathekController(gui);
        controller.start();
        
    }
    
}
