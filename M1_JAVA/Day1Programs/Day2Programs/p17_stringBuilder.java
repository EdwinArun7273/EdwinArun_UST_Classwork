package Day2Programs;

public class p17_stringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("java");
		System.out.println("Initial Value");
		System.out.println(sb);
		sb.append(" is easy");
		System.out.println("Updated");
		System.out.println(sb);
		System.out.println("After Reversal");
		sb.reverse();
		System.out.println(sb);
	}

}
