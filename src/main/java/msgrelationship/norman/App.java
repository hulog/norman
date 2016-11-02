package msgrelationship.norman;

/**
 * For Test!
 *
 */
public class App {

    // 压力测试，调用接口次数
    private static final double count = 80;
    //
    private static int validCount = 0;

    private static void syso(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        sendInterf si = new sendInterf();

        // 发送个人微信
        syso("start send personal wx ......");
        if (si.send_P_Wx()) {
            syso("success");
        } else {
            syso("failed");
        }
        // 压力测试100次循环
        syso("调用微信接口，压力测试开始");
        for (int i = 0; i < count; i++) {
            if (si.send_P_Wx())
                validCount++;
        }
        syso("发送次数:"+count+",成功次数:"+validCount+",成功率:"+validCount/count);

        // 发送个人邮件
        syso("start send personal email ......");
        si.send_P_Em();

        // // 发送个人短信
        // syso("start send personal sms ......");
        // si.send_P_Sms();
        //
        // // 发送个人三种方式
        // syso("start send personal wx&email&sms ......");
        // si.send_P_All();

        // 发送群组微信
        syso("start send group  wx ......");
        si.send_G_Wx();

        // 发送群组邮件
        syso("start send group email ......");
        si.send_G_Em();

        // // 发送群组短信
        // syso("start send group sms ......");
        // si.send_G_Sms();
        //
        // // 发送群组三种方式
        // syso("start send group wx&email&sms ......");
        // si.send_G_All();

        // API查询发送对象信息（个人）
        // syso("start search personal ......");

        // API查询发送对象信息（群组）
    }
}
