package com.cricket.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverCode {
	public static void main(String[] args) {

		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		ApplicationContext context=null;
		try{
			
			  context = new ClassPathXmlApplicationContext("Spring.xml");
			  
			  Player player = context.getBean("player",Player.class);
			  System.out.println(player);
			  Team team= context.getBean("team",Team.class); System.out.println(team);
			  System.out.println(team.getPlayer()); 
			  team=context.getBean("team",Team.class); System.out.println(team);
			  System.out.println(team.getPlayer());
			 
		//player.play();
		
			/*
			 * context=new AnnotationConfigApplicationContext(JavaConfig.class); Player
			 * player = context.getBean("player",Player.class); Team team=
			 * context.getBean("team",Team.class); System.out.println(team);
			 * System.out.println(player);
			 */
		
		}catch(Exception e){
			System.out.println(e);
		}finally {
			if(context!=null)
				((ClassPathXmlApplicationContext)context).close();
		}
	}
}
