 import java.util.*;

class largest{
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int a[]=new int[n];
	    int i,b=0;
	    for( i=0;i<n;i++)
	    {   
	        a[i]=s.nextInt();
	    
	    }
	   Arrays.sort(a);
	     for( i=0;i<n;i++)
	    {   
	       b=a[i];
	   
          } System.out.println(b);
	 }
}
