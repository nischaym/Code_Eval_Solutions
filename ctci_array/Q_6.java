package ctci_array;

public class Q_6 {

	public static void main (String[] args)
	{
		int[][] image = new int[3][3];
		tilt_by_90(image);
	}

	static void tilt_by_90(int[][] a)
	{
		int n = a.length;
		for (int layer = 0 ; layer < n/2;layer++)
		{
			int first = 0;
			int last = n - 1 - layer;
			
			for (int i = first; i < last ; i++)
			{
				int offset = i -first;
				int top = a[first][i];
				
				
				// left -> top 
				a[first][i] = a[last-offset][first];
				
				// botton - > left
				
				a[last-offset][first] = a[last][last-offset];
				
				// right -> bottom
				a[last][last - offset] = a[i][last]; 
				
				// top -> right
				a[i][last] = top;
				
			}

		}
	}
}
