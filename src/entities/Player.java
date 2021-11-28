package entities;

public class Player {
	Board board;
	int jogador;
	public Player(Board board, int jogador) {
		this.board = board;
		this.jogador = jogador;
	}
	public int preencher(int linha,int coluna) {
		if(board.ocupada(linha -1, coluna -1)) {
			System.out.println("Casa ocupada jogue novamente");
			return -1;
		}else {
			if(jogador==1) {
				board.matriz[linha-1][coluna-1]='X';
			}else {
				board.matriz[linha-1][coluna-1]='O';
			}
		}
		return 1;
		
	}
	
}
