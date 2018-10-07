package com.habage.growing.ctrl;

import com.habage.growing.constants.RabbitConstants;
import com.habage.growing.mq.message.SendMessage;
import com.habage.growing.mq.sender.RabbitSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuhao.wang
 */
@RestController
public class RabbitmqController {

    @Autowired
    private RabbitSender rabbitSender;

    @GetMapping(value = "sendmsg", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Object sendMsg(String name) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setId(1);
        sendMessage.setAge(20);
        sendMessage.setName(name);
        System.out.println("send message!!!!!!!!!!");

        rabbitSender.sendMessage(RabbitConstants.MQ_EXCHANGE_SEND_AWARD, RabbitConstants.MQ_ROUTING_KEY_SEND_COUPON, sendMessage);
        return "发送成";
    }

}