package teste;

import org.junit.Before;
import org.junit.Test;

import resource.DadosExecucao;
import applicationWeb.Application;
import funcionalidade.EfetuarCompra;
import funcionalidade.Login;


public class CT022_EfetuarCompraBoletoFreteNormalSelecionandoEndereco {

	@Before
	public void preConditions() throws Exception {
		
		DadosExecucao dado = new DadosExecucao();  
		dado.beforeScenario(this.getClass().getSimpleName());
	}
	
	@Test
	public void main() throws Exception {
		
		Application app = new Application();
		app.oppenApp();
		try{
			
			
			Login login = new Login();
			login.logon();
			
			EfetuarCompra efetuarCompra = new EfetuarCompra();
			efetuarCompra.efetuarCompraSelecionandoEndereco();
			
			login.logoff();
			
		}
		catch (Exception e)	{
			System.out.println(e.getMessage());
		}
		
		finally{
			
			app.closeApp();
		}
	}

}
