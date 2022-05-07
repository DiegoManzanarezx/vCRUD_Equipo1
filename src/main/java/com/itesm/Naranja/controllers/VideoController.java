package com.itesm.Naranja.controllers;

import com.itesm.Naranja.dto.VideoDTO;
import com.itesm.Naranja.models.Video;
import com.itesm.Naranja.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import software.amazon.awssdk.enhanced.dynamodb.model.PageIterable;

@RestController
@RequestMapping("/v1/video")
public class VideoController {

    @Autowired
    VideoService videoService;

    @PostMapping("/save")
    public VideoDTO save(@RequestBody VideoDTO video) throws Exception{
        videoService.createVideo(video);
        return video;
    }

    @GetMapping("/all")
    public ResponseEntity<Iterable<Video>> getAll(){
        return ResponseEntity.ok(videoService.lista());
    }

    @GetMapping("/{agent_id}")
    public ResponseEntity<Iterable<Video>> getOne(@PathVariable("agent_id") String agent_id){
        return ResponseEntity.ok(videoService.get(agent_id));
    }

    @GetMapping("/{agent_id}/{date}")
    public ResponseEntity<Video> getOne(@PathVariable("agent_id") String agent_id, @PathVariable("date") String date){
        return ResponseEntity.ok(videoService.getOne(agent_id, date));
    }

    @DeleteMapping("/delete/{agent_id}/{date}")
    public ResponseEntity<?> delete(@PathVariable("agent_id") String agent_id, @PathVariable("date") String date){
        videoService.delete(agent_id, date);
        return new ResponseEntity("persona eliminada", HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Video> update(@RequestBody VideoDTO video){
        return ResponseEntity.ok(videoService.update(video));
    }
}
