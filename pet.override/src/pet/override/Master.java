package pet.override;

public class Master {
		// ��������
		public void cure(Dog dog) {
			if (dog.getHealth() < 50) {
				dog.setHealth(60);
				System.out.println("���롢��ҩ");
			}
		}

		// ����쿴��
		public void cure(Penguin penguin) {
			if (penguin.getHealth() < 50) {
				penguin.setHealth(70);
				System.out.println("��ҩ������");
			}
		}
}
