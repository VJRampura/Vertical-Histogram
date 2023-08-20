import java.io.* ;
class VerticalHistogram {

	public static void main(String args[]) {
		Console cn = System.console();
		int arr[]= new int[10], i, j, k, no, max=0;
		cn.printf("Enter 10 Values: \n");
		for(i = 0; i < arr.length; i++){
			arr[i] = Integer.parseInt(cn.readLine());
			if (arr[i] > max)
				max = arr[i];
		}

		while(max > 0){
			for(i = 0; i < arr.length; i++){
				if(arr[i] >= max)
					cn.printf("* ");
				else
					cn.printf("  ");
			}
			max--;
			cn.printf("\n");
			
		}
		for(i = 0 ; i < arr.length ; i++)
			cn.printf(arr[i] + " " );


	}

}