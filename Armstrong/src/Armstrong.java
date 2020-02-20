import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Armstrong {
	static List<Integer> outList1 = new ArrayList<Integer>();
	static List<Integer> iterateStream(int from, int step, int limit) {
	    return IntStream.iterate(from, i -> i+step) // next int
	            .limit(limit/step) // only numbers in range
	            .boxed()
	            .collect(Collectors.toList());
	}
	public static List<Integer> armstrong(int num) {

		List<Integer> outList = new ArrayList<Integer>();
		for (int i = 0; i <= num; i++) {
			int outNum = 0;
			int tempNum = i;
			while (tempNum > 0) {
				outNum = (int) (outNum + Math.pow((tempNum % 10), String.valueOf(i).length()));
				tempNum = tempNum / 10;
				// System.out.println(String.valueOf(i).length());

			}
			
			// System.out.println(outNum);
			if (outNum == i) {

				
				outList.add(i);
			}
		}

		return outList;

	}

	public static void main(String[] args) {
		//System.out.println(armstrong(5000000));
		float cores = Runtime.getRuntime().availableProcessors();
		// System.out.println(cores);
		int num = 100000000;
		List<Thread> threads = new ArrayList<Thread>();
		for (int i = 0; i < cores; i++) {
			// System.out.println(Math.round(num/(cores)*i)+"
			// "+Math.round(num/(cores)*(i+1)));

			Thread temp = new Thread(
					new MultiThreadArmstrong(iterateStream(i,(int) cores, num-i)));
			temp.start();
			threads.add(temp);


		}
		
		for(Thread thread: threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		outList1.sort(null);
		System.out.println(outList1.toString());

	}
}
