package com.design.decorator.demo2_1;

import java.io.Closeable;
import java.io.IOException;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/8/31
 * @Version:v1.0
 */
public abstract class InputStream implements Closeable {
    public abstract int read() throws IOException;


    public int read(byte b[]) throws IOException {}

    public int read(byte b[], int off, int len) throws IOException {}

    public long skip(long n) throws IOException {}

    public int available() throws IOException {}

    @Override
    public void close() throws IOException {}

    public synchronized void mark(int readlimit) {}

    public synchronized void reset() throws IOException {}

    public boolean markSupported() {}
}

