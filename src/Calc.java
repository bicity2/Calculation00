
public class Calc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		printAdd(2,3);
		// ★ ここから下を実装 ★
		printSub(7,4);
	}
	
	public static void printAdd(int arg1, int arg2) {
		int sum = arg1 + arg2;
		String result = arg1 + "+" + arg2 + "=" + sum;
		System.out.println(result);
	}

	public static void printSub(int arg1, int arg2) {
		int difference  = arg1 - arg2;
		String result = arg1 + "-" + arg2 + "=" + difference ;
		System.out.println(result);
	}

}
