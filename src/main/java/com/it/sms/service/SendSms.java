package com.it.sms.service;

import java.util.Map;

/**
 * @author gxp
 */
public interface SendSms {

    /**
     *
     * @param phoneNum
     * @param templateCode
     * @param code
     * @return
     */
    public boolean send(String phoneNum, String templateCode, Map<String, Object> code);
}
