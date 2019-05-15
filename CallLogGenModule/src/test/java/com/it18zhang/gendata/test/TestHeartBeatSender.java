package com.it18zhang.gendata.test;

import com.it18zhang.callloggen.udp.HeartBeatThread;
import org.junit.Test;

/**
 * Created by Administrator on 2017/4/16.
 */
public class TestHeartBeatSender {
    @Test
    public void test1() throws InterruptedException {
        new HeartBeatThread().start();
        while(true){
            Thread.sleep(1000);
        }
    }
}
