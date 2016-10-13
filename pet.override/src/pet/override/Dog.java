package pet.override;

public class Dog extends Pet {
	private String strain;//品种
	
	public Dog(){
		/**
		 * 有参构造方法
		 * name 昵称
		 * strain 品种 
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
		System.out.println("我是一直"+this.getStrain()+"犬");
	}
	
	
}
