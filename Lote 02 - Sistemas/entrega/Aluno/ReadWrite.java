import java.io.*;

import javax.swing.JOptionPane;

public class ReadWrite {
	public Aluno[] GravaAluno(Aluno aluno[]) throws IOException {
		String fileName = "ArquivoAluno.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

		for (int i = 0; i < 3; i++)
			aluno[i] = new Aluno();

		for (int i = 0; i < 3; i++) {
			aluno[i].pnome = JOptionPane.showInputDialog("Entre o nome do aluno:");
			writer.write(aluno[i].pnome);
			writer.newLine();
			aluno[i].unome = JOptionPane.showInputDialog("Entre o sobrenome do aluno:");
			writer.write(aluno[i].unome);
			writer.newLine();
			aluno[i].pontos = Integer.parseInt(JOptionPane.showInputDialog("Pontos Gradua��o do aluno:"));
			writer.write(Integer.toString(aluno[i].pontos));
			writer.newLine();

		}

		for (int i = 0; i < 3; i++) {
			System.out.println(aluno[i].pnome + " " + aluno[i].unome + " pontos: " + aluno[i].pontos);
		}
		writer.close();
		return aluno;
	}

	public void LerAluno(Aluno aluno[]) throws IOException {
		String fileName = "ArquivoAluno.txt";
		BufferedReader reader = new BufferedReader(new FileReader(fileName));

		for (int i = 0; i < 3; i++)
			aluno[i] = new Aluno();

		for (int i = 0; i < 3; i++) {
			aluno[i].pnome = reader.readLine();
			aluno[i].unome = reader.readLine();
			aluno[i].pontos = Integer.parseInt(reader.readLine());
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(aluno[i].pnome + " " + aluno[i].unome + " pontos: " + aluno[i].pontos);
		}
		reader.close();
	}
}
