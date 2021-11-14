package p.edu.zse.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Klasa3 {

    @Autowired
    Klasa2 klasa2;

    public void start() {
        klasa2.cosTam();
        System.out.println("Klasa3 start !!!");
    }
}
