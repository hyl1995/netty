package nio.example2;


import java.io.IOException;

public class ClientA {

    public static void main(String[] args)
            throws IOException {
        new NioClient().start("ClientA");
    }

}
