package com.es.bean;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Sample Entity
 *
 * @author Kong, created on 2020-02-27T17:42.
 * @since 1.0.0-SNAPSHOT
 */
public class Sample {

    private String id;

    private String deviceCode;

    private Integer tripNo;

    private Integer speed;

    private Integer distance;

    private Double longitude;

    private Double latitude;

    private Integer angle;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date collectTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    public Integer getTripNo() {
        return tripNo;
    }

    public void setTripNo(Integer tripNo) {
        this.tripNo = tripNo;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getAngle() {
        return angle;
    }

    public void setAngle(Integer angle) {
        this.angle = angle;
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }
}
