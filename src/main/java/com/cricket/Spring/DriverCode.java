package com.cricket.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverCode {
	public static void main(String[] args) {

		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		ApplicationContext context=null;
		try{
			context = new ClassPathXmlApplicationContext("Spring.xml");
		
		Player player = (Player) context.getBean("player");
		
		player.play();
		}catch(Exception e){
			System.out.println(e);
		}finally {
			if(context!=null)
				((ClassPathXmlApplicationContext)context).close();
		}
	}
}
