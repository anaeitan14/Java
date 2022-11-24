package Zoo;

public class Park {
	protected Animal[] animals;
	protected int animalCount;

	public Park() {
		animals = new Animal[1000];
		animalCount = 0;
	}

	public boolean addAnimal(Animal animal) {
		if (animalCount < animals.length) {
			animals[animalCount++] = animal;
			return true;
		}

		return false;
	}

	private Animal[] overTenHunter() {
		animalCount = 0;

		for (int i = 0; i < animalCount; i++) {
			if (!animals[i].isHunted && animals[i].getAge() > 10) {
				animalCount++;
			}
		}

		Animal[] animalNew = new Animal[animalCount];
		int animalNewCount = 0;

		for (int i = 0; i < animalCount; i++) {
			if (!animals[i].isHunted && animals[i].getAge() > 10) {
				animalNew[animalNewCount++] = animals[i];
			}
		}

		return animalNew;
	}

	private int reptileBirdHunter() {
		animalCount = 0;

		for (int i = 0; i < animalCount; i++) {
			if (animals[i] instanceof Bird || animals[i] instanceof Reptile) {
				if (!animals[i].isHunted) {
					animalCount++;
				}
			}
		}
		return animalCount;
	}

}
