package com.huaji;

public class Client {
    public static void main(String[] args) {
        AbstactChatroom chatroom=new ChatGroup();
        Member member,member1,member2;
        member=new DiamondMember("张三");
        member1=new DiamondMember("李四");
        member2=new CommonMember("王五");

        chatroom.register(member);
        chatroom.register(member1);
        chatroom.register(member2);

        member.sendText("李四","李四，你好");
        member1.sendText("张三","李四，你好");
        member2.sendText("李四","李四，今天咱两打一架");
        member.sendImage("王五","今天太阳太大，不好打");
        member1.sendImage("王五","打就打");

    }
}
