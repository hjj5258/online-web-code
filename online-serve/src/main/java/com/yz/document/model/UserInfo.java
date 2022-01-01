package com.yz.document.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hjj
 * @create 2022/01/01/22:46
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    private String id;
    private String ip;
    private String port;
    private String name;
    private Boolean isCreatedUser;
}
