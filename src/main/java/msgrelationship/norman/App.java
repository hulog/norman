package msgrelationship.norman;

/**
 * For Test!
 *
 */
public class App {

    private static void syso(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
        sendInterf si = new sendInterf();

        
        // 发送个人微信
        syso("start send personal wx ......");
        si.send_P_Wx();
        
        // 发送个人邮件
        syso("start send personal email ......");
        si.send_P_Em();
        
//        // 发送个人短信
//        syso("start send personal sms ......");
//        si.send_P_Sms();
//        
//        // 发送个人三种方式
//        syso("start send personal wx&email&sms ......");
//        si.send_P_All();
        
        // 发送群组微信
        syso("start send group  wx ......");
        si.send_G_Wx();
        
        // 发送群组邮件
        syso("start send group email ......");
        si.send_G_Em();
        
//        // 发送群组短信
//        syso("start send group sms ......");
//        si.send_G_Sms();
//        
//        // 发送群组三种方式
//        syso("start send group wx&email&sms ......");
//        si.send_G_All();

        
        // API查询发送对象信息（个人）
//        syso("start search personal ......");
        
        // API查询发送对象信息（群组）
    }
}
