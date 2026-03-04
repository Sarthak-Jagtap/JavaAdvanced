package questions;

import java.util.Arrays;
import java.util.Scanner;

public class Questions {
	Scanner sc = new Scanner(System.in);
	void motherTongue() {
		System.out.println("Enter Mother Tongue : ");
		String lang = sc.next();
		
		System.out.println(lang.charAt(0));
	}
	
	void specicalPrint() {
		System.out.println("Enter a string : ");
		String str = sc.next();
		
		System.out.println(str.charAt(0) + str);
	}
	
	void reverseString() {
		System.out.println("Enter a string : ");
		String str = sc.next();
		
		StringBuffer rev = new StringBuffer(str).reverse();
		System.out.println(rev);
		
	}
	
	String sortString(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        return new String(arr);
    }
	
	boolean isAnagram(String s, String t) {
        if(s.length() == t.length()){
            s = sortString(s);
            t = sortString(t);

            if(s.equals(t))
                return true;
            return false;
        }

        return false;
    }
	
	
	void checkAnagram() {
		System.out.println("Enter a string 1 : ");
		String str1 = new String(sc.next());
		System.out.println("Enter a string 2 : ");
		String str2 = new String(sc.next());
				
		System.out.println(isAnagram(str1,str2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Questions q = new Questions();
		
		q.checkAnagram();
	}

}
