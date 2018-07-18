import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {
        //Triangle triangle = new Triangle();

        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
       Triangle triangle=(Triangle)factory.getBean("triangle");
        triangle.draw();

    }
}