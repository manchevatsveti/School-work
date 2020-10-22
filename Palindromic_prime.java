package eddu.smg;

public class Palindromic_prime {

	public static void main(String[] args) {
		
		int numbers=1;
		long numberNow =2;
		while(numbers<=121) {
			if(prime(numberNow) && palindromic(numberNow)){
				if(numbers%10!=0) {
				System.out.print(numberNow + " ");
				numbers++;
				}
				else if (numbers%10==0 ){
					System.out.print(numberNow + " \n");
					numbers++;
				}
			}
			numberNow++;
		}
	

	}
 public static boolean prime(long num) {
		boolean isPrime = true;
     for(int i = 2; i <= num/2; ++i)
     {
         if(num % i == 0)
         {
             isPrime = false;
             break;
         }
     }

     if (isPrime) {
    	 return true;
     }
     else {
         return false;
 	}
 }
 
 public static boolean palindromic(long n) {
	 long r,sum=0,temp;    
	  temp=n;   
	  while(n>0){    
	   r=n%10;    
	   sum=(sum*10)+r;    
	   n=n/10;    
	  }    
	  if(temp==sum)   { 
	   return true ;
	  }
	  else    {
	   return false;
	  }
 	}
}

