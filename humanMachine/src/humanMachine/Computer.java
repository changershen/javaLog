package humanMachine;
/**
 * �����������
 * @author shen
 *
 */
public class Computer {
	String name = "����";
	int score = 0;//����
	public int showFirst(){
		//����һ�������
		int show =(int)(Math.random()*10)%3;
		switch(show){
		case 1:
			System.out.println(name+"��ȭ������");
			break;
		case 2:
			System.out.println(name+"��ȭ��ʯͷ");
			break;
		case 3:
			System.out.println(name+"��ȭ����");
			break;
		default:
			System.out.println("��������");
			break;
		}
		return show;
	}
}
