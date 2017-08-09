package uzai_rsa_aes.keys;

/**
 * 做配置文件用
 * 客户端需要：服务器公钥 + 客户私钥
 * 服务端需要：服务器私钥 + 客户公钥
 * @author changxinming
 *
 */
public class KEY {

	/**
	 * 用户端私钥
	 */
	public static final String ClientPrivateKey = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAJOzVsdERs2EDHASR3XG6gng+FHBGKEm992130B/oieGr3wAxdPaoYw5inNhpYHJUMNdo74tLcjI8svuAXURECod5GeYaiPnlHezIcORpglnh9xLBAZ61DPPUCAuGz3X1EMoiV1BJoJVt1ZU9Ur8PNHEJX6TxuSc2NHAmp73a0XLAgMBAAECgYACgiQyJCWzrc9sQ9M029jzq/9rnAToD7pb6I/PD5vYYgAu8fBqJadis0N3rCvcZWfauYdjXm8NnuQItJUPwOduWQgPpY/qQDQhpx8948bJS+knvOSmL6D+ZlsWdu4dRzPRUDafCEon+nMdcOs/lrg0pwvgn7sdE47ymyBJlyJYeQJBANmiaDj8ayCRfztgncm738Jb+xyLcmfw45rSWaFcb82eRpiqk9zWFSqtxjiB82ChZ02wvghhS4RH/5VJN0JR8Q8CQQCtvOV36Qy0EB01/wRs59iFjmd+4pgmZbjHWtsEN4L77aUmxW3eZ9Nh/PAEXvwSVsmg4sWx3mWmPuZknV+PZGeFAkBlMAyzSjFo4B0+90oFzNNZo7iaaf+Ucjzw9BJ2YuscuBVs0AqVp/gJcuhxx4HoEMNeLOn+LXaWF3+u4m7N6BljAkAmE38K75VsJRfxzIkQwSMP6iy+fzSvPZ3oev4DB5N6WRPX0m8IziJimEeV/acq8cBQtUJ0f/QxIhnmNSNLTsrtAkA5UjHOgM+8k+fyW2UT0bVjw++Y1vSkWyKGaBHXlW37TlO0Ma1zC9AkKQNRvAF/N3YwQU6feA2xXRmUiQKiaAG1";
	/**
	 * 用户端公钥
	 */
	public static final String ClientPublicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCTs1bHREbNhAxwEkd1xuoJ4PhRwRihJvfdtd9Af6Inhq98AMXT2qGMOYpzYaWByVDDXaO+LS3IyPLL7gF1ERAqHeRnmGoj55R3syHDkaYJZ4fcSwQGetQzz1AgLhs919RDKIldQSaCVbdWVPVK/DzRxCV+k8bknNjRwJqe92tFywIDAQAB";
	/**
	 * 服务端私钥
	 */
	public static final String ServerPrivateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALmmNO00Dg7wIUZm7o7i2oFDN41a9lbsgHJ5OsAIoTowR7xEx24dnd8DYunQQeIYLmmx31ttCeBzJmBUzO1mYIKIQ0+qUtm00dniiZ9Is51ApKHU4Y7rnrr8BvZNim8dc8dmRWuwd6fXO1FRyDL74Hsip2YgUm5k39ufLVIlm5u9AgMBAAECgYAvvAex0genWaEErCS8wqGySOk4xGHAufDQ/lDX3aAvCQj45KpuqtjT5dgCDJVUICmW7bBjnqbCenksncFPbVp05WDe38oVmAFFq56HNgNxIUoNl43KHeL3vVc4uqcoq8lOFCdcloqymXaWUxKP/F5wkmqLDPzldjfLj6+CJOaltQJBAOjD3k9Ip6fOyfMPQWZ40aHvDL1JVhFneVPkQWbua7DRI3FUZhlRti+yY0CnsEqMTWlYuJgIm6DC+4pgp1G886MCQQDMLlQ4+uQwyoXL5TbodrH2/LKlgyP/rY/kCcKmxkHhILSdjPDmgbtTUqrc3kmtoXYKM+7RxdQdzWTtgxCTxykfAkAK6Dq/nlj03RTLhfh7k8fG/cusBwa4dA/UZYrHBv8W3wX5JopOP2z5GTPbcMArDh4GhLjJrwWT5+8fkd3lT6RfAkAWuK0cribImzDqcLZ8hgDl6FcE/iP6ZtkVWlSz9GoOYHJY+f8w14z+B7wF2iK+1LHrDr5rz6T8MAgkOiqVF1unAkEA1mOWKbAcFz++FuXpuqTf4ohS6fcizXT9QpaK37rOhvkm5IFwXZW8YOW0IbSUhH1kR65JqYiR56+tDE1g8dXUqA==";
	/**
	 * 服务端公钥
	 */
	public static final String ServerPublicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC5pjTtNA4O8CFGZu6O4tqBQzeNWvZW7IByeTrACKE6MEe8RMduHZ3fA2Lp0EHiGC5psd9bbQngcyZgVMztZmCCiENPqlLZtNHZ4omfSLOdQKSh1OGO6566/Ab2TYpvHXPHZkVrsHen1ztRUcgy++B7IqdmIFJuZN/bny1SJZubvQIDAQAB";
	
}