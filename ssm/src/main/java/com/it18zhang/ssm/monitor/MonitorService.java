package com.it18zhang.ssm.monitor;

import com.it18zhang.ssm.domain.HeartBeat;
import com.it18zhang.ssm.util.PropertiesUtil;
import org.springframework.stereotype.Service;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 */
@Service("monitorService")
public class MonitorService {

    private DatagramSocket sock;
    private ReceiveThread t;

    public MonitorService() {
        t = new ReceiveThread();
        t.start();
    }

    public List<HeartBeat> getHeartbeats() {
        return new ArrayList<HeartBeat>(t.map.values());
    }

}
