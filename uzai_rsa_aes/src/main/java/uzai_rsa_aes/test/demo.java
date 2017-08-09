package uzai_rsa_aes.test;

import java.util.ResourceBundle;
import java.util.TreeMap;

import com.alibaba.fastjson.JSON;

public class demo {
	public static void main(String[] args) throws Exception {
		// 必须是TreeMap
		TreeMap<String, Object> params = new TreeMap<String, Object>();
		params.put("name", "草泥马");
		params.put("count", "10000只");

		String sign = Client.client(params);
		System.out.println("加密后密文：" + sign);

		Object server = Server.server(sign);
		System.out.println(JSON.toJSONString(server));

		ResourceBundle resource = ResourceBundle.getBundle("key");
		String ClientPrivateKey = resource.getString("CLIENT_PRIVATEKEY");
		String ClientPublicKey = resource.getString("CLIENT_PUBLICKEY");
		String ServerPrivateKey = resource.getString("SERVER_PRIVATEKEY");
		String ServerPublicKey = resource.getString("SERVER_PUBLICKEY");

		System.out.println();
	}
}
