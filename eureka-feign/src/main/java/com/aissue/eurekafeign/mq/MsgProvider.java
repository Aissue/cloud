package com.aissue.eurekafeign.mq;

import com.aissue.eurekapublic.mq.MqMessageSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @author: chuny
 * @date: 2019-05-16
 * @description:
 */
@EnableBinding(MqMessageSource.class)
@Slf4j
public class MsgProvider {
    @Autowired
    private MqMessageSource messageSource;

    public void sendMsg(String msg){
        boolean result  = messageSource.msgSender().send(MessageBuilder.withPayload(msg).build());
        if(!result){
            log.error("send msg ["+msg+"] fail...");
        }
        log.info("send msg over...");
    }
}
