import java.util.ArrayList;
import java.util.List;

public class MultiThreadArmstrong implements Runnable {
	int start;
	int finish;
	public MultiThreadArmstrong(int s,int f) {
		this.start = s;
		this.finish = f;
	}
	public void run() {
		//System.out.println("Thread " + 
        //        Thread.currentThread().getId() + 
        //        " is running");
		try {
			List<Integer> outList = new ArrayList<Integer>();
			for (int i = start; i <= finish; i++) {
				int outNum = 0;
				int tempNum = i;
				while (tempNum > 0) {
					outNum = (int) (outNum + Math.pow((tempNum % 10), String.valueOf(i).length()));
					tempNum = tempNum / 10;
					// System.out.println(String.valueOf(i).length());

				}
				// System.out.println(outNum);
				if (outNum == i) {

					Armstrong.outList1.add(i);
					//System.out.println(i);
				}

			}
		} catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}

	

//	System.out.println("Thread " + 
//            Thread.currentThread().getId() + 
//            " has ended");
	}
}
