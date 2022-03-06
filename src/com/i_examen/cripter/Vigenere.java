package com.i_examen.cripter;

import com.i_examen.interfaces.iCryptor;

public class Vigenere implements iCryptor {
    private String key = "gsc";
    private StringBuilder result = new StringBuilder();

    public String encrypt(String text) {
        result.setLength(0);
        for (int i = 0; i < text.length(); i++) {
            int indx = i >= key.length() ? i - key.length() : i,
                char_pos = (text.charAt(i) + key.charAt(indx)) % 26;
            char_pos += 'a';
            result.append((char)(char_pos));
        }
        return result.toString();
    }

    public String decrypt(String crypted) {
        result.setLength(0);
        for (int i = 0; i < crypted.length() && i < key.length(); i++) {
            int char_pos = (crypted.charAt(i) - key.charAt(i) + 26) % 26;
            char_pos += 'a';
            result.append((char)(char_pos));
        }
        return result.toString();
    }
}
