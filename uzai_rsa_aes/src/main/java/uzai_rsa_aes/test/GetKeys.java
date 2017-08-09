package uzai_rsa_aes.test;

import java.security.PrivateKey;
import java.util.Map;

import uzai_rsa_aes.utils.RSA;
/**
 * 生成密钥对
 * @author changxinming
 *
 */
public class GetKeys {

	public static void main(String[] args) throws Exception {
		Map<String, String> map = RSA.generateKeyPair();
		System.out.println("privateKey---" + map.get("privateKey"));
		System.out.println("publicKey---" + map.get("publicKey"));

		

	}
}
