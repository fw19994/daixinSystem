package com.it18zhang.ssm.test;

import com.it18zhang.ssm.domain.CallLog;
import com.it18zhang.ssm.hive.HiveCallLogService;
import com.it18zhang.ssm.monitor.MonitorService;
import com.it18zhang.ssm.web.controller.CallLogController;
import org.junit.Test;

/**
 *
 */
public class TestHeartBeatReceiver {

    @Test
    public void test1() throws InterruptedException {
        new MonitorService();
        while(true){
            Thread.sleep(5000);
        }
    }
}
