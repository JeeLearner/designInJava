package com.design.decorator.demo2_1;

import java.io.IOException;

public class PushbackInputStream extends FilterInputStream {
    private void ensureOpen() throws IOException {}
    
    public PushbackInputStream(InputStream in, int size) {}

    public PushbackInputStream(InputStream in) {}

    public int read() throws IOException {}

    public int read(byte[] b, int off, int len) throws IOException {}

    public void unread(int b) throws IOException {}

    public void unread(byte[] b, int off, int len) throws IOException {}

    public void unread(byte[] b) throws IOException {}

    public int available() throws IOException {}

    public long skip(long n) throws IOException {}

    public boolean markSupported() {}

    public synchronized void mark(int readlimit) {}
 
    public synchronized void reset() throws IOException {}

    public synchronized void close() throws IOException {}
}