package com.it18zhang.ssm.web.controller;

import com.alibaba.fastjson.JSON;
import com.it18zhang.ssm.domain.HeartBeat;
import com.it18zhang.ssm.monitor.MonitorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/4/16.
 */
@Controller
public class MonitorController {

    @Resource(name="monitorService")
    private MonitorService ms ;

    @RequestMapping("/monitor/monitorPage")
    public String toMonotorPage(){
        return "monitor/monitor" ;
    }

    @RequestMapping("/json/monitor/getMonotorInfo")
    public String getMonotorInfo() {
        List<HeartBeat> list = ms.getHeartbeats();
        return JSON.toJSONString(list);
    }
}
