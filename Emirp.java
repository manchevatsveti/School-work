package eddu.smg;

public class emirp {
	public static void main(String[] args) {
        int numbers = 1;
        long numberNow =10;
		while(numbers<=121) {
	if( prime(numberNow) && emirp(numberNow)){
	    if(numbers%10!=0){
	    System.out.print(numberNow + " ");
	    numbers++;}
	    else{
	        System.out.println(numberNow + " ");
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

public static boolean emirp(long n) {
 long r,sum=0,temp;    
  temp=n;   
  while(n>0){    
   r=n%10;    
   sum=(sum*10)+r;    
   n=n/10;    
  }
  boolean emirp = true;
  if(sum!=temp){
 for(int i = 2; i <= sum/2; ++i){
     if(sum % i == 0)
     {emirp = false; 
     break;
     }
	 
 }
  }
  else{
	  emirp = false;
  }

 if (emirp) {
	 return true;
 }
 else {
     return false;
	}

}
}
