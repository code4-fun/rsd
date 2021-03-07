import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final List<Result> results = new ArrayList<>();

    public static void main(String[] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {

        for(int i = 10; i <= 100; i = i + 10){
            String url = "https://gpsfront.aliexpress.com/getRecommendingResults.do?" +
                    "widget_id=5547572&limit=10&" +
                    "offset=" + i + "&postback=6a366df0-e0bc-4a10-94d0-be2b4d1e9338\n";

            String jsonString = getJson(url);
            ObjectMapper objectMapper = new ObjectMapper();
            RootObject rootObject = objectMapper.readValue(jsonString, RootObject.class);
            results.addAll(rootObject.getResults());
        }

        Writer writer = new FileWriter("C:\\yourfile.csv");
        StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
        beanToCsv.write(results);
        writer.close();
    }

    private static String getJson(String url) throws IOException {
        if(url == null)
            return "";

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
        String str;
        while((str = br.readLine()) != null){
            sb.append(str).append("\n");
        }
        return sb.toString();
    }
}
