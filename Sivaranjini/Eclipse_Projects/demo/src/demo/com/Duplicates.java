package demo.com;

public class Duplicates {

	public static void main(String[] args) {
		String s1="welcome to java programming";
		char[] s2=s1.toCharArray();
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<s1.length();j++) {
				if(s2[i]==s2[j]) {
					System.out.println(s2[j]+" ");
					break;
				}
				
			}
		}

	}

	
	}


