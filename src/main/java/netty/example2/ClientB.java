package netty.example2;

public class ClientB {
    public static void main(String[] args) throws Exception {
        new SimpleChatClient("localhost", 8080, "clientB").run();        // 启动客户端
    }
}
