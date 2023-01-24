package quotes;

import com.google.gson.Gson;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.net.URL;

public class App {
    public static void main(String[] args) throws IOException {
        // 1. Make a URL to talk to a website
        URL RonSwansonURL = new URL("https://ron-swanson-quotes.herokuapp.com/v2/quotes");

        // 2. Make a connection to the website
        HttpURLConnection ronSwansonUrlConnection = (HttpURLConnection) RonSwansonURL.openConnection();

        // 3. Specify a method for our connection
        ronSwansonUrlConnection.setRequestMethod("GET");
        ronSwansonUrlConnection.connect();

        // Verifying Connection
        int code = ronSwansonUrlConnection.getResponseCode();

        // 4. Need to read from this connection
        InputStreamReader ronSwansonInputStreamReader = new InputStreamReader(ronSwansonUrlConnection.getInputStream());
        BufferedReader ronSwansonBufferedReader = new BufferedReader(ronSwansonInputStreamReader);
        String ronSwansonData = ronSwansonBufferedReader.readLine();
        System.out.println(ronSwansonData);

        Gson gson = null;

        // 5. Need convert format to objects
        // 5 1/2. Make objects for the data to live in
        gson = new GsonBuilder().setPrettyPrinting().create();

        String[] quotes = gson.fromJson(ronSwansonData, String[].class);
        RonSwansonAPI quote = new RonSwansonAPI(quotes[0]);

        // In your lab:
        // If getting internet quote, read from a file too, append to that file
        // 6. Write file out to disk
        File file = new File("quotes/app/src/main/resources/recentquotes.json");
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            gson.toJson(quote, fileWriter);
        }

        Type collectionType = new TypeToken<Collection<Quotes>>() {
        }.getType();
        ArrayList<Quotes> quotesArrayList = gson.fromJson(fileReader, collectionType);
    }

}

    public static void GrabRecentQuote() throws FileNotFoundException {
        Gson gson = new Gson();
        File file = new File("app/src/main/resources/recentquotes.json");
        FileReader fileReader = new FileReader(file);
        Type collectionType = new TypeToken<Collection<Quotes>>() {
        }.getType();
        ArrayList<Quotes> quotesArrayList = gson.fromJson(fileReader, collectionType);
        int index = new Random().nextInt(quotesArrayList.size());
        System.out.println(quotesArrayList.get(index).getAuthor());
        System.out.println(quotesArrayList.get(index).getText());
    }
}