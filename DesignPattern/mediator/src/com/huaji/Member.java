package com.huaji;

public abstract class Member {
    protected String name;
    protected AbstactChatroom chatroom;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstactChatroom getChatroom() {
        return chatroom;
    }

    public void setChatroom(AbstactChatroom chatroom) {
        this.chatroom = chatroom;
    }
    public abstract void sendText(String to,String message);
    public abstract void sendImage(String to,String message);

    public void receiveText(String from,String to){
        System.out.println(from+"发送文本给"+to);
    }
    public void receiveImage(String from,String to){
        System.out.println(from+"发送图片给"+to);
    }
}
