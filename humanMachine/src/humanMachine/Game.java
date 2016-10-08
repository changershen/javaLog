package humanMachine;
import java.util.*;
/**
 * ��Ϸ��
 * @author shen
 */
public class Game {
	Person person;
	Computer computer;
	int count;//��ս����
	/*
	 * ��ʼ��
	 */
	public void initial(){
		person = new Person();
		computer = new Computer();
		count= 0;	
	}
	/*
	 * ��Ϸ��ʼ
	 */
	public void startGame(){
//		initial();
		System.out.println("----------------�� ӭ �� �� �� Ϸ �� ��----------------\n");
		System.out.println("\n\t\t******************");
		System.out.println  ("\t\t**  ��ȭ, ��ʼ    **");
		System.out.println  ("\t\t******************");
		System.out.println("\n��ȭ����1.���� 2.ʯͷ 3.��");
		String exit = "n";//�˳�ϵͳ
		//��Ϸ��ʼ
		do{
			initial();
			/*ѡ��Է���ɫ*/
			System.out.print("��ѡ��Է���ɫ��1������ 2����Ȩ 3���ܲ٣��� ");
			Scanner input = new Scanner(System.in);
			int role = input.nextInt();
			switch(role){
			case 1:
				computer.name = "����";
				break;
			case 2:
				computer.name = "��Ȩ";
				break;
			case 3:
				computer.name = "�ܲ�";
				break;	
			}
			
			//�����û�����
			System.out.print("���������������");
			person.name = input.next();
			System.out.println(person.name+"   VS  "+computer.name+"    ��ս\n");
			System.out.print("Ҫ��ʼ�𣿣�y/n�� ");
			String start = input.next();  // ��ʼÿһ����Ϸ
			//��ʼ��Ϸ
			
			int perFist;//�û���ȭ
			int compFist;//�������ȭ
			while(start.equals("y")){
				/*��ȭ*/
				perFist = person.shownFirst();
				compFist = computer.showFirst();
				
				/*�þ�*/
				if((perFist == 1 && compFist == 1) || (perFist == 2 && compFist == 2) || (perFist == 3 && compFist == 3)){
					System.out.println("���:�;�,��˥��\n");  //ƽ��
				}else if((perFist == 1 && compFist == 3) || (perFist == 2  && compFist == 1) || (perFist == 3 && compFist == 2)){
					System.out.println("����� ��ϲ�� ��Ӯ�ˣ�");  //�û�Ӯ	
					person.score++;
				}else{
					System.out.println("���˵:^_^,�����ˣ��汿!\n");  //�����Ӯ		
					computer.score++;
				}
				count++;
				System.out.println("�Ƿ�ʼ��һ�֣�");
				start = input.next();
			}
			//��ʾ���
			showResult();
			System.out.println("\nҪ��ʼ��һ����(y/n)��");
			exit = input.next();
			System.out.println();
		
		}while(!exit.equals("n"));
		System.out.println("ϵͳ�˳���");	
	}
	//��ʾ���
	public void showResult(){
		/*��ʾ�����*/
		System.out.println("---------------------------------------------------");
		System.out.println(computer.name + "  VS  " + person.name);
		System.out.println("��ս������"+ count);
		
		int result =calcResult();
		if(result == 1){
			System.out.println("��������ƽ�֣��´��ٺ���һ�ָ��£�");
		}else if(result == 2){
			System.out.println("�������ϲ��ϲ��");   //�û���ʤ
		}else{ 
			System.out.println("������Ǻǣ��������´μ��Ͱ���");   //�������ʤ
		}
		System.out.println("---------------------------------------------------");
	}
	//������
	public int calcResult(){
		if(person.score == computer.score){
			return 1;//ƽ��
		}else if(person.score > computer.score){
			return 2;//�û�Ӯ
		}else{
			return 3;//�����Ӯ
		}
	}
}
