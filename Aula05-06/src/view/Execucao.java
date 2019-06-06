package view;

import javax.swing.JOptionPane; //a

import model.Professor;

public class Execucao {
	public static void main (String[] args) {
		Professor pf = new Professor();
		
		pf.setNome(JOptionPane.showInputDialog(null,"Nome: "));
		pf.setEndereco(JOptionPane.showInputDialog(null,"Endereço: "));
		pf.setBairro(JOptionPane.showInputDialog(null,"Bairro: "));
		pf.setCep(Integer.parseInt(JOptionPane.showInputDialog(null,"CEP: ")));
		pf.setCidade(JOptionPane.showInputDialog(null,"Cidade: "));
		pf.setEstado(JOptionPane.showInputDialog(null,"Estado: "));
		pf.setRg(Long.parseLong(JOptionPane.showInputDialog(null,"RG: ")));
		pf.setCpf(Long.parseLong(JOptionPane.showInputDialog(null,"CPF: ")));
		
		try {
			int dis = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas disciplinas você possui?"));
			String disciplinas[] = new String[100];
			for (int i = 1; i < (dis+1); i++){
				disciplinas[i] = JOptionPane.showInputDialog(null, "Digite a disciplina" + i);	
			}
			pf.setDisciplinas(disciplinas);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			int cur = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas cursos você possui?"));
			String cursos[] = new String[100];
			for (int i = 1; i < (cur+1); i++){
				cursos[i] = JOptionPane.showInputDialog(null, "Digite o curso: " + i);	
			}
			pf.setCursos(cursos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Nome: " + pf.getNome());
		System.out.println("Endereço: " + pf.getEndereco());
		System.out.println("Bairro: " + pf.getBairro());
		System.out.println("CEP: " + pf.getCep());
		System.out.println("Cidade: " + pf.getCidade());
		System.out.println("Estado: " + pf.getEstado());
		System.out.println("RG: " + pf.getRg());
		System.out.println("CPF: " + pf.getCpf());
		System.out.println("Disciplinas: " + pf.getDisciplinas());
		System.out.println("Cursos: " + pf.getCursos());
	}
}


