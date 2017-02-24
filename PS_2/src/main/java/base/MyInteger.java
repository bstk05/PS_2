package base;

public class MyInteger {
	
	private int iValue;

	public MyInteger(int i) {}
	
	
	public int getiValue() {
		return iValue;
	}
	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	public Integer Value(){
		return iValue;
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
		for (int i = 2; i < this.iValue; i++){
			if(iValue % i != 0)
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
		for (int i = 2; i < iValue; i++){
			if(iValue % i != 0)
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
		for (int i = 2; i < C.iValue; i++){
			if(C.iValue % i != 0)
				return true;
		}
		return false;
		}
	public boolean equals(int D){
		if (D == iValue){
			return true;
		}
		return false;
		}
	public boolean equals(MyInteger E){
		if (E.iValue == this.iValue){
			return true;
		}
		return false;
		}

}
