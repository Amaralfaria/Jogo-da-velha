package entities;

public class Board {
	public char[][] matriz = new char[3][3];

	public Board() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = '-';
			}
		}
	}

	public void showBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j]);
				if (j != 2) {
					System.out.print(" | ");
				}
			}
			System.out.println();
		}
	}

	public boolean ocupada(int i, int j) {
		if (matriz[i][j] == '-') {
			return false;
		}
		return true;
	}
}
