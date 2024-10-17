package core.app10;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App10 {
    public static void main(String[] args) {
        BeanFactory context = SpringApplication.run(App10.class, args);
        Component1 c1 = context.getBean(Component1.class);
        Component2 c2 = context.getBean(Component2.class);

        //다시 확인
        Object o = c1.getComponent2();
        System.out.println(o);
        System.out.println(o == c2);
    }
}
