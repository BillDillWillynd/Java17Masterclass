import java.util. *;
import java.net. *;

public class Network {

    public static void main(String[] args) throws UnknownHostException {
        ipAddress();
    }

    public static void ipAddress() throws UnknownHostException{

        String url = "www.google.com";
        InetAddress inetAddress = Inet4Address.getByName(url);

        System.out.println(inetAddress); // Returns the domain name and IP address
        System.out.println(Arrays.toString(inetAddress.getAddress())); // Returns an IP as a byte array, byte (-128 to 127)
        System.out.println(inetAddress.getHostAddress()); // Returns the IP address normally
        System.out.println(inetAddress.getHostName()); // Returns the domain name of IP address
        System.out.println(inetAddress.hashCode());


    }



}
