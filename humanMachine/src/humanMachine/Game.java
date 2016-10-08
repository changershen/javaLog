package humanMachine;
import java.util.*;
/**
 * 游戏类
 * @author shen
 */
public class Game {
	Person person;
	Computer computer;
	int count;//对战次数
	/*
	 * 初始化
	 */
	public void initial(){
		person = new Person();
		computer = new Computer();
		count= 0;	
	}
	/*
	 * 游戏开始
	 */
	public void startGame(){
//		initial();
		System.out.println("----------------欢 迎 进 入 游 戏 世 界----------------\n");
		System.out.println("\n\t\t******************");
		System.out.println  ("\t\t**  猜拳, 开始    **");
		System.out.println  ("\t\t******************");
		System.out.println("\n出拳规则：1.剪刀 2.石头 3.布");
		String exit = "n";//退出系统
		//游戏开始
		do{
			initial();
			/*选择对方角色*/
			System.out.print("请选择对方角色（1：刘备 2：孙权 3：曹操）： ");
			Scanner input = new Scanner(System.in);
			int role = input.nextInt();
			switch(role){
			case 1:
				computer.name = "刘备";
				break;
			case 2:
				computer.name = "孙权";
				break;
			case 3:
				computer.name = "曹操";
				break;	
			}
			
			//输入用户姓名
			System.out.print("请输入你的姓名：");
			person.name = input.next();
			System.out.println(person.name+"   VS  "+computer.name+"    对战\n");
			System.out.print("要开始吗？（y/n） ");
			String start = input.next();  // 开始每一局游戏
			//开始游戏
			
			int perFist;//用户出拳
			int compFist;//计算机出拳
			while(start.equals("y")){
				/*出拳*/
				perFist = person.shownFirst();
				compFist = computer.showFirst();
				
				/*裁决*/
				if((perFist == 1 && compFist == 1) || (perFist == 2 && compFist == 2) || (perFist == 3 && compFist == 3)){
					System.out.println("结果:和局,真衰！\n");  //平局
				}else if((perFist == 1 && compFist == 3) || (perFist == 2  && compFist == 1) || (perFist == 3 && compFist == 2)){
					System.out.println("结果： 恭喜， 你赢了！");  //用户赢	
					person.score++;
				}else{
					System.out.println("结果说:^_^,你输了，真笨!\n");  //计算机赢		
					computer.score++;
				}
				count++;
				System.out.println("是否开始下一轮？");
				start = input.next();
			}
			//显示结果
			showResult();
			System.out.println("\n要开始下一局吗？(y/n)：");
			exit = input.next();
			System.out.println();
		
		}while(!exit.equals("n"));
		System.out.println("系统退出！");	
	}
	//显示结果
	public void showResult(){
		/*显示最后结果*/
		System.out.println("---------------------------------------------------");
		System.out.println(computer.name + "  VS  " + person.name);
		System.out.println("对战次数："+ count);
		
		int result =calcResult();
		if(result == 1){
			System.out.println("结果：打成平手，下次再和你一分高下！");
		}else if(result == 2){
			System.out.println("结果：恭喜恭喜！");   //用户获胜
		}else{ 
			System.out.println("结果：呵呵，笨笨，下次加油啊！");   //计算机获胜
		}
		System.out.println("---------------------------------------------------");
	}
	//计算结果
	public int calcResult(){
		if(person.score == computer.score){
			return 1;//平局
		}else if(person.score > computer.score){
			return 2;//用户赢
		}else{
			return 3;//计算机赢
		}
	}
}
