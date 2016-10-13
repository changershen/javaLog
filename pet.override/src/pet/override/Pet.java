package pet.override;

public class Pet {
	private String name = "无";//昵称
	private int health = 100;//健康值
	private int love = 20;
	
	/**
	 * 无参构造方法
	 * name昵称
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
			System.out.println("亲密度应该在0至100之间");
			this.love = 10;
		}
		
		this.love = love;
	}

	/**
	 * 输出宠物信息
	 */

	public void print(){
		System.out.println("宠物的自白：\n我的名字叫"+this.name+",我的健康值是"+this.health+"，我和主任的亲密度是"+this.love+"。");
	}
	
	
			
}
