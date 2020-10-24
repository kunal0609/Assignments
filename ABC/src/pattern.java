import java.util.Scanner; 

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows :");
		int N = sc.nextInt();
		
		for(int r=1; r<=N; r++)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print(" "+c);
			}
			
			for(int c=r-1; c>0; c--)
			{
				System.out.print(" "+c);
			}
			System.out.println("\n");
		}
		
		
		
	}

}
