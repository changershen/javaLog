package humanMachine;
import java.util.*;
/**
 * �����û���
 * @author shen
 * 
 */
public class Person {
	String name = "����";
	int score = 0;
	/**
	 * ��ȭ
	 * @author Administrator
	 * @return��ȭ�����1ʯͷ��2������3��
	 * */
	public int shownFirst(){
		Scanner input = new Scanner(System.in);
		System.out.println("\t���ȭ��1������ ��2.ʯͷ��3.�� \n\t (��������Ӧ�����֣�)");
		int show = input.nextInt();
		switch(show){
		case 1:
			System.out.println("���ȭ������");
			break;
		case 2:
			System.out.println("���ȭ��ʯͷ");
			break;
		case 3:
			System.out.println("���ȭ����");
			break;
		}
		return show;
	}
	
}
