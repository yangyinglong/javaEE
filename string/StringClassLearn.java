import java.util.Date;

public class StringClassLearn {
	public static void main(String[] args) {
		String str_1 = "  hello world  ";
		int len_1 = str_1.length();
		String str_2 = str_1.trim();
		int len_2 = str_2.length();
		System.out.println(str_1 + "'s length is " + len_1);
		System.out.println(str_2 + "'s length is " + len_2);

		Date date = new Date();
		String year = String.format("%tY", date);
		String month = String.format("%tB", date);
		String day = String.format("%td", date);
		String time = String.format("%tc", date);



		System.out.println(year + month + day + "\n" + time + "\n" + date);

		StringBuilder builder = new StringBuilder("helloworld");
		System.out.println(builder.toString());

		builder.append(year);
		System.out.println(builder.toString());

		builder.insert(5, " ");
		builder.insert(11, " ");
		System.out.println(builder.toString());
		System.out.println(builder.length());

	}
}