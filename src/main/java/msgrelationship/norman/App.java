package msgrelationship.norman;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		//账号
		String client_id = "hl";
		
		//密码
		String client_password = "000000";
		
		//0群组，1个人
		String send_type = "1";
		
		//发送对象ID， 群组群号/个人编号
		String send_id = "2";
		
		//发送方式，1表示微信，2表示邮箱，3表示短信，4表示全部
		String send_way = "1";
		
		//信息内容
		String message = "你好你好小狐狸";
		
		InterfaceTest it = new InterfaceTest();
		it.msgSend(client_id, client_password, send_id, send_type, send_way, message);
	}
}
