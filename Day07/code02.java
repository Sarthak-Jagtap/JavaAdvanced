import java.util.*;

class Demo{

    public static int gcd(int a, int b) {
        // code here

	int min,max;
	if(a>b){
	    max = a;
	    min = b;
	}
	else if(b>a){
	    max = b;
	    min = a;
	}else{
	    return a;
	}
	
	if(max % min == 0) return min;
	
	TreeSet<Integer> factors = new TreeSet<Integer>();
	
	for(int i = 1; i*i<=min; i++){
	    if(min % i == 0){
		factors.add(i);
		factors.add(min/i);
	    }
	}

	System.out.println(factors);
	
	int hcf = 1;
	for(Integer temp : factors){
	    if(max % temp == 0)
		hcf = temp;
	}
	
	return hcf;
    }

    public static void main(String[] args){

	    System.out.println(gcd(10,4));
    }
}
