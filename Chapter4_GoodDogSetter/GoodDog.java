import java.util.Random;

class GoodDog {
    private int[] sizes;

    public int[] getSizes() {
        return sizes;
    }

    public void setSizes(int[] sizes) {
        this.sizes = sizes;
    }

    public void bark() {
        for (int size : sizes) {
            if (size > 60) {
                System.out.println("Wooof! Wooof!");
            } else if (size > 30) {
                System.out.println("Ruff! Ruff!");
            } else {
                System.out.println("Yip! Yip!");
            }
        }
    }
}

class GoodDogTestDrive {
    public static void main(String[] args) {
        Random random = new Random();
        GoodDog dog = new GoodDog();
        int[] sizes = new int[5];
        
        for (int i = 0; i < 5; i++) {
            sizes[i] = random.nextInt(101); 
        }
        
        dog.setSizes(sizes);
        
        for (int size : dog.getSizes()) {
            System.out.println("Dog size: " + size);
        }
        
        dog.bark();
    }
}
