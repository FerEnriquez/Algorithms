import java.util.Scanner;
public class BathroomStalls{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Test cases:");
		int t = s.nextInt();
		int contador = 0;

		int result = 0;
		while(contador < t){
			System.out.print("N: ");
			int n = s.nextInt();
			System.out.print("K: ");
			int k = s.nextInt();
			if(n == k){
				result = 0;
			}
			else if(n%2 == 0){
				result = par(n,k);
			}
			else{

				result = impar(n,k);
			}

			contador++;
			System.out.println(result);
		}
	}
	public static int par(int n, int k){
		int ls, rs;
		int[] bathroom = new int[n+2];
		bathroom[0] = 1;
		bathroom[n+1] = 1;
		//Primera persona
		bathroom[(n/2)] = 1;
		ls = n/2;
		rs = n/2;
		//Segunda persona

	}
	public static int impar(int n, int k){
		
		int[] bathroom = new int[n+2];
		bathroom[0] = 1;
		bathroom[n+1] = 1;
		//Primera persona
		bathroom[(n+1)/2] = 1;

		return (n+1)/2;
	} 

}