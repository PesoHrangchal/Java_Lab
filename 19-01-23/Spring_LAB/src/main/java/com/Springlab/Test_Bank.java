package com.Springlab;

	import org.springframework.beans.factory.BeanFactory;
	import org.springframework.beans.factory.xml.XmlBeanFactory;
	import org.springframework.core.io.ClassPathResource;
	import org.springframework.core.io.Resource;

import com.Spring.Entity.Bank;


	public class Test_Bank {// test class of Bank

		public static void main(String[] args) { // main method
			Resource res = new ClassPathResource("Context.xml");
			BeanFactory b = new XmlBeanFactory(res);
			Bank bank = (Bank) b.getBean("bank");
			bank.display();
		}

	}
}
