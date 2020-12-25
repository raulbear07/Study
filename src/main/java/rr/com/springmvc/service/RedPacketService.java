package rr.com.springmvc.service;

import rr.com.springmvc.pojo.RedPacket;

public interface RedPacketService {
    public RedPacket getRedPacket(Long id);
    public int decreaseRedPacket(Long id);

}
