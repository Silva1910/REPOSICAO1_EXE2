package main;

import view.ProfessorHorista;
import view.ProfessorTitular;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfessorHorista PH = new ProfessorHorista();
		ProfessorTitular PT = new ProfessorTitular();
		
		
		
		PH.setNome("AMOS");
		PH.setIdade(20);
		PH.setMatricula("12345");
		PH.setValorHoraAula(10);
		PH.setHorasAula(10);
		
	
		
		PT.setNome("SILVA");
		PT.setIdade(21);
		PT.setMatricula("6789");
		PT.setSalario(1000);
		PT.setAnoInstituicao(15);
		
		
		
		System.out.println("o nome do professor Horista e " + PH.getNome());
		System.out.println("a idade do professor Horista e " + PH.getIdade());
		System.out.println("o salario do professor Horista e " + PH.calSalario());
		System.out.println("*******************************************************************") ;
		System.out.println("o nome do professor titular e " + PT.getNome());
		System.out.println("a idade do professor titular e " + PT.getIdade());
		System.out.println("o salario do professor titular e " + PT.calSalario());

	}

}
