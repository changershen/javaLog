package pet.override;

public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Dog dog=new Dog();
		dog.setHealth(10);
		dog.setName("���");
		dog.setLove(50);
		dog.setStrain("������");
		dog.print();
		System.out.println("*************************");
		Master master=new Master();
		master.cure(dog);
		dog.print();
	}

}
