public class main extends a {
	int i;
public int math(){
    
	System.out.println("\n\nDivided by 3: ");			
		for (int i=1; i<100; i++) {
			if (i%3==0)
				System.out.print(i +", ");			
		}
		System.out.println("\n");
    return 0;
   }

    	public static void main(String args[]) {
		
		main s=new main();
        int math = s.math();
  }
}


abstract class a {
    
    
 
   public abstract int math();
   
  
}