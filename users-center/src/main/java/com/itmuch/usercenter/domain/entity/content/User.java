package com.itmuch.usercenter.domain.entity.content;

import java.util.Date;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@Accessors(chain = true)
@Table(name = "user")
public class User {
    /**
     * Id
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * å¾®ä¿¡id
     */
    @Column(name = "wx_id")
    private String wxId;

    /**
     * å¾®ä¿¡æ˜µç§°
     */
    @Column(name = "wx_nickname")
    private String wxNickname;

    /**
     * è§’è‰²
     */
    private String roles;

    /**
     * å¤´åƒåœ°å€
     */
    @Column(name = "avatar_url")
    private String avatarUrl;

    /**
     * åˆ›å»ºæ—¶é—´
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * ä¿®æ”¹æ—¶é—´
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * ç§¯åˆ†
     */
    private Integer bonus;
}