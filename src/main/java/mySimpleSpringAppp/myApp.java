

package mySimpleSpringAppp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {

	public static void main(String[] args)
	{
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("myTestPackage/appContext.xml");
		
		Fruit myFruit=appContext.getBean("fruit",Fruit.class);
		
		Fruit myexternalFruit=appContext.getBean("externalfruit",Fruit.class);
		
		Vegetable myVegetable=(Vegetable)appContext.getBean("vegetable"); 
		
		
		
		System.out.println(myFruit.talkAboutYourself());
		System.out.println(myexternalFruit.talkAboutYourself());
		
		System.out.println(myVegetable.talkAboutYourself());
		
		
		
		((ClassPathXmlApplicationContext) appContext).close();
	}

}
