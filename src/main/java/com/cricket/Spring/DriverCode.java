package com.cricket.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DriverCode {
	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		Player player = (Player) factory.getBean("player");
		player.play();
	}
}
