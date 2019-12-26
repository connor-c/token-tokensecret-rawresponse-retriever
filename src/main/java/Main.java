import com.github.scribejava.core.model.OAuth1AccessToken;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Splitwise splitwise = new Splitwise("<Consumer Key>", "<Consumer Secret>");
        try
        {
            String url = splitwise.getAuthorizationUrl();
            System.out.println("Open this link: " + url);
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter out of band authentication information code (appears after you click authorize): ");
            String accessTokenId = sc.nextLine();
            splitwise.util.setAccessToken(accessTokenId);
            OAuth1AccessToken accessToken = (OAuth1AccessToken) splitwise.util.getAccessToken();

            System.out.println("Token: " + accessToken.getToken());
            System.out.println("Token Secret: " + accessToken.getTokenSecret());
            System.out.println("Raw Response: " + accessToken.getRawResponse());

            FileWriter writer = new FileWriter("TokenTokenSecretRawResponse.txt");
            writer.append("Token: " + accessToken.getToken() + "\n");
            writer.append("Token Secret: " + accessToken.getTokenSecret() + "\n");
            writer.append("Raw Response: " + accessToken.getRawResponse() + "\n");
            writer.flush();
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }


}


