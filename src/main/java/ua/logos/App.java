package ua.logos;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.logos.model.FootbalCoach;
import ua.logos.model.HockeyCoach;
import ua.logos.model.TennisCoach;
import ua.logos.service.Coach;

public class App {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("applicationContainer.xml");

        Coach footballCoach = (Coach) container.getBean("footballCoach");
        System.out.println(footballCoach.getDailyFortune());
        System.out.println(footballCoach.getDailyWorkout());

        Coach tennisCoach=(Coach) container.getBean(TennisCoach.class);
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());

        Coach hockeyCoach=(Coach) container.getBean(HockeyCoach.class);
        System.out.println(hockeyCoach.getDailyWorkout());
        System.out.println(hockeyCoach.getDailyFortune());

        container.close();


//        FootbalCoach footbalCoach = new FootbalCoach();
//        Coach coach = new FootbalCoach();



    }
}
