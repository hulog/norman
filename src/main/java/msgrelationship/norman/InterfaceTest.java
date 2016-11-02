package msgrelationship.norman;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

public class InterfaceTest {

    private String client_id = "hl";
    private String client_password = "000000";

    /**
     * @param client_id
     *            调用者账号
     * @param client_password
     *            调用者密码
     * @param send_id
     *            对象Id 群组群号/个人编号
     * @param send_type
     *            发送对象 0群组/1个人
     * @param message
     *            发送内容
     * @return
     * @throws IOException
     */
    public boolean msgSend(String send_id, String send_type, String send_way, String message) {

        String url = "/msg/message/send";

        HttpClient client = new HttpClient();
        client.getHostConfiguration().setHost("192.168.199.181", 8088);

        PostMethod post = new PostMethod(url);

        NameValuePair aa = new NameValuePair("client_id", client_id);
        NameValuePair bb = new NameValuePair("client_password", client_password);
        NameValuePair cc = new NameValuePair("send_id", send_id);
        NameValuePair dd = new NameValuePair("send_type", send_type);
        NameValuePair ee = new NameValuePair("send_way", send_way);
        NameValuePair ff = new NameValuePair("message", message);

        post.setRequestBody(new NameValuePair[] { aa, bb, cc, dd, ee, ff });
        post.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "utf-8");

        try {
            int resCode = client.executeMethod(post);
        } catch (HttpException ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace();
        } catch (IOException ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace();
        }
        post.releaseConnection();

        return true;
    }

}
