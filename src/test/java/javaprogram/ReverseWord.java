package javaprogram;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				
				String str="hello world avinash";
				String rev="";   //rev=0
				String a[]=str.split(" ");  // hello=0 world=1 guru=2
				
				for(int i=0;i<a.length;i++) //a.length=3  i=0
				{
					System.out.print(a[i]+" "); //hello world guru 
				}
				
				
				System.out.println("");
				
	     	for(int i=a.length-1;i>=0;i--) //3-1=2    i=2 i=1 i=0
		
	            {
			
		        	rev=rev+a[i]+ " ";  //rev=0,   0=0+guru, rev=guru+   , guru=guru +world ,rev=guru world , guru world =guru worl +hello+ =guru world hello
		       	}
		      
	     	   System.out.println(rev);
		}
		

	}


