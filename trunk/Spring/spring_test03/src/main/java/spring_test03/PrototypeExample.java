package spring_test03;
/**
 * Ejemplo de Beans prototype.
 * @author Jesus Campos
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeExample {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("MyBeansPrototype.xml");

		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

		objA.setMessage("I'm object A");
		objA.getMessage();

		HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
		objB.getMessage();
		
	}
}
