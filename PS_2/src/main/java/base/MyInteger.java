package base;

public class MyInteger {
	
	private int iValue;

	public MyInteger(int i) {
		this.iValue = i;
	}
	
	
	public int getiValue() {
		return iValue;
	}
	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	
	
	
	public boolean isEven(){
		if (iValue % 2 == 0){
			return true;
		}
	return false;
	}
	
	
	public boolean isOdd(){
		if (iValue % 2 != 0){
			return true;
		}
	return false;
	}
	
	
	public boolean isPrime(){
		for (int divisor = 2; divisor < this.iValue / 2; divisor++){
			if(iValue % divisor != 0)
				return true;
	}
		return false;
	}

	
			
	public static boolean isEven(int iValue){
		if (iValue % 2 == 0){
			return true;
		}
		return false;
		}
	
	public static boolean isOdd(int iValue){
		if (iValue % 2 != 0){
			return true;
		}
		return false;
		}
	
	public static boolean isPrime(int iValue){
		for (int divisor = 2; divisor < iValue / 2; divisor++){
			if(iValue % divisor != 0)
				return true;
		}
		return false;
	}
	
	public static boolean isEven(MyInteger A){
		if (A.iValue % 2 == 0){
			return true;
		}
		return false;
		}
	
	public static boolean isOdd(MyInteger B){
		if (B.iValue % 2 != 0){
			return true;
		}
	return false;
	}
	
	public static boolean isPrime(MyInteger C){
		for (int divisor = 2; divisor < C.iValue / 2; divisor++){
			if(C.iValue % divisor != 0)
				return true;
		}
		return false;
		}
	public boolean isEquals(int D){
		if (D == iValue){
			return true;
		}
		return false;
		}
	public boolean isEquals(MyInteger E){
		if (E.iValue == this.iValue){
			return true;
		}
		return false;
		}

}
