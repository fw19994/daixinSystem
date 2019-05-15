package com.it18zhang.ssm.service;

import com.it18zhang.ssm.domain.CallLog;
import com.it18zhang.ssm.domain.CallLogRange;

import java.util.List;

/**
 *
 */
public interface CallLogService {
    public List<CallLog> findAll();

    /**
     * 按照范围查询通话记录
     */
    public List<CallLog> findCallogs(String call,List<CallLogRange> list);
}
