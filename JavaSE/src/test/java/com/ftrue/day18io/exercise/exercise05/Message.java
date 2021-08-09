package com.ftrue.day18io.exercise.exercise05;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: Message
 * @Description:
 * @Author: zhiqi zhang on 2021/7/22 14:12
 * @Version: 1.0
 */
//Message类，包含：发送者、接收者、消息内容、发送时间
public class Message implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sender;
    private String receiver;
    private String message;
    private Date date;

    public Message() {
    }

    public Message(String sender, String receiver, String message, Date date) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", message='" + message + '\'' +
                ", date=" + date +
                '}';
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
