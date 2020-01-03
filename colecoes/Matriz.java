package colecoes;

public class Matriz {
	public static void main(String[] args) {
		double[][] notasJ = { { 7.4, 6.2 }, { 4.7, 6.4 } };

		double[][] notasP = new double[2][];
		notasP[0] = new double[2];
		notasP[1] = new double[2];
		notasP[0][0] = 6.4;
		notasP[0][1] = 4.4;
		notasP[1][0] = 2.4;
		notasP[1][1] = 7.7;

		double totalJ = 0;
		int qtdNotasJ = 0;
		for (int i = 0; i < notasJ.length; i++) {
			for (int j = 0; j < notasJ[i].length; j++) {
				totalJ += notasJ[i][j];
				qtdNotasJ++;
			}
		}
		double totalP = 0;
		int qtdNotasP = 0;
		for (double[] notasParciais : notasP) {
			for (double nota : notasParciais) {
				totalP += nota;
				qtdNotasP++;

			}

		}
		
		System.out.println(totalP/qtdNotasP);
		System.out.println(totalJ/qtdNotasJ);
		
	}
}
