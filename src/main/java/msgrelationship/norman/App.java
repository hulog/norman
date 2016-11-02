package msgrelationship.norman;

/**
 * Hello world!
 *
 */
public class App {


    public static void main(String[] args) {
        sendInterf si = new sendInterf()

        // 发送个人微信
        si.send_P_Wx();
        // 发送个人邮件
        si.send_P_Em();
        // 发送个人短信
        si.send_P_Sms();
        // 发送群组微信
        si.send_G_Wx();
        // 发送群组邮件
        si.send_G_Em();
        // 发送群组短信
        si.send_G_Sms();
        // API查询发送对象信息（个人）
        
        // API查询发送对象信息（群组）


        it.msgSend(client_id, client_password, send_id, send_type, send_way, message);

        // 发送个人邮件
        send_type = "1";
        send_way = "2";
        it.msgSend(client_id, client_password, send_id, send_type, send_way, message);
    }
}
