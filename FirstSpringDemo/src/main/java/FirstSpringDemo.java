import domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class FirstSpringDemo {
    public static void main(String[] args){
        // 获取Spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        
        // 除了ApplicationContext外还可以使用BeanFactory来获取Spring上下文
        // BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("spring-config.xml"));

        // 加载指定对象
        User user = (User)context.getBean("user");
        //调用对应的方法
        System.out.println(user.sayHi("world"));
    }
}
