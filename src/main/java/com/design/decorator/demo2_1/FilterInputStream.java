package com.design.decorator.demo2_1;

import java.io.IOException;

public class FilterInputStream extends InputStream {
    protected FilterInputStream(InputStream in) {}
    
    public int read() throws IOException {}

    public int read(byte b[]) throws IOException {}
    
    public int read(byte b[], int off, int len) throws IOException {}

    public long skip(long n) throws IOException {}

    public int available() throws IOException {}

    public void close() throws IOException {}

    public synchronized void mark(int readlimit) {}

    public synchronized void reset() throws IOException {}

    public boolean markSupported() {}
}