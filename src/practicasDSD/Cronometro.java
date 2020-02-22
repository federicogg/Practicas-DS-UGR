package practicasDSD;

public class Cronometro extends Thread{
	
	Boolean fin;
	
	Cronometro() {
		this.fin = false;
	}
	
	public Boolean getAcabado ()
	{
		return fin;
	}
	
	@Override
	public void run()
	{
		//Esperamos un minuto
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.fin = true;
	}
}
