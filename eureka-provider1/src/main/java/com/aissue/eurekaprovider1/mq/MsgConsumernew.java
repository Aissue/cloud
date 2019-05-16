package com.aissue.eurekaprovider1.mq;

import com.aissue.eurekapublic.mq.MqMessageSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;

/**
 * @author: chuny
 * @date: 2019-05-16
 * @description:
 */
@EnableBinding(MqMessageSource.class)
@Slf4j
public class MsgConsumernew {

    @StreamListener(MqMessageSource.MSGRECEIVER)
    public void msgListener(Message<String> message){
        String s = message.getPayload();
        log.info("[MsgConsumernew]收到信息啦-->"+s);
    }
}
