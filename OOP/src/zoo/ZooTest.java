package zoo;

public class ZooTest {

	public static void main(String[] args) {

	}

	public static double allCalories(Animal[] animals) {
		double total = 0.0;

		for (int i = 0; i < animals.length; i++) {
			total += animals[i].getCalories();
		}
		return total;
	}

	public static void birdsSing(Animal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] instanceof Bird) {
				Bird bird = (Bird) animals[i];
				bird.Sing();
			}
		}
	}

	public static void snakeBirdDance(Animal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] instanceof Bird) {
				Bird bird = (Bird) animals[i];
				bird.Dance();
			} else if (animals[i] instanceof Snake) {
				Snake snake = (Snake) animals[i];
				snake.Dance();
			}
		}
	}

	public static String fattestHipo(Animal[] animals) {
		String name = "";
		double weight = 0.0;

		for (int i = 0; i < animals.length; i++) {
			if (animals[i] instanceof Hipo) {
				Hipo hipo = (Hipo) animals[i];
				if (hipo.getPercentageFat() > weight) {
					weight = hipo.getPercentageFat();
					name = hipo.getName();
				}
			}
		}

		return name;
	}
	
	

}
