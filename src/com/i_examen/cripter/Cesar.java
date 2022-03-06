package com.i_examen.cripter;

import com.i_examen.interfaces.iCryptor;

public class Cesar implements iCryptor {
    private int gap = 66;
    private String result = "";

    public String encrypt(String text) {
        result = "";
        for (int i = 0; i < text.length(); i++){
            char or_char = text.charAt(i);
            int or_char_pos = or_char - 'a', new_char_pos = (or_char_pos + gap) % 26;
            char new_char = (char) ('a' + new_char_pos);
            result += new_char;
        }
        return result;
    }

    public String decrypt(String crypted) {
        result = "";
        for (int i = 0; i < crypted.length(); i++){
            char or_char = crypted.charAt(i);
            int or_char_pos = or_char - 'a', new_char_pos = (or_char_pos + (26- ( gap %26 ))) % 26;
            char new_char = (char) ('a' + new_char_pos);
            result += new_char;
        }
        return result;
    }
}
