public class Main {
	
	public static void main(String[] args) {
		System.out.println("Main.main()");
		//Arrays
		int arr[]= {1,2,3,4,5};
		 int[][] matrix = { { 4, 5 }, { 34, 67 }, { 8, 9 } };
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0 ;i<matrix.length;i++) {
			for(int j=0;j<matrix.length-1;j++) {
				
				 System.out.println("matrix[" + i + "][" + j
                         + "]=" + matrix[i][j]);
			}
		}
	}

}
