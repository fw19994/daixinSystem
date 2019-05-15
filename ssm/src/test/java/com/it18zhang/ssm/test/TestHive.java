package com.it18zhang.ssm.test;

import com.it18zhang.ssm.domain.CallLog;
import com.it18zhang.ssm.hive.HiveCallLogService;
import com.it18zhang.ssm.util.CharUtil;
import com.it18zhang.ssm.web.controller.CallLogController;
import org.junit.Test;
import org.springframework.ui.Model;

/**
 *
 */
public class TestHive {

    @Test
    public void test1(){
        HiveCallLogService s = new HiveCallLogService();
        CallLog log = s.findLatestCallLog("15032293356");
        System.out.println(log.getCallee());

    }

    @Test
    public void test2(){
        CallLogController c = new CallLogController();
       c.statCallLog222("","") ;

    }

}
