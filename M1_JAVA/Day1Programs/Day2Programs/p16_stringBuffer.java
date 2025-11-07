package Day2Programs;

public class p16_stringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hi");
		System.out.println("Initial Value");
		System.out.println(sb);
		System.out.println("Updated String");
		sb.append(" user!");
		System.out.println(sb);
		System.out.println("Inserting New String");
		sb.insert(3, "new ");
		System.out.println(sb);
		System.out.println("Replacing String");
		sb.replace(3, 6, "old");
		System.out.println(sb);
	}

}
