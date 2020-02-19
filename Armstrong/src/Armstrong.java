import java.util.ArrayList;
import java.util.List;

public class Armstrong {
	public static List<Integer> armstrong(int num){
		
		List<Integer> outList = new ArrayList<Integer>();
		for(int i = 0; i<=num; i++) {
			int outNum = 0;
			int tempNum = i;
			while(tempNum>0) {
				outNum = (int) (outNum + Math.pow((tempNum%10),String.valueOf(i).length()));
				tempNum = tempNum/10;
				System.out.println(String.valueOf(i).length());
				
			}
			System.out.println(outNum);
			if (outNum == i) {
			
				outList.add(i);
			}
		}
		
		
		
		return outList;
		
	}
public static void main(String[] args) {
	System.out.println(armstrong(10));
}
}
