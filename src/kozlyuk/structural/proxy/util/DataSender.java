package kozlyuk.structural.proxy.util;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public final class DataSender {

    private final String clientAddress;

    public DataSender(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    // sending data over transport protocol
    public void sendData(byte[] data) throws IOException {
        System.out.println("Sending " + data.length + " bytes of data to client " + clientAddress);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
