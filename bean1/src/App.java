import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Создание контекста из XML-конфигурации
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Получение бина из контекста
        User user = (User) context.getBean("user");

        // Вывод информации о бине
        System.out.println(user);
    }
}