package uzai_rsa_aes.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.alibaba.fastjson.JSON;

import uzai_rsa_aes.keys.KEY;
import uzai_rsa_aes.utils.AES;
import uzai_rsa_aes.utils.EncryUtil;
import uzai_rsa_aes.utils.RSA;
import uzai_rsa_aes.utils.RandomUtil;

public class Client {
	
	

	public static String client(String jsonMap) throws Exception {
		Map me = (Map) JSON.parse(jsonMap);
		TreeMap<String, Object> params = new TreeMap<String,Object>(me);
		// 生成RSA签名
		String sign = EncryUtil.handleRSA(params, KEY.ClientPrivateKey);
		params.put("sign", sign);

		String info = JSON.toJSONString(params);
		// 随机生成AES密钥
		String aesKey = RandomUtil.getRandom(16);
		// AES加密数据
		String data = AES.encryptToBase64(info, aesKey);

		// 使用RSA算法将商户自己随机生成的AESkey加密
		String encryptkey = RSA.encrypt(aesKey, KEY.ServerPublicKey);

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("data", data);
		map.put("encryptkey", encryptkey);

		String endSign = JSON.toJSONString(map);

		return endSign;
	}
}
