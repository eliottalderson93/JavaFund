import java.util.ArrayList;
public class AlgoGroup {
	public String[] printMinMaxAvg(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		double sum = 0;

		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min) {
				min = arr[i];
			}
			if(arr[i] > max) {
				max = arr[i];
			}
			sum = sum + arr[i];
		}	

		double avg = sum/arr.length;
		String[] output = new String[] {Integer.toString(min), Integer.toString(max), Double.toString(avg)};
		return(output);
	}

	public ArrayList<Object> swapDojo(int[] arr){
		ArrayList<Object> list = new ArrayList<Object>();
		for(int i = 0; i<arr.length; i++){
			if(arr[i] < 0){
				list.add(0);
			// 	arr[i] = Integer.toString(arr[i]);
			// 	arr[i] = "Dojo";
			}
			else {
			// 	arr[i] = Integer.toString(arr[i]);
				list.add(arr[i]);
			}
	}
		return list;
	}
	public int[] square(int[] arr){
		for(int i = 0; i<arr.length; i++){
			arr[i] = arr[i]*arr[i];
		}
		return arr;
	}	
	public void printOdd(){
		for (int i = 1; i<256; i = i+2){
			System.out.print(i+" ");
		}
	}
	public int[] shift(int[] arr){
		for(int i =0; i< arr.length-1; i++){
			arr[i] = arr[i+1];
		}
		arr[arr.length-1]=0;
		return arr;
	}
	public int greaterThanY(int[] arr, int y){
		int count =0;
		for(int i =0; i<arr.length; i++){
			if (arr[i] > y){
				count++;
			}
		}
		return count;
	}

} 