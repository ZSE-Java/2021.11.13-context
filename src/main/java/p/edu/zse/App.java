package p.edu.zse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import p.edu.zse.components.Klasa3;
import p.edu.zse.configuration.AppConfiguration;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Klasa3 bean = context.getBean(Klasa3.class);
        bean.start();
    }
}
