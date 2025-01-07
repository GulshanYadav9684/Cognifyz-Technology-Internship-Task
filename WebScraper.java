import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.regex.*;

 class WebScraperManual {

    public static void fetchContent(String urlString) {
        try {
            // Open a connection to the website
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Read the HTML content from the input stream
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder htmlContent = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                htmlContent.append(line).append("\n");
            }
            reader.close();

            // Now, extract data using regex
            extractHeadlines(htmlContent.toString());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Extracting headlines using regex
    public static void extractHeadlines(String htmlContent) {
        // Regular expression for extracting text inside <h3> tags (headlines)
        Pattern pattern = Pattern.compile("<h3[^>]*>(.*?)</h3>");
        Matcher matcher = pattern.matcher(htmlContent);

        int count = 1;
        while (matcher.find()) {
            System.out.println(count + ". " + matcher.group(1).trim());
            count++;
        }
    }

    public static void interactiveScraping() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Interactive Web Scraper (Manual)!");
        System.out.print("Enter the website URL to scrape: ");
        String url = scanner.nextLine();

        fetchContent(url);  // Scrape the website content

        scanner.close();
    }

    public static void main(String[] args) {
        interactiveScraping();  // Start the interactive session
    }
}
