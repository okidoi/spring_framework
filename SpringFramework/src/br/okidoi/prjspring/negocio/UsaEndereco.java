package br.okidoi.prjspring.negocio;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.okidoi.projspring.beans.BeanEndereco;


public class UsaEndereco {

	public static void main(String[] args) 
	{
		
		BeanFactory appContext = 
				new ClassPathXmlApplicationContext("br/okidoi/projspring/spring/applicationContext.xml");
		
		BeanEndereco beanEndereco= (BeanEndereco) appContext.getBean("beanEndereco");
		JOptionPane.showMessageDialog(null, beanEndereco);
		
		
	}
}
