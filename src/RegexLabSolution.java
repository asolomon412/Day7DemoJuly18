import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLabSolution {

	public static void main(String[] args) {
		String tester = "Antonella hello@gmail.com is testing stuff 06/04/2018, 1570 Woodward Detroit 48226 (313)555-1212";

		// name
		System.out.println("Name: ");
		checkRegex("[A-Z]\\w{2,30}", tester);
		System.out.println();
		System.out.println("Email: ");
		// check for email
		checkRegex("\\w+@\\w+\\.\\w{2,4}", tester);
		System.out.println();
		System.out.println("Phone number: ");
		// phone number
		checkRegex("\\(\\d{3}\\)\\d{3}-\\d{4}$", tester);
		// date
		System.out.println();
		System.out.println("Date: ");
		checkRegex("\\d{2}.\\d{2}.\\d{4}", tester);

	}

	public static void checkRegex(String regex, String sentence) {

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(sentence);

		// find() - attempts to locate the next subsequence of the input that
		// matches the pattern

		while (m.find()) {
			// group() - returns the actual input subsequence
			if (m.group().length() != 0) {
				System.out.println(m.group().trim());
			}

			System.out.println("Starting index: " + m.start());
			System.out.println("Ending index: " + m.end());
		}

	}
}
