package msgrelationship.norman;

import java.util.Scanner;

/**
 * For Test!
 *
 */
public class App {

    // 压力测试，调用接口次数
    private static final double wxCount = 80;
    //
    private static int wxValidCount = 0;

    private static void syso(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        sendInterf si = new sendInterf();

        int testmtd = 0;

        //输入
        syso("请输入要测试的功能编号");
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            testmtd = sc.nextInt();
            switch (testmtd) {
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
                    syso("调用微信接口，压力测试开始");
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
                    si.send_G_Wx();
                    break;
                case 4:
                 // 发送微信(压力)
                    syso("start send group  wx (under pressure)......");
                    si.send_G_Wx();
                case 5:
                    // 发送个人邮件
                    syso("start send personal email ......");
                    si.send_P_Em();
                break;
                case 6:
                    // 发送个人邮件(压力)
                    syso("邮件压力测试开始 (under pressure)");
                break;
                case 7:
                 // 发送群组邮件
                    syso("start send group email ......");
                    si.send_G_Em();
                    break;
                case 8:
                    //发送群组邮件(压力)
                    syso("start send group email (under pressure)......");
                    break;
                default:
                break;
            }
        }
        sc.close();
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
