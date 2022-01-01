package com.yz.document.service;

import com.google.common.collect.Maps;
import com.yz.document.model.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author hjj
 * @create 2022/01/01/23:18
 */
@Service
public class RoomService {
    // room_code,users
    private static Map<String, List<UserInfo>> roomInfoMap = Maps.newHashMap();

    public List<UserInfo> getRoomUsersInfo(String roomCode) {
        return roomInfoMap.get(roomCode);
    }

    public Optional<UserInfo> getCreatedUser(String roomCode) {
        List<UserInfo> roomUsersInfo = getRoomUsersInfo(roomCode);
        return getCreatedUser(roomUsersInfo);
    }

    public Optional<UserInfo> getCreatedUser(List<UserInfo> userInfos) {
        return userInfos.stream().filter(x -> Boolean.TRUE.equals(x.getIsCreatedUser())).findFirst();
    }
}
