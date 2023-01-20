package quotes;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Gson gson = new Gson();

        File file = new File("app/src/main/resources/recentquotes.json");
        FileReader fileReader = new FileReader(file);
        Type collectionType = new TypeToken<Collection<Quotes>>(){}.getType();
        ArrayList<Quotes> quotesArrayList = gson.fromJson(fileReader, collectionType);

        System.out.println(quotesArrayList.get(1).getAuthor());
        System.out.println(quotesArrayList.get(2).getText());

    }
}
