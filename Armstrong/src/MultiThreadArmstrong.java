import java.util.ArrayList;
import java.util.List;

public class MultiThreadArmstrong implements Runnable {
	int start;
	int finish;
	List<Integer> numList;
	public MultiThreadArmstrong(int s,int f) {
		this.start = s;
		this.finish = f;
	}
	public MultiThreadArmstrong(List<Integer> numList) {
		this.numList = numList;	
		
	}
	public void run() {
		//System.out.println("Thread " + 
        //        Thread.currentThread().getId() + 
        //        " is running");
		try {
			List<Integer> outList = new ArrayList<Integer>();
			//for (int i = start; i <= finish; i++) {
			for(int num :numList) {
				long outNum = 0;
				int tempNum = num;
				while (tempNum > 0) {
					outNum = (int) (outNum + Math.pow((tempNum % 10), String.valueOf(num).length()));
					tempNum = tempNum / 10;
					if(outNum>num||outNum>0) {
						break;
					}
					// System.out.println(String.valueOf(i).length());

				}
				// System.out.println(outNum);
				if (outNum == num) {

					Armstrong.outList1.add(num);
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
