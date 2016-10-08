package humanMachine;
/**
 * 创建计算机类
 * @author shen
 *
 */
public class Computer {
	String name = "电脑";
	int score = 0;//积分
	public int showFirst(){
		//产生一个随机数
		int show =(int)(Math.random()*10)%3;
		switch(show){
		case 1:
			System.out.println(name+"出拳：剪刀");
			break;
		case 2:
			System.out.println(name+"出拳：石头");
			break;
		case 3:
			System.out.println(name+"出拳：布");
			break;
		default:
			System.out.println("输入有误！");
			break;
		}
		return show;
	}
}
