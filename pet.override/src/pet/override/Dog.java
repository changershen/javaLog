package pet.override;

public class Dog extends Pet {
	private String strain;//Ʒ��
	
	public Dog(){
		/**
		 * �вι��췽��
		 * name �ǳ�
		 * strain Ʒ�� 
		 */
	}
	
	public Dog(String name,String strain){
		super(name);
		this.strain=strain;
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	public void print(){
		super.print();
		System.out.println("����һֱ"+this.getStrain()+"Ȯ");
	}
	
	
}
