package app;

import javax.swing.JLabel;

public class CronometroInterfaz implements Runnable {
	private HiloCronometro cronometro;
	private JLabel print;
	
	public CronometroInterfaz (HiloCronometro cronometro,JLabel print) {
		super();
		this.cronometro=cronometro;
		this.print=print;
		this.cronometro = new HiloCronometro(new Cronometro());
		this.cronometro.play();
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(10);
				print.setText(cronometro.getTimer());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
