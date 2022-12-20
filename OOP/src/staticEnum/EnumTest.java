package staticEnum;

public class EnumTest {

	enum Foods {POTATO, CHIPS, COOKIES};
	 
	public static void main(String[] args) {
		Foods food = Foods.POTATO;
		System.out.println(food);
		System.out.println(food.toString());
		System.out.println(food.ordinal());

	}

}
