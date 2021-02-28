import javax.swing.JOptionPane;

public class SistemadeCurso {
	
	public static void main(String[] args) {
		
		String valida;
		String valida2;
		
		aluno();
		sala1();
		sala2();
		café1();
		café2();
		
		if (i % 2 == 0){
			valida = sala1();
		}else {
			valida = sala2();
		}
		if (i % 2 == 0){
			valida2 = café1();
		}else {
			valida2 = café2();
		}
		
		JOptionPane.showMessageDialog(null, aluno()+valida+valida2);
		
	}
	
	protected static int i = Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade de alunos registrados."));
	protected static int j = 0;
	protected static String alunos[][] = new String[i][j];
	protected static int x = Integer.parseInt(JOptionPane.showInputDialog("digite a lotação da sala 1"));
	protected static int y = Integer.parseInt(JOptionPane.showInputDialog("digite a lotação da sala 2"));
	protected static int z = 0;
	protected static int k = 0;
	protected static String sala1[] = new String[x];
	protected static String sala2[] = new String[y];
	protected static String cafe1[] = new String[z];
	protected static String cafe2[] = new String[k];
	
	protected static String nome;
	protected static String sobrenome;
	
	protected static String aluno() {
		for (i = 0; i < alunos.length; i++) {
			nome = JOptionPane.showInputDialog("Digite o nome do aluno.");
			for (j = 0; j < alunos.length; j++) {
				sobrenome = JOptionPane.showInputDialog("Digite o sobrenome do aluno.");
			}
		}
		return alunos[i][j];
	}
	
	protected static String sala1(){
		if (i % 2 == 0) {
			for (x = 0; x < sala1.length; x++) {
				alunos[i][j]=sala1[x];
			}
		} 
		return sala1[x];		
	}
	protected static String sala2(){
		if (i % 2 == 1) {
			for (y = 0; x < sala2.length; y++) {
				alunos[i][j]=sala2[y];
			}
		} 
		return sala2[y];		
	}
	
	protected static String café1() {
		for (int i = 0; i < cafe1.length; i++) {
			sala1[x]=cafe1[z];
		}
		return cafe1[z];
		
	}
	protected static String café2() {
		for (int i = 0; i < cafe2.length; i++) {
			sala2[y]=cafe2[k];
		}
		return cafe2[k];
		
	}

}
