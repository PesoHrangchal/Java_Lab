package com.Springlab;

	import org.springframework.beans.factory.BeanFactory;
	import org.springframework.beans.factory.xml.XmlBeanFactory;
	import org.springframework.core.io.ClassPathResource;
	import org.springframework.core.io.Resource;

import com.Spring.Entity.Bank_Details;
	public class Test_Bankdetails { //// test class of Bank_Details

		public static void main(String[] args) { // main method
			Resource res = new ClassPathResource("Context.xml");
			BeanFactory b = new XmlBeanFactory(res);
			Bank_Details bk = (Bank_Details) b.getBean("bd");
			bk.display();

		}

	}
}
