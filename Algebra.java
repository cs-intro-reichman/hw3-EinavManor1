
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(210,100));   // 2 + 3
	    System.out.println(minus(787,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(-3,-4));  // -3 * -4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(-5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	public static int plus(int x1, int x2) {
		int i = x1;
		int j = 0;
		while (j != x2) {
			i++;
			j++;	
		}
		return i;
	}

	public static int minus(int x1, int x2) {
		int i = x1;
		int j = 0;
		while (j != x2) {
			i--;
			j++;	
		}
		return i;
	}

	public static int times(int x1, int x2) {
		int j = 1;
		int i = x1;
		boolean negetive = false;
		if(x2 == 0 || x1 == 0){
			i =0;
			return (i);
		}
		if (x2 < 0){
			int b = minus(0, x2);
			negetive =true;
			x2 = b;
			}
		if (x1 < 0){
			x1 = minus(0, x1);
			if(negetive == true){
				negetive =false;
				i = x1;
			}else{
				negetive =true;
				i = x1;
			}		
		}
		int midSum = i;
		if (x1 >0 && x2 > 0){
			while (j < x2) {
				midSum = (plus(i, midSum));	
				j++;	
			}
			i = midSum;
		}
		if(negetive == true){
			i = minus(0, i);
		}
	
	return (i);
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x1, int x2) {
		int i = x1;
		int n = 1;
		boolean negetive = false;
		if(x2 == 0){
			return 1;
		}
		if (x1 <= 0){
			i = minus(0,i);
			int mood = (mod(x2,2));
			if(mood != 0){
				negetive = true;
			}	
		}
		int midSum = i;
		while (n < x2){
			midSum = times(midSum, x1);	
			n++;
			i = midSum;
		}
		if(negetive == true){
			i = minus(0,i);
		}
	return (i);
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		int i = x1;
		boolean negetive = false;
		int j = 0;
		if(x1 == 0){
			j = 0;
		}
		if (x2 < 0){
			int b = minus(0, x2);
			negetive = true;
			x2 = b;
			}
		if (x1 < 0){
			x1 = minus(0, x1);
			if (negetive == true){
				negetive =false;
				i = x1;
			}else{
				negetive =true;
				i = x1;
			}		
		}
		int midSum = i;
		while (midSum >= x2) {
			midSum = (minus(midSum, x2));	
			j++;	
		}
		if(negetive == true){
			j = minus(0, j);
		}
	return (j);
	}
	
	public static int mod(int x1, int x2) {
		int i = x1;
		int midSum = i;
		if(x1 == 0){
			return 0;
			}
		if(x2 < 0){
			x2= (minus(0, x2));
		}
		if(x1 < 0){
			x1= (minus(0, x1));
		}
		i = x1;
		midSum = i;
		while (midSum >= x2) {
				midSum = (minus(midSum, x2));
				}
		return midSum;
	}	

	public static int sqrt(int x){
		if (x == 0){
			return x;
		}
		int j = 1;
		int midSum = 0;
		int top = 0 ;
		while (top <= x){
			midSum = (div(x, j));	
			j++;
			top = (pow(j,2));
			}		
		if(top > x){
			j--;
			return j;
		}else{
			return j;
		}
		}
	}	  	  
