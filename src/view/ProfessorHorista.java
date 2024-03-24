package view;

public class ProfessorHorista extends Professor{
	

	public ProfessorHorista() {
		
	}
	

	private int horasAula;
	private int valorHoraAula;
	
	public int getHorasAula() {
		return horasAula;
	}

	public void setHorasAula(int horasAula) {
		this.horasAula = horasAula;
	}

	public int getValorHoraAula() {
		return valorHoraAula;
	}

	public void setValorHoraAula(int valorHoraAula) {
		this.valorHoraAula = valorHoraAula;
	}

	public double calSalario() {
		return getValorHoraAula() * getHorasAula();
	}

}
