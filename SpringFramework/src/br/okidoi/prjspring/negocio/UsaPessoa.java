package br.okidoi.prjspring.negocio;

import javax.swing.JOptionPane;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.okidoi.projspring.beans.BeanEndereco;
import br.okidoi.projspring.beans.BeanPessoa;


public class UsaPessoa {

	public static void main(String[] args) 
	{
		/*BeanPessoa beanPessoa = new BeanPessoa();
		beanPessoa.setNome("Marcio");
		JOptionPane.showMessageDialog(null, beanPessoa.getNome());
		*/
		
		ApplicationContext appContext = 
				new ClassPathXmlApplicationContext("br/okidoi/projspring/spring/applicationContext.xml");
		
		
		BeanPessoa beanPessoa = (BeanPessoa) appContext.getBean("beanPessoa");
		BeanEndereco beanEndereco = (BeanEndereco) appContext.getBean("beanEndereco");
		beanPessoa.setEndereco(beanEndereco);
		
		JOptionPane.showMessageDialog(null, beanPessoa);
		
		
	}
}
