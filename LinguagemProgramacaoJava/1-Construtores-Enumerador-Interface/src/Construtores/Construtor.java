package Construtores;

import Construtores.Aluno.STATUS;

public class Construtor {

	public static void main(String[] args) {
		// passando os dados através do construtor com sobre carga
		Aluno alu = new Aluno(8, 8, 8);
		//calcular a média
		double mediaAlunoFinal = alu.calcularMediaAluno();
		
		//definido situação do aluno
		if(mediaAlunoFinal < 6) {
			alu.situacaoAluno = STATUS.REPROVADO;
		}else {
			alu.situacaoAluno = STATUS.APROVADO;
		}
		
		//imprimindo situação do aluno
		System.out.println("A média do aluno é : " + alu.calcularMediaAluno() + " é o está " + alu.situacaoAluno);

	}

}
