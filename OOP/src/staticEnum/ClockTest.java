package staticEnum;

import staticEnum.Clock.Format;

public class ClockTest {

	public static void main(String[] args) {
		
		Clock c1 = new Clock(23,59,Format.MILITARY_TIME);
		System.out.println(c1.toString());
		System.out.println(c1.setHours(0));
		System.out.println(c1.toString());
		
		
		Clock c2 = new Clock(23,59,Format.STANDARD_TIME);
		System.out.println(c1.toString());
		System.out.println(c1.setHours(0));
		System.out.println(c2.toString());

	}

}
