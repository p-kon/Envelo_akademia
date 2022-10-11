import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.LinkedList;
import java.util.Scanner;

public class KanyeQuote {
    public static void main(String[] args) throws IOException, InterruptedException {

        final int MAX_NUMBER_OF_QUOTES = 122;
        LinkedList<String> kanyeQuotes = new LinkedList<>();

        extracted(MAX_NUMBER_OF_QUOTES, kanyeQuotes);


    }

    private static void extracted(int MAX_NUMBER_OF_QUOTES, LinkedList<String> kanyeQuotes) throws IOException, InterruptedException {
        String textFromUser = printInstructionsAndGetUserInput();
        if (textFromUser.equals("next")) {
            if (kanyeQuotes.size()== MAX_NUMBER_OF_QUOTES) {
                System.out.println("You have seen all quotes of Kanye. Congratulations!");
            } else {
                String kanyeQuote = getKanyeQuote(kanyeQuotes);
                System.out.println(kanyeQuote);
                extracted(MAX_NUMBER_OF_QUOTES, kanyeQuotes);
            }
        } else {
            System.out.println("Unknown command. EXIT.");
        }
    }

    private static String printInstructionsAndGetUserInput() {
        System.out.println("type \"next\" to get random Kanye West quote");
        Scanner scanner = new Scanner(System.in);
        String textFromUser = scanner.nextLine();
        return textFromUser;
    }

    private static String getKanyeQuote(LinkedList<String> kanyeQuotes) throws IOException, InterruptedException {
        String url = "https://api.kanye.rest/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String responseString = response.body().toString();
        JSONObject jsonObject = new JSONObject(responseString);
        String quote = jsonObject.getString("quote");

        if (kanyeQuotes.contains(quote)){
            quote = getKanyeQuote(kanyeQuotes);
        }
        else {
            kanyeQuotes.add(quote);
        }

        return quote;
    }
}
