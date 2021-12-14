package demo.com;

import java.util.Scanner;

public class Crecket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	  int[] runs=new int[30];
	  int turns=3;
	  int totalruns=0;
	  for(int i=1;i<runs.length;i++) {
		  System.out.println("run per ball");
		  runs[i]=sc.nextInt();
		  if(runs[i]==1) {
			  turns=3;
			  totalruns=totalruns+runs[i];
			  System.out.println(totalruns+"runs in "+i+" balls and no.of turns let be out is "+turns);
			  
		  }
		  else if(runs[i]==0) {
			  turns--;
			  System.out.println(totalruns+"runs in "+i+" balls and no.of turns let be out is "+turns);
			  if(turns==0) {
				  runs=new int[0];
				  System.out.println("Sorry, you don't have any turns ");
				  System.out.println(" your fail score is "+totalruns+" runs in "+i+" balls ");
			  }
			  
		  }
		  
	  }

	}

}
