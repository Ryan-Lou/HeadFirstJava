class Dog {
	String name;
	public static void main(String[] args) {
		// make a Dog object and access it
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";

		// make a Dog array
		Dog[] myDogs = new Dog[3];
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;

		//references
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";

		System.out.print("last dog's name is ");
		System.out.println(myDogs[2].name);

		//tell all dogs to bark
		int x = 0;
		while(x < myDogs.length){
			myDogs[x].bark();
			x = x + 1;

		}
	}
	public void bark() {
		System.out.println(name + " says Ruff! Wang! wang!");
	}
	public void eat(){	}
	public void chaseCat(){	}
}