package com.aissue.eurekapublic.mq;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface MqMessageSource {
    String MSGSENDER = "msgSender";
    String MSGRECEIVER = "msgReceiver";

    @Output(MSGSENDER)
    MessageChannel msgSender();

    @Input(MSGRECEIVER)
    SubscribableChannel msgReceiver();
}
