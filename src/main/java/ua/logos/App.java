package ua.logos;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("applicationContainer.xml");
        container.close();
    }
}