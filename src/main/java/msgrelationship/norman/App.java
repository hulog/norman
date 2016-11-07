package msgrelationship.norman;

import java.util.Scanner;

/**
 * For Test!
 *
 */
public class App {

    // 压力测试，调用接口次数
    private static final double wxCount = GlobalConstants.send_times_viaWx;
    private static final double emailCount = GlobalConstants.send_times_viaEmail;
    //
    private static int wxValidCount = 0;
    private static int emailValidCount = 0;

    private static void syso(String str) {
        System.out.println(str);
    }

    private static void tips() {
        syso("微信(单发1/压力单发2)，微信(群发3/压力群发4)");
        syso("邮件(单发5/压力单发6)，邮件(群发7/压力群发8)");
        syso("短信(单发9),短信(群发10)......(没经费就不压力测试了orz...)");
        syso("同时通过微信邮件短信发送消息(个人11,群组12)");
        syso("查询发送对象(个人13,群组14)");
        syso("退出请按0");
        System.out.print("请输入功能编号:");
    }

    public static void main(String[] args) {
        sendInterf si = new sendInterf();

        // 输入
        tips();
        Scanner sc = new Scanner(System.in);
        Integer in = sc.nextInt();

        while (null != in & in != 0) {
            switch (in) {
                case 1:
                    // 发送个人微信
                    syso("start send personal wx ......");
                    if (si.send_P_Wx()) {
                        syso("success");
                    } else {
                        syso("failed");
                    }
                break;
                case 2:
                    // 发送个人微信(压力)
                    syso("调用微信接口，压力测试开始......");
                    for (int i = 0; i < wxCount; i++) {
                        if (si.send_P_Wx())
                            wxValidCount++;
                    }
                    syso("发送次数:" + (int) wxCount + ",成功次数:" + wxValidCount + ",成功率:" + wxValidCount / wxCount * 100
                            + "%");
                break;
                case 3:
                    // 发送群组微信
                    syso("start send group  wx ......");
                    if (si.send_G_Wx())
                        syso("success");
                    else
                        syso("failed");
                break;
                case 4:
                    // 发送群组微信(压力)
                    syso("start send group  wx (under pressure)......");
                    wxValidCount = 0;
                    for (int i = 0; i < wxCount; i++) {
                        if (si.send_G_Wx())
                            wxValidCount++;
                    }
                    syso("发送次数:" + (int) wxCount + ",成功次数:" + wxValidCount + ",成功率:" + wxValidCount / wxCount * 100
                            + "%");
                break;
                case 5:
                    // 发送个人邮件
                    syso("start send personal email ......");
                    if (si.send_P_Em())
                        syso("success");
                    else
                        syso("failed");
                break;
                case 6:
                    // 发送个人邮件(压力)
                    emailValidCount = 0;
                    for (int i = 0; i < emailCount; i++) {
                        if (si.send_P_Em())
                            emailValidCount++;
                    }
                    syso("发送次数:" + (int) emailCount + ",成功次数:" + emailValidCount + ",成功率:"
                            + emailValidCount / emailCount * 100 + "%");
                break;
                case 7:
                    // 发送群组邮件
                    syso("start send group email ......");
                    if (si.send_G_Em())
                        syso("success");
                    else
                        syso("failed");
                break;
                case 8:
                    // 发送群组邮件(压力)
                    syso("start send group email (under pressure)......");
                    emailValidCount = 0;
                    for (int i = 0; i < emailCount; i++) {
                        if (si.send_G_Em())
                            emailValidCount++;
                    }
                    syso("发送次数:" + (int) emailCount + ",成功次数:" + emailValidCount + ",成功率:"
                            + emailValidCount / emailCount * 100 + "%");
                break;
                case 9:
                    // 发送个人短信
                    syso("start send personal sms......");
                    if (si.send_P_Sms())
                        syso("success");
                    else
                        syso("failed");
                break;
                case 10:
                    // 发送群组短信
                    syso("start send group sms......");
                    if (si.send_G_Sms())
                        syso("success");
                    else
                        syso("failed");
                break;
                case 11:
                    syso("start send personal message via all three method......");
                    if (si.send_P_All()) {
                        syso("success");
                    } else {
                        syso("failed");
                    }
                break;
                case 12:
                    syso("start send group message via all three method......");
                    if (si.send_G_All()) {
                        syso("success");
                    } else {
                        syso("failed");
                    }
                break;
                case 13:
                // 查询发送对象（个人）
                    String resp1 = si.send_P_search();
                    if(null != resp1){
                        syso("response===>>>"+resp1);
                    }else{
                        syso("some errors may have happend...");
                    }
                break;
                case 14:
                // 查询发送对象（群组）
                    String resp2 = si.send_G_search();
                    if(null != resp2){
                        syso("response===>>>"+resp2);
                    }else{
                        syso("some errors may have happend...");
                    }
                break;
                default:
                    syso("yahoo……参数错误le！");
                break;
            }
            tips();
            in = sc.nextInt();
        }
        sc.close();
        syso("bye……");

        // 压力测试 循环

        // // 发送个人短信
        // syso("start send personal sms ......");
        // si.send_P_Sms();
        //
        // // 发送个人三种方式
        // syso("start send personal wx&email&sms ......");
        // si.send_P_All();

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
