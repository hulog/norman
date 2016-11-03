package msgrelationship.norman;

/**
 * Copyright (C), 2016, 银联智惠信息服务（上海）有限公司
 *
 * @author Norman
 * @version 0.0.1
 * @desc TODO
 * @date 2016年11月3日
 */
public class GlobalConstants {

    // 调用者name&password
    public static final String client_id = "hl";
    public static final String client_password = "000000";

    // message平台的host和port
    public static final String host = "192.168.199.181";
    public static final int port = 8088;

    // message平台提供的两个api地址
    public static final String send_msg_url = "/msg/message/send";
    public static final String search_objects_url = "/msg/search";

}
