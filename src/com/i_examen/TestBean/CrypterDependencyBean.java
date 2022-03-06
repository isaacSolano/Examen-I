package com.i_examen.TestBean;

import com.i_examen.interfaces.iCryptor;

public class CrypterDependencyBean {
    private iCryptor crptr;

    public void setCryptor (iCryptor cryptor) {
        this.crptr = cryptor;
    }

    public String encrypt (String in_text) {
        return crptr.encrypt(in_text);
    }

    public String decrypt (String in_text) {
        return crptr.decrypt(in_text);
    }
}
