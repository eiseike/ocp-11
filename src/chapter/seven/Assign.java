package chapter.seven;

public class Assign {

	public static void main(String[] args) {
		int num = 4;
		reassign(num);
		System.out.println(num);     // 4

		Integer number = 4;
		reassign(number);
		System.out.println(number);     // 4

		String string = "4";
		reassign(string);
		System.out.println(string);     // 4

		StringBuilder sb = new StringBuilder("4");
		reassign(sb);
		System.out.println(sb); // 4
		changesInObjCtx(sb);
		System.out.println(sb); // 8

		String[] stringArr = new String[]{"4"};
		reassign(stringArr);
		System.out.println(stringArr[0]); // 4
		changesInObjCtx(stringArr);
		System.out.println(stringArr[0]); // 8


	}

	static void reassign(int num) {
		num = 8;
	}

	static void reassign(Integer num) {
		num = 8;
	}

	static void reassign(String string) {
		string = "8";
	}

	static void reassign(String[] stringArr) {
		stringArr = new String[]{"BOOM"};
	}

	static void reassign(StringBuilder sb) {
		sb = new StringBuilder("boom");
	}

	static void changesInObjCtx(String[] string) {
		string[0] = "8";
	}

	static void changesInObjCtx(StringBuilder sb) {
		sb.replace(0, 1, "8");
	}


//	public static void newNumber(Object string) {
//		System.out.println("newNumber[Object] called!");
//	}

}
