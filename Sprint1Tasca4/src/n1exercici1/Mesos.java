package n1exercici1;

import java.util.ArrayList;

public class Mesos {
	
	private ArrayList <String> mes = new ArrayList<>();
	

	public Mesos() {		
		omplirMesos();		
	}
		
	public ArrayList<String> getMes() {
		return mes;
	}

	public void setMes(ArrayList<String> mes) {
		this.mes = mes;
	}

	public void omplirMesos() {
		mes.add("Gener");
		mes.add("Febrer");
		mes.add("Març");
		mes.add("Abril");
		mes.add("Maig");
		mes.add("Juny");
		mes.add("Juliol");
		mes.add("Agost");
		mes.add("Setembre");
		mes.add("Octubre");
		mes.add("Novembre");
		mes.add("Desembre");
	}

}
