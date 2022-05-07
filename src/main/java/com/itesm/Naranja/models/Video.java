package com.itesm.Naranja.models;


import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSortKey;

import java.util.Set;

@DynamoDbBean
public class Video {

    private String agent_id;
    private String timestamp;
    private String user_id;
    private String call_reason;
    private int duration_in_mins;
    private String permissions;
    private int setting_time_limit;
    private String setting_video_weight;
    private String setting_id;
    private String user_name;
    private String video_id;
    private Set<String> tag_id;
    private Set<String> tag_value;
    private Set<String> tag_description;


    @DynamoDbPartitionKey
    @DynamoDbAttribute("agent_id")
    public String getAgent_id() {
        return agent_id;
    }

    public void setAgent_id(String agent_id) {
        this.agent_id = agent_id;
    }

    @DynamoDbSortKey
    @DynamoDbAttribute("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCall_reason() {
        return call_reason;
    }

    public void setCall_reason(String call_reason) {
        this.call_reason = call_reason;
    }

    public int getDuration_in_mins() {
        return duration_in_mins;
    }

    public void setDuration_in_mins(int duration_in_mins) {
        this.duration_in_mins = duration_in_mins;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public int getSetting_time_limit() {
        return setting_time_limit;
    }

    public void setSetting_time_limit(int setting_time_limit) {
        this.setting_time_limit = setting_time_limit;
    }

    public String getSetting_video_weight() {
        return setting_video_weight;
    }

    public void setSetting_video_weight(String setting_video_weight) {
        this.setting_video_weight = setting_video_weight;
    }

    public String getSetting_id() {
        return setting_id;
    }

    public void setSetting_id(String setting_id) {
        this.setting_id = setting_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getVideo_id() {
        return video_id;
    }

    public void setVideo_id(String video_id) {
        this.video_id = video_id;
    }

    public Set<String> getTag_value() {
        return tag_value;
    }

    public void setTag_value(Set<String> tag_value) {
        this.tag_value = tag_value;
    }

    public Set<String> getTag_id() {
        return tag_id;
    }

    public void setTag_id(Set<String> tag_id) {
        this.tag_id = tag_id;
    }

    public Set<String> getTag_description() {
        return tag_description;
    }

    public void setTag_description(Set<String> tag_description) {
        this.tag_description = tag_description;
    }
}
