package humanMachine;
import java.util.*;
/**
 * 创建用户类
 * @author shen
 * 
 */
public class Person {
	String name = "匿名";
	int score = 0;
	/**
	 * 出拳
	 * @author Administrator
	 * @return出拳结果：1石头，2剪刀，3布
	 * */
	public int shownFirst(){
		Scanner input = new Scanner(System.in);
		System.out.println("\t请出拳：1，剪刀 ，2.石头，3.布 \n\t (请输入相应的数字：)");
		int show = input.nextInt();
		switch(show){
		case 1:
			System.out.println("你出拳，剪刀");
			break;
		case 2:
			System.out.println("你出拳，石头");
			break;
		case 3:
			System.out.println("你出拳，布");
			break;
		}
		return show;
	}
	
}
