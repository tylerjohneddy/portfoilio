
public class ChickenRabbits {

	public static void main(String[] args) {
chickenRabbit(35, 94);
chickenRabbit1(36, 96);
	}
	public static void chickenRabbit(int heads,int legs) {
		int rabbit  = (legs/2) - heads;
		int chicken = heads - rabbit;
		System.out.println(rabbit+" "+chicken);
	}
	public static void chickenRabbit1(int heads,int legs) {
		for (int i = 0; i<=heads;i++) {
			int rabbit = heads-i;
			int chicken = i;
			if (rabbit*4 + chicken*2 == legs) {
				System.out.println(rabbit+" "+chicken);
				break;
			}
		}
	}

}
