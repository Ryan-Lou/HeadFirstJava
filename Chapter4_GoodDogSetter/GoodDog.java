class GoodDog {
	private int size;


	public int getSize() {
		return size;
	}

	public void setSize(int s) {
		size = s ;
	}

	void bark() {
		if (size > 60) {
			System.out.println("Wooof! Wooof!");
		} else if (size > 14) {
			System.out.println("Ruff!	Ruff!");
		} else {
			System.out.println("Yip!	Yip!");
		}
	}
}



class GoodDogTestDrive {
	public static void main(String[] args) {
		GoodDog one = new GoodDog();
		one.setSize(70);
		GoodDog two = new GoodDog();
		two.setSize(8);
		GoodDog three = new GoodDog();
		three.setSize(30);
		System.out.println("Dog one: " + one.getSize());
		one.bark();
		System.out.println("Dog two: " + two.getSize());
		two.bark();
		System.out.println("Dog three: " + three.getSize());
		three.bark();
	}
}