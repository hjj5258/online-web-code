package com.yz.document.controller;

import com.yz.document.model.UserInfo;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

/**
 * @author hjj
 * @create 2022/01/01/22:59
 */
@RestController
@RequestMapping("/room")
public class RoomController {

    @PostMapping("/create")
    public String create(@RequestBody UserInfo userInfo) {
        return "random_code";
    }
}
