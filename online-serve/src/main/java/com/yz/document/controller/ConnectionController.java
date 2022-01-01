package com.yz.document.controller;

import cn.hutool.core.util.RandomUtil;
import com.google.common.collect.Maps;
import com.yz.document.exception.BusinessException;
import com.yz.document.model.UserInfo;
import com.yz.document.service.RoomService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @author hjj
 * @create 2022/01/01/22:15
 */
@RestController
@RequestMapping("/connection")
public class ConnectionController {
    @Autowired
    private RoomService roomService;

    @PostMapping("/join/room/{room_code}")
    public String joinRoom(@PathVariable(value = "room_code") String roomCode,
                           @RequestBody UserInfo userInfo,
                           HttpServletRequest request) {
        String clientIp = getClientIp(request);
        List<UserInfo> userInfos = roomService.getRoomUsersInfo(roomCode);
        Optional<UserInfo> createdUser = roomService.getCreatedUser(roomCode);
        
        return "test";
    }


//    @CrossOrigin(origins = {"http://localhost:8080"})
    @GetMapping("/test")
    public String test() {
        return RandomUtil.randomNumbers(5);
    }

    private String getClientIp(HttpServletRequest request) {
        String ip = "";

        if (Objects.nonNull(request)) {
            ip = request.getHeader("X-FORWARDED-FOR");
            if (StringUtils.isEmpty(ip)) {
                throw new BusinessException("User info error!");
            }
        }

        return ip;
    }



}
