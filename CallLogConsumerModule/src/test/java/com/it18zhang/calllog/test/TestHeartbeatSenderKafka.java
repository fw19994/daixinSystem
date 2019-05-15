package com.it18zhang.calllog.test;

import com.it18zhang.calllog.consumer.HbaseDao;
import com.it18zhang.calllog.consumer.HeartBeatThread;
import org.junit.Test;

/**
 *
 */
public class TestHeartbeatSenderKafka {
    @Test
    public void test1() throws InterruptedException {
        new HeartBeatThread().start();
        while(true){
            Thread.sleep(100000);
        }
    }
}
