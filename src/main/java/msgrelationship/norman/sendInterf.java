package msgrelationship.norman;

public class sendInterf {

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
    private String message;

    // private InterfaceTest it = new InterfaceTest();
    private InterfaceTest it;

    public sendInterf() {
        this.it = new InterfaceTest();
        this.message = "Congratulations,中英文测试正常";
    }

    public final void send_P_Wx() {

        it.msgSend(client_id, client_password, send_id, send_type, send_way, message);
    }

    public final void send_P_Em() {

    }

    public final void send_P_Sms() {

    }

    public final void send_G_Wx() {

    }

    public final void send_G_Em() {

    }

    public final void send_G_Sms() {

    }

    public final void send_P_search() {

    }

    public final void send_G_search() {

    }

}