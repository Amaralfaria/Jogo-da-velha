package entities;

public class Game {
	public Board board;
	public Player p1,p2;
	
	public Game(Board board) {
		this.board = board;
		p1 = new Player(board,1);
		p2 = new Player(board,2);
	}
	
	
	public boolean testGameOverLC() {
		
		int linha=0,coluna=0;
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				if(board.matriz[i][j]=='X') {
					linha++;
				}
				if(board.matriz[j][i]=='X') {
					coluna++;
				}
			}
			if(linha==3||coluna==3) {
				System.out.println("Vitoria jogador 1!");
				return true;
			}
			linha = 0;
			coluna=0;
		}
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				if(board.matriz[i][j]=='O') {
					linha++;
				}
				if(board.matriz[j][i]=='O') {
					coluna++;
				}
			}
			if(linha==3||coluna==3) {
				System.out.println("Vitoria jogador 2!");
				return true;
			}
			linha = 0;
			coluna=0;
		}
		return false;
		
	}
	public boolean testGameOverD() {
		
		/*
		if(game[0][0]=="X" && game[1][1] == "X" && game[2][2]=="X") {
			System.out.println("Vitoria jogador 1");
			return true; 
		}
		if(game[2][0]=="X" && game[1][1] == "X" && game[0][2]=="X") {
			System.out.println("Vitoria jogador 1");
			return true; 
		}
		
		if(game[0][0]=="O" && game[1][1] == "O" && game[2][2]=="O") {
			System.out.println("Vitoria jogador 2");
			return true; 
		}
		if(game[2][0]=="O" && game[1][1] == "O" && game[0][2]=="O") {
			System.out.println("Vitoria jogador 2");
			return true; 
		}*/
		int cima=0,baixo=0;
		for(int i=0,j=2;i<3;i++,j--) {
			if(board.matriz[i][i]=='X') {
				cima++;
			}
			if(board.matriz[j][i]=='X') {
				baixo++;
			}
		}
		if(cima==3||baixo==3) {
			System.out.println("Vitoria jogador 1");
			return true;
		}
		cima = 0;
		baixo = 0;
		
		for(int i=0,j=2;i<3;i++,j--) {
			if(board.matriz[i][i]=='O') {
				cima++;
			}
			if(board.matriz[j][i]=='O') {
				baixo++;
			}
		}
		if(cima==3||baixo==3) {
			System.out.println("Vitoria jogador 2");
			return true;
		}
		
		return false;
	}
	
	public boolean deuVelha() {
		
		for(int i=0;i<3;i++) {
			for(int j =0;j<3;j++) {
				if(board.matriz[i][j]=='-') {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean testFimDeJogo() {
		if(testGameOverD()) {
			System.out.println("diagonal");
			return true;
		}
		if(testGameOverLC()) {
			System.out.println("horizontal ou vertical");
			return true;
		}
		if(deuVelha()) {
			System.out.println("DEU VELHA!");
			return true;
		}
		return false;
	}
	
}

	

