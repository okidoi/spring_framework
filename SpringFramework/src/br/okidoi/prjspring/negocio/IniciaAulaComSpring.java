package br.okidoi.prjspring.negocio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import br.okidoi.projspring.beans.Universidade;



public class IniciaAulaComSpring {
	
	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("br/okidoi/projspring/spring/applicationContext.xml");
		Universidade universidade = (Universidade) app.getBean("beanUniversidade");
		universidade.aula();
				
	}

}
