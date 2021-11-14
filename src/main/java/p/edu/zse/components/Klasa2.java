package p.edu.zse.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Klasa2 {

    @Autowired
    Klasa1 klasa1;

    public void cosTam() {
        this.klasa1.zrobCos();
        System.out.println("Klasa2 robię coś tam !!");
    }
}
