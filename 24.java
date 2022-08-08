class Array
{
	public static void main(String args[])
	{
		int arr[] = {10,20,30,40,50};
		
		for(int i = 0 ; i <= 4 ; i++)
		{
			System.out.println(arr[i]);
		}
		
		
        int[][] arr2d = { { 1, 2 }, { 3, 4 } };
  
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                System.out.println("arr[" + i + "][" + j + "] = "+ arr2d[i][j]);
	}
}