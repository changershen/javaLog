package pet.override;

public class Pet {
	private String name = "��";//�ǳ�
	private int health = 100;//����ֵ
	private int love = 20;
	
	/**
	 * �޲ι��췽��
	 * name�ǳ�
	 */
	public Pet(){}
	
	public Pet(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		if(love<0||love>100){
			System.out.println("���ܶ�Ӧ����0��100֮��");
			this.love = 10;
		}
		
		this.love = love;
	}

	/**
	 * ���������Ϣ
	 */

	public void print(){
		System.out.println("������԰ף�\n�ҵ����ֽ�"+this.name+",�ҵĽ���ֵ��"+this.health+"���Һ����ε����ܶ���"+this.love+"��");
	}
	
	
			
}
