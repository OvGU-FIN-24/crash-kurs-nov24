package mediathek.controller;

import mediathek.view.GUI;

public class MediathekController {

    GUI gui; 

    public MediathekController(GUI gui) {
        this.gui = gui;
    }

    public void start() {
       // while(true) {
            this.sayHello();

            //Hier logik einfügen
       // }
    }
    

    private void sayHello() {
        gui.sayHello();
    }

}


