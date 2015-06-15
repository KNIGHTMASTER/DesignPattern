package com.zisal.customiodecorator.impl;

import java.io.*;

/**
 * Created by Achmad Fauzi on 4/7/2015 : 3:12 PM.
 * mailto : fauzi.knightmaster.achmad@gmail.com
 */
public class LowerCaseInputStream extends FileInputStream {
    public LowerCaseInputStream(File file) throws FileNotFoundException {
        super(file);
    }

    public LowerCaseInputStream(InputStream is) throws FileNotFoundException {
        super(String.valueOf(is));
    }

    @Override
    public int read() throws IOException {
        return super.read();
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for( int i= off; i<off + result; i++){
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return result;
    }
}
