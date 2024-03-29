package com.xxcep.demo.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;

/**
 * <p>
 * 
 * </p>
 *
 * @author G&H
 * @since 2019-06-13
 */
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId
    private Integer teacherId;


    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
        "teacherId=" + teacherId +
        "}";
    }
}
