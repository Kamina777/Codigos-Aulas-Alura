import java.util.ArrayList;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		palavras.forEach(s -> System.out.println(s));
		palavras.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));
		palavras.forEach(s -> System.out.println(s));

	}
}