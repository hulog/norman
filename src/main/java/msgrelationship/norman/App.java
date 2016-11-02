package msgrelationship.norman;

/**
 * Hello world!
 *
 */
public class App {

    // 账号
    private String client_id = "hl";
    // 密码
    private String client_password = "000000";
    // 0群组，1个人
    private String send_type = "1";
    // 发送对象ID， 群组群号/个人编号
    private String send_id = "2";
    // 发送方式，1表示微信，2表示邮箱，3表示短信，4表示全部
    private String send_way = "1";
    // 信息内容
    private String message = "Test Message,测试信息";

    public static void main(String[] args) {
        sendInterf si = new sendInterf()

        // 发送个人微信
        si.send_P_Wx();
        // 发送个人邮件

        si.send_P_Em();
        // 发送个人短信

        // 发送群组微信

        // 发送群组邮件

        // 发送群组短信

        // API查询发送对象信息（个人）
        
        // API查询发送对象信息（群组）

    }

    public static void send_P_Wx() {
        InterfaceTest it = new InterfaceTest();
        System.out.println("yy");

        send_way = "1";
        send_type = "1";
        it.msgSend(client_id, client_password, send_id, send_type, send_way, message);

        // 发送个人邮件
        send_type = "1";
        send_way = "2";
        it.msgSend(client_id, client_password, send_id, send_type, send_way, message);
    }
}
