package com.dchristofolli.zeromqmessaging.messaging;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.zeromq.SocketType;
import org.zeromq.ZContext;
import org.zeromq.ZMQ;
import org.zeromq.ZMQException;

import java.util.logging.Logger;

@Service
@EnableScheduling
public class ZeroServer {
    Logger log = Logger.getLogger(ZeroServer.class.getName());
    private final ObjectMapper mapper;

    @Value("${messaging.server.address}")
    String address;

    public ZeroServer(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    private ZContext connect() {
        return new ZContext();
    }

    private ZMQ.Socket createSocket() {
        ZMQ.Socket socket = connect().createSocket(SocketType.PULL);
        socket.bind(address);
        return socket;
    }

    @Scheduled(fixedDelay = 5000)
    public void receive() {
        byte[] bytes;
        Client client = null;
        try {
            bytes = createSocket().recv(0);
            client = mapper.readValue(new String(bytes, ZMQ.CHARSET), Client.class);
        } catch (ZMQException | JsonProcessingException e) {
            log.severe(e.getMessage());
        }
        log.info("Received: [ " + client + " ]");
    }
}
