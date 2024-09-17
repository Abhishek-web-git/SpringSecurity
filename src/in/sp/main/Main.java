package in.sp.main;

import in.sp.spring.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		String config_file_loc="/in/sp/resource/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(config_file_loc);
		Student std = (Student) context.getBean("stdId");
		std.Display();
		
		
		
	}

}
