package pet.override;

public class Penguin extends Pet {
	private String sex;//性别
	/**
	 * 有参构造方法
	 * name昵称
	 * sex性别
	 */
	public Penguin(String name, String sex) {
		super(name);
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}	
	
	public void print(){
		super.print();
		System.out.println("我的性别是"+this.getSex()+"。");
	}
}
