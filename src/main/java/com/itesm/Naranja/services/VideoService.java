package com.itesm.Naranja.services;
import com.itesm.Naranja.dto.VideoDTO;
import com.itesm.Naranja.models.Video;
import com.itesm.Naranja.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VideoService {
    @Autowired
    VideoRepository videoRepository;

    //CREATE
    public void createVideo(final VideoDTO video){
        Video v = new Video();
        v.setAgent_id(video.getAgent_id());
        v.setTimestamp(video.getTimestamp());
        v.setUser_id(video.getUser_id());
        v.setCall_reason(video.getCall_reason());
        v.setDuration_in_mins(video.getDuration_in_mins());
        v.setPermissions(video.getPermissions());
        v.setSetting_time_limit(video.getSetting_time_limit());
        v.setSetting_video_weight(video.getSetting_video_weight());
        v.setSetting_id(video.getSetting_id());
        v.setUser_name(video.getUser_name());
        v.setVideo_id(video.getVideo_id());
        v.setTag_id(video.getTag_id());
        v.setTag_value(video.getTag_value());
        v.setTag_description(video.getTag_description());

        videoRepository.save(v);
    }


    //READ
    public Iterable<Video> lista(){
        return videoRepository.findAll();
    }
    public Iterable<Video> get(String agent_id){
        return videoRepository.findVideo(agent_id);
    }
    public Video getOne(String agent_id, String timestamp){
        return videoRepository.findById(agent_id,timestamp);
    }
    //DELETE
    public void delete(String agent_id, String timestamp){
        videoRepository.deleteById(agent_id,timestamp);
    }


    //UPDATE
    public Video update(VideoDTO video){

        Video v = new Video();
        v.setAgent_id(video.getAgent_id());
        v.setTimestamp(video.getTimestamp());
        v.setUser_id(video.getUser_id());
        v.setCall_reason(video.getCall_reason());
        v.setDuration_in_mins(video.getDuration_in_mins());
        v.setPermissions(video.getPermissions());
        v.setSetting_time_limit(video.getSetting_time_limit());
        v.setSetting_video_weight(video.getSetting_video_weight());
        v.setSetting_id(video.getSetting_id());
        v.setUser_name(video.getUser_name());
        v.setVideo_id(video.getVideo_id());
        v.setTag_id(video.getTag_id());
        v.setTag_value(video.getTag_value());
        v.setTag_description(video.getTag_description());

        return videoRepository.update(v);
    }
}
