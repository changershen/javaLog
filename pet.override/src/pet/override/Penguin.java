package pet.override;

public class Penguin extends Pet {
	private String sex;//�Ա�
	/**
	 * �вι��췽��
	 * name�ǳ�
	 * sex�Ա�
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
		System.out.println("�ҵ��Ա���"+this.getSex()+"��");
	}
}
