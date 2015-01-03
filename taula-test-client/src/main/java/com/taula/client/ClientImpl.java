package com.taula.client;


import java.net.InetSocketAddress;

public class ClientImpl {
    private final InetSocketAddress addr;

    public ClientImpl(final InetSocketAddress addr) {
        this.addr = addr;
    }
}
