import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
try (Scanner console = new Scanner(System.in)) {
  int num = console.nextInt();
  int fact = 1;
    for(int i=1; i <= num; i++)
  	  	  {
   
  	    	   fact = fact*i;
   	 	   }
   
   	        System.out.println("Factoral: "+ fact);
}
      }
        }
    
    