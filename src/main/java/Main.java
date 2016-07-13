import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {

		List<String> words = new ArrayList<>();

		words.add("Hello");
		words.add("World");

		String jsonWords = new Gson().toJson(words);

		System.out.println(jsonWords);

		int count = 0;
		PDDocument doc;
		try {
			doc = PDDocument.load(new File("C:\\Users\\lpark_000\\Desktop\\StevenTylerTicketConfirmation.pdf"));
			count = doc.getNumberOfPages();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(count);

	}

}
