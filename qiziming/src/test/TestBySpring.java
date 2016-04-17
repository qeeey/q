package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ITestService;


public class TestBySpring {
	public static void main(String[] args) {
		String[] configFiles=new String[]{
				"applicationContext.xml"
		};
		ApplicationContext context = 
			new ClassPathXmlApplicationContext(configFiles);
		
		ITestService testService=(ITestService) context.getBean("testService");
		
//		System.out.println(testService.login());
		
		testService.findUserinfo();
		
	}
}
