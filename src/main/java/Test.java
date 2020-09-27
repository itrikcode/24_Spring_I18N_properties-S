import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 public class Test{
 public static void main(String[] args){
	 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	 BeanI18N b = context.getBean("beanI18N",BeanI18N.class);
	 b.displayMessage();
 }
 }