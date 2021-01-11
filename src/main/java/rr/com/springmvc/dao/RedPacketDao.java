package rr.com.springmvc.dao;

import org.springframework.stereotype.Repository;
import rr.com.springmvc.pojo.RedPacket;
@Repository
public interface RedPacketDao  {
    public RedPacket getRedPacket(Long id);
    public int decreaseRedPacket(Long id);
    public RedPacket getRedPacketForUpdate(Long id);
    public int decreaseRedPacketForVersion(Long id , Integer version);
}
