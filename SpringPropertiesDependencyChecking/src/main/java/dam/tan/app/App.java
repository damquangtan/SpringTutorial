package dam.tan.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dam.tan.bean.Customer;

public class App {
	public static void main(String[] args) {
		 try {

				URL url = new URL("https://enelifm--dev6.cs87.my.salesforce.com/services/oauth2/token?grant_type=password&client_id=3MVG954MqIw6FnnMQBva1cbPwYdQXOw_lCYwOHDhU1Ol_MwdqfNqou2hI.ZUQK_140CL1jW8_2nC4HeXgWEy_&client_secret=6921441605990556421&username=selfcare.be.user@enelfreemarket.com.dev6&password=S3lfcare.1");
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("POST");
				conn.setRequestProperty("Accept", "application/json");

				if (conn.getResponseCode() != 200) {
					throw new RuntimeException("Failed : HTTP error code : "
							+ conn.getResponseCode());
				}

				BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

				String output;
				System.out.println("Output from Server .... \n");
				while ((output = br.readLine()) != null) {
					System.out.println(output);
				}

				conn.disconnect();

			  } catch (MalformedURLException e) {

				e.printStackTrace();

			  } catch (IOException e) {

				e.printStackTrace();

			  }

	}
}
