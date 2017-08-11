package uzai_rsa_aes.test;

import java.util.Map;
import java.util.ResourceBundle;
import java.util.TreeMap;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class demo {
	public static void main(String[] args) throws Exception {


		String json = "{\"age\":\"10\",\"count\":\"10000只\",\"money\":\"88\",\"name\":\"草泥马\",\"parent\":\"驴\",\"size\":\"100\"}";
		// System.out.println("加密后密文：" + sign);
		for (int i = 0; i < 500; i++) {
			String sign = Client.client(json);
			Object server = Server.server(sign);

			System.out.println(JSON.toJSONString(server));
		}

		/**
		 * 配置文件方式加载
		 */
		ResourceBundle resource = ResourceBundle.getBundle("key");
		String ClientPrivateKey = resource.getString("CLIENT_PRIVATEKEY");
		String ClientPublicKey = resource.getString("CLIENT_PUBLICKEY");
		String ServerPrivateKey = resource.getString("SERVER_PRIVATEKEY");
		String ServerPublicKey = resource.getString("SERVER_PUBLICKEY");

		System.out.println();
	}

	@Test
	public void run() {

		TreeMap<String, Object> params = new TreeMap<String, Object>();
		params.put("name", "草泥马");
		params.put("count", "10000只");
		params.put("size", "100");
		params.put("age", "10");
		params.put("money", "88");
		params.put("parent", "驴");

		String js = JSON.toJSONString(params);

		String jo = "{\"age\":\"10\",\"count\":\"10000只\",\"money\":\"88\",\"name\":\"草泥马\",\"parent\":\"驴\",\"size\":\"100\"}";
		Map<String, Object> par = (Map) JSON.parse(jo);
		TreeMap<String, Object> mm = new TreeMap<String, Object>(par);
		for (int i = 0; i < 10; i++) {
			System.out.println(mm);
		}

		System.out.println(JSON.toJSONString(params));
	}
}
