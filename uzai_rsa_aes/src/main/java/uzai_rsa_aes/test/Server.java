package uzai_rsa_aes.test;

import com.alibaba.fastjson.JSONObject;

import uzai_rsa_aes.keys.KEY;
import uzai_rsa_aes.utils.AES;
import uzai_rsa_aes.utils.EncryUtil;
import uzai_rsa_aes.utils.RSA;

public class Server {
	public static Object server(String sign) throws Exception {

		JSONObject obj = JSONObject.parseObject(sign);
		String datap = (String) obj.get("data");
		String encryptkey = (String) obj.get("encryptkey");


		// 验签
		boolean passSign = EncryUtil.checkDecryptAndSign(datap, encryptkey, KEY.ClientPublicKey, KEY.ServerPrivateKey);

		if (passSign) {
			// 验签通过
			String aeskey = RSA.decrypt(encryptkey, KEY.ServerPrivateKey);
			String data = AES.decryptFromBase64(datap, aeskey);

			JSONObject jsonObj = JSONObject.parseObject(data);
			String userid = jsonObj.getString("userid");
			String phone = jsonObj.getString("phone");

			return jsonObj;

		} else {
			System.out.println("验签失败");
		}
		return passSign;
	}

}
