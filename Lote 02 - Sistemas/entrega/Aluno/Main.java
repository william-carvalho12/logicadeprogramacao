import java.io.IOException;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) throws IOException {
		int option = 0;
		Aluno[] aluno = new Aluno[3];
		ReadWrite rw = new ReadWrite();
		do {
			option = Integer.parseInt(
					JOptionPane.showInputDialog("Menu principal" + "\n 1-Grava Aluno" + "\n 2-Ler Aluno" + "\n 9-Fim"));
			switch (option) {
			case 1:
				aluno = rw.GravaAluno(aluno);
				break;
			case 2:
				rw.LerAluno(aluno);
				break;
			}
		} while (option != 9);

	}
}
