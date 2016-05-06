package com.trenoz.services.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Component;

/**
 * The PasswordHasher used to encrypt the entered password by using SHA1
 * algorithm
 * 
 * @author Mohit Aggarwal
 * @version 1.0
 *
 */
@Component
public class PasswordHasher {

	/**
	 * Constant to hold 1
	 */
	private static final int INT_ONE = 1;

	/**
	 * Constant to hold 2
	 */
	private static final int INT_TWO = 2;

	/**
	 * Constant to hold 4
	 */
	private static final int INT_FOUR = 4;

	/**
	 * Constant to hold 16
	 */
	private static final int INT_SIXTEEN = 16;

	/**
	 * Constant to hold 127
	 */
	private static final int INT_ONE_TWENTY_SEVEN = 127;

	/**
	 * Constant to hold hexadecimal value of 0xF0
	 */
	private static final int HEX_0XF0 = 0xF0;

	/**
	 * Constant to hold hexadecimal value of 0xF
	 */
	private static final int HEX_0XF = 0xF;

	/**
	 * This method is used to perform encode the byte provided.
	 * 
	 * @param pBytes
	 *            - bytes of characters.
	 * @return String - encoded password.
	 */
	protected String encodeChars(byte[] pBytes) {
		char[] buf = new char[pBytes.length * INT_TWO];
		for (int i = 0; i < pBytes.length; ++i) {
			int num = getInt(pBytes[i]);
			buf[(i * INT_TWO)] = Character.forDigit((num & HEX_0XF0) >> INT_FOUR, INT_SIXTEEN);
			buf[(i * INT_TWO + INT_ONE)] = Character.forDigit(num & HEX_0XF, INT_SIXTEEN);
		}
		return new String(buf);
	}

	/**
	 * 
	 * @param pBit
	 *            - bit value.
	 * @return integer.
	 */
	protected int getInt(int pBit) {
		if (pBit < 0) {
			pBit = INT_ONE_TWENTY_SEVEN - pBit;
		}
		return pBit;
	}

	/**
	 * This method performs the encoding operation
	 * 
	 * @param pPassword
	 *            - User Password.
	 * @return Encrypted password.
	 */
	public String encryptPassword(String pPassword) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA1");
			byte[] source = new byte[pPassword.length()];
			source = pPassword.getBytes();
			byte[] digest = md.digest(source);
			String encodedChar = encodeChars(digest);
			return encodedChar;
		} catch (NoSuchAlgorithmException exc) {

		}
		return pPassword;
	}
}
