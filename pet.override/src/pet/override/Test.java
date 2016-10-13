package pet.override;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Dog dog=new Dog();
		dog.setHealth(10);
		dog.setName("多多");
		dog.setLove(50);
		dog.setStrain("吉娃娃");
		dog.print();
		System.out.println("*************************");
		Master master=new Master();
		master.cure(dog);
		dog.print();
	}

}
