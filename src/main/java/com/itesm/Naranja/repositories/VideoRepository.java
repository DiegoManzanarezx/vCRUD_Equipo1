package com.itesm.Naranja.repositories;

import com.itesm.Naranja.models.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;
import software.amazon.awssdk.enhanced.dynamodb.Key;
import software.amazon.awssdk.enhanced.dynamodb.TableSchema;
import software.amazon.awssdk.enhanced.dynamodb.model.DeleteItemEnhancedRequest;
import software.amazon.awssdk.enhanced.dynamodb.model.QueryConditional;
import software.amazon.awssdk.enhanced.dynamodb.*;
import software.amazon.awssdk.enhanced.dynamodb.model.PageIterable;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

@Repository
public class VideoRepository {

    @Autowired
    private DynamoDbEnhancedClient dynamoDbEnhancedClient;

    public VideoRepository(){
        super();
    }

    public void save(final Video video) {
        DynamoDbTable<Video> videoDynamoDbTable = getTable();
        videoDynamoDbTable.putItem(video);
    }

    private DynamoDbTable<Video> getTable() {
        DynamoDbTable<Video> videoDynamoDbTable = dynamoDbEnhancedClient.table("Video", TableSchema.fromBean(Video.class));
        return videoDynamoDbTable;
    }
    public Iterable<Video> findAll() {
        DynamoDbTable<Video> videoDynamoDbTable = getTable();
        return videoDynamoDbTable.scan().items();
    }

    public Iterable<Video> findVideo(final String agent_id) {
        DynamoDbTable<Video> videoDynamoDbTable = getTable();


        // Create a QueryConditional object that is used in the query operation
        QueryConditional queryConditional = QueryConditional
                .keyEqualTo(Key.builder().partitionValue(agent_id)
                        .build());

        Iterable<Video> result = videoDynamoDbTable.query(r -> r.queryConditional(queryConditional)).items();
        return result;
    }


    public Video findById(final String agent_id, final String timestamp) {
        DynamoDbTable<Video> videoDynamoDbTable = getTable();
        Key key = Key.builder().partitionValue(agent_id).sortValue(timestamp).build();

        Video result = videoDynamoDbTable.getItem(key);
        return result;
    }


    public Video update(final Video video){
        DynamoDbTable<Video> videoDynamoDbTable = getTable();
        Key key = Key.builder().partitionValue(video.getAgent_id()).sortValue(video.getTimestamp()).build();
        Video updatedVideo = videoDynamoDbTable.getItem(r->r.key(key));
        updatedVideo.setAgent_id(video.getAgent_id());
        updatedVideo.setTimestamp(video.getTimestamp());
        updatedVideo.setUser_id(video.getUser_id());
        updatedVideo.setCall_reason(video.getCall_reason());
        updatedVideo.setDuration_in_mins(video.getDuration_in_mins());
        updatedVideo.setPermissions(video.getPermissions());
        updatedVideo.setSetting_time_limit(video.getSetting_time_limit());
        updatedVideo.setSetting_video_weight(video.getSetting_video_weight());
        updatedVideo.setSetting_id(video.getSetting_id());
        updatedVideo.setUser_name(video.getUser_name());
        updatedVideo.setVideo_id(video.getVideo_id());
        updatedVideo.setTag_id(video.getTag_id());
        updatedVideo.setTag_value(video.getTag_value());
        updatedVideo.setTag_description(video.getTag_description());
        videoDynamoDbTable.updateItem(updatedVideo);
        return video;
    }


    public void deleteById(final String agent_id, final String timestamp) {
        DynamoDbTable<Video> videoDynamoDbTable = getTable();

        Key key = Key.builder().partitionValue(agent_id).sortValue(timestamp).build();

        DeleteItemEnhancedRequest deleteRequest = DeleteItemEnhancedRequest
                .builder()
                .key(key)
                .build();

        videoDynamoDbTable.deleteItem(deleteRequest);
    }
}
