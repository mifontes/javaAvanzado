
package javaadvanced.viernes.socketTres;

import java.net.HttpURLConnection;
import java.net.URL;

/*
 */
public class HttpUrlDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com");
            HttpURLConnection huc = (HttpURLConnection)url.openConnection();
            
            for (int i = 1; i <=7; i++) {
                System.out.println(huc.getHeaderFieldKey(i) + " = " + huc.getHeaderField(i) );
            }
            huc.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
