package collatzNumber;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("5: "+collatzNumber(5));
	}
/*
 * The Collatz conjecture is a mathematical sequence defined as follows: start with any positive integer n. Then, each term is obtained from the previous term according to these rules:

    If the previous term is even, the next term is one half of the previous term. ( even (1/2) )
    If the previous term is odd, the next term is 3 times the previous term plus 1. (odd*3)+1

The conjecture is that no matter what value of n, the sequence will always eventually reach the number 1.

Complete the method collatzNumber(int n) which calculates the sequence for the given n.
For example, below are the resulting sequences for some values of n given the rules above.
    collatzNumber(1): 1
    collatzNumber(2): 2 1
    collatzNumber(3): 3 10 5 16 8 4 2 1
    collatzNumber(4): 4 2 1
    collatzNumber(5): 5 16 8 4 2 1
 */
	public static String collatzNumber(int n) {
		//enter solution below
        String result = "";
        
        while( n != 1 ){   
            result += " "+ n;
            
            if( n % 2 == 0  ){ 
                //even
            	n=n/2;
                
            }else{
                n= (n*3)+1;
                
            }
        }
                
        return result + " 1";
	}

}
