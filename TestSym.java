public class TestSym {
	public static void test (TicTacToeGame g1, TicTacToeGame g2) {
		System.out.println("****************");
		System.out.println(g1.equalsWithSymmetry(g2));
		System.out.println("****************");
	}
	public static void main(String[] args) {
		TicTacToeGame g1 = new TicTacToeGame(3,4);
		TicTacToeGame g2 = new TicTacToeGame(3,4);

		System.out.println("Creating g1");
		g1.play(0);
		g1.play(1);
		g1.play(3);
		g1.play(5);
		System.out.println(g1.toString());


		System.out.println("Creating g2");
		g2.play(1);
		g2.play(0);
		g2.play(3);
		g2.play(5);
		System.out.println(g2.toString());

		test(g1, g2);
	}
}
