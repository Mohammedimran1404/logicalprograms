package programs;

import java.util.Random;

public class RandomNumbersGenerating {

	public static void main(String[] args) {
		Random rand = new Random();
		int rando=rand.nextInt(10); // for decimal value rand.nextDouble();
		System.out.println(rando);

	}

}
