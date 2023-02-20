import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner console = new Scanner(System.in);
	    int n = console.nextInt();
	    int mod = 0;
	    while(n != 0){
	        mod = mod + n%10;
	        n = n/10;
	    }
	    System.out.println(mod);
		
	}
}
