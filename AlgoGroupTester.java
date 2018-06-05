import java.util.ArrayList;

public class AlgoGroupTester {
	public static void main(String[] args){
		AlgoGroup minmax = new AlgoGroup();
		int[] numbers = {3, -1, 1, 5};
		String[] a = new String[3];
		a = minmax.printMinMaxAvg(numbers);
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		ArrayList<Object> thisString = minmax.swapDojo(numbers);
		System.out.println(thisString);
		int[] sq = minmax.square(numbers);
		System.out.println(sq);
		minmax.printOdd();
		int[] sh = minmax.shift(numbers);
		for(int i = 0; i < sh.length; i++) {
			System.out.print(sh[i] + " ");
		}
		int morethanone = minmax.greaterThanY(numbers,1);
		System.out.println("GREATER THAN:: ");
		System.out.println(morethanone);
	}
}