public class Test{
	public static void main(String[] args){
		System.out.println(f1(40));
		System.out.println(f(-12));
	}
	
	public static long f1(int i){
		if(i == 1 || i == 2){
			return 1;
		} else {
			return f(i - 1) + f(i - 2);
		}
	}
	
	public static long f(int index){
		
		if(index <1){
			System.out.println("Invalid parameter!");
			return -1;
		}
		if(index == 1 || index == 2){
			return 1;
		}
		
		long f1 = 1L;
		long f2 = 1L;
		long f = 0;
		
		for (int i = 0; i < index - 2; i++){
			f = f1 + f2;
			f1 = f2;
			f2 = f;
		}
		return f;
	}	
}