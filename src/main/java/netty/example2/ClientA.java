package netty.example2;

public class ClientA {
    public static void main(String[] args) throws Exception {
        new SimpleChatClient("localhost", 8080, "clientA").run();        // 启动客户端
    }
}
