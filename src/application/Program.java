package application;
import java.util.Scanner;
import entities.*;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Game game = new Game(new Board());

		int troca=1;
		
		while(!game.testFimDeJogo()) {
			game.board.showBoard();
			System.out.println();
			if(troca==1) {
				System.out.print("Escolha uma posição jogador 1 ([linha][coluna]):");
				int linha = sc.nextInt();
				int coluna = sc.nextInt();	
				troca *= game.p1.preencher(linha, coluna);
				
				
			}else {
				System.out.print("Escolha uma posição jogador 2 :([linha][coluna]):");
				int linha = sc.nextInt();
				int coluna = sc.nextInt();
				troca *= game.p2.preencher(linha, coluna);
			}
			
			troca*=-1;
			
		}
		game.board.showBoard();
		System.out.println("Game over");
		sc.close();
		
	}

}
