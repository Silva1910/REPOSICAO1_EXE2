package view;

public class ProfessorTitular extends Professor {

	private int anoInstituicao;
	private double salario;

	public ProfessorTitular() {

	}

	public int getAnoInstituicao() {
		return anoInstituicao;
	}

	public void setAnoInstituicao(int anoInstituicao) {
		this.anoInstituicao = anoInstituicao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double calSalario() {
	    if (getAnoInstituicao() >= 5) {
	        int base = getAnoInstituicao() / 5; 
	        base = base * 5;
	        return (base * 0.05 * getSalario()) + getSalario(); 
	    } else {
	        return getSalario();
	    }
	}
}