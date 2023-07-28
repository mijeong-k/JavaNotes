package sec03.exam02;

public class AnimalExample {
	   public static void main(String[] args) {
	      Dog dog = new Dog();
	      Cat cat = new Cat();

	      dog.sound();
	      cat.sound();
	      dog.breathe();
	      System.out.println("-----");

	      // 변수 선언
	      Animal animal = null;

	      
	      // 변수의 자동 타입 변환
	      animal = new Dog();
	      animal.sound();
	      animal = new Cat();
	      animal.sound();
	      System.out.println("-----");

	      // 메소드의 다형성
	      animalSound(new Dog());
	      animalSound(new Cat());
	   }
	   							// animal = new Dog(); 
	   public static void animalSound(Animal animal) {
	      animal.sound();
	   }
	}