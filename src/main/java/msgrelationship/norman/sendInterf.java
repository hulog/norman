package msgrelationship.norman;

public class sendInterf {

    // 0群组，1个人
    // send_type
    private final static String toPerson = "1";
    private final static String toGoup = "0";

    // 发送对象ID， 群组群号/个人编号
    // send_id
    private final static String PID = GlobalConstants.send_pid;
    private final static String GID = GlobalConstants.send_gid;

    // 发送方式，1表示微信，2表示邮箱，3表示短信，4表示全部
    // send_way
    private final static String viaWX = "1";
    private final static String viaEmail = "2";
    private final static String viaSms = "3";
    private final static String viaAll = "4";

    // 信息内容
    private final static String message = GlobalConstants.message;

    private InterfaceTest it;

    public sendInterf() {
        this.it = new InterfaceTest();
    }

    public final boolean send_P_Wx() {
        if (it.msgSend(PID, toPerson, viaWX, message))
            return true;
        return false;
    }

    public final boolean send_P_Em() {
        if (it.msgSend(PID, toPerson, viaEmail, message))
            return true;
        return false;
    }

    public final boolean send_P_Sms() {
        if (it.msgSend(PID, toPerson, viaSms, message))
            return true;
        return false;
    }

    public final boolean send_P_All() {
        if (it.msgSend(PID, toPerson, viaAll, message))
            return true;
        return false;
    }

    public final boolean send_G_Wx() {
        if (it.msgSend(GID, toGoup, viaWX, message))
            return true;
        return false;
    }

    public final boolean send_G_Em() {
        if (it.msgSend(GID, toGoup, viaEmail, message))
            return true;
        return false;
    }

    public final boolean send_G_Sms() {
        if (it.msgSend(GID, toGoup, viaSms, message))
            return true;
        return false;
    }

    public final boolean send_G_All() {
        if (it.msgSend(GID, toGoup, viaAll, message))
            return true;
        return false;
    }

    public final void send_P_search() {
        it.msgsend

    }

    public final void send_G_search() {

    }
}