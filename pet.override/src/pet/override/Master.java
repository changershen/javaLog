package pet.override;

public class Master {
		// 给狗看病
		public void cure(Dog dog) {
			if (dog.getHealth() < 50) {
				dog.setHealth(60);
				System.out.println("打针、吃药");
			}
		}

		// 给企鹅看病
		public void cure(Penguin penguin) {
			if (penguin.getHealth() < 50) {
				penguin.setHealth(70);
				System.out.println("吃药、疗养");
			}
		}
}
