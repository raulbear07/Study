package rr.com.springmvc.dao;

import org.springframework.stereotype.Repository;
import rr.com.springmvc.pojo.UserRedPacket;
@Repository
public interface UserRedPacketDao {
    public int grapRedPacket(UserRedPacket userRedPacket);
}
