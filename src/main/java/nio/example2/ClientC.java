package nio.example2;


import java.io.IOException;

public class ClientC {

    public static void main(String[] args)
            throws IOException {
        new NioClient().start("ClientC");
    }

}
