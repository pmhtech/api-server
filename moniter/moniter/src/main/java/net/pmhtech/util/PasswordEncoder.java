package net.pmhtech.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/*
 * 패스워드 인코더
 * */

public class PasswordEncoder {
	
	/*
	 * SHA-256 암호화모듈
	 * @param str 문자
	 * @return 암호화된 문자
	 * */
	public static String sha256(String str) {
	    try {
	        MessageDigest md = MessageDigest.getInstance("SHA-256");
	        byte[] hash = md.digest(str.getBytes());
	        BigInteger bi = new BigInteger(1, hash);
	        return String.format("%0" + (hash.length << 1) + "x", bi);
	    } catch (NoSuchAlgorithmException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	
	/*
	 * Salt Key 생성
	 * @return SaltKey
	 * */
	public static String generateSaltKey(){
		Random random = new Random();
		return PasswordEncoder.sha256(random.nextLong()+"");
	}
	
	/*
	 * SHA256+Salt된 암호화된 문자열 생성
	 * @return 암호화된 문자열
	 * */
	public static String getHashedPassword(String inputPassword,String salt){
		return PasswordEncoder.sha256(salt + PasswordEncoder.sha256(inputPassword));
	}
	public static void main(String args[]){
		
		//Salt 키생성
		String saltKey = PasswordEncoder.generateSaltKey();
		
		System.out.println("Salt Key" +saltKey);
		
		//입력문자 +Salt 암호화된 결과
		System.out.print(PasswordEncoder.getHashedPassword("apple", saltKey));
		
	}
	
}
