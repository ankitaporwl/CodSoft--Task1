import java.util.*;
class num{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		int b=0;
		while(b!=1){
			Random random=new Random();
			int a=random.nextInt(100);
			System.out.print("Enter the attempts you need , should be greater than zero :");
			int n=sc.nextInt();
			int i;
			for(i=n;i>=1;i--){
				System.out.print("Enter Number :");
				int j=sc.nextInt();
				if(a==j){
					System.out.println("Number Guessed");
					System.out.print("Performance:");
					if(i>=n/2){
						System.out.println("Excellent");
					}
					else if(i<n/2){
						System.out.println("Good");
					}
					break;
				}
				else if(j<=(a-10)||j>=(a+10)){
					System.out.println("Too Low");
				}
				else{
					System.out.println("Too High");
				}
				System.out.println("Number of attempts left:"+(i-1));
			}
			if(i==0){
				System.out.println("Performance:Worst");
				System.out.println("Game Over");
				System.out.println("Better Luck Next Time");
			}
			System.out.print("Do you want to play again?(Y/N):");
			String s=sc.next();
		
			if(s.charAt(0)=='n'||s.charAt(0)=='N')
			{
				System.out.println("Game Over");
				break;
			}
		}
	}
}