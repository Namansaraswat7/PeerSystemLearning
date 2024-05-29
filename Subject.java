package lld.peerlearningsystem.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Subject {
    public Integer subjectId;
    public String subjectName;

    public Map<String, Topic> topics = new HashMap<>();

    public Subject(Integer subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Map<String, Topic> getTopics() {
        return topics;
    }

    public void addTopic(Topic topic){
        this.topics.put(topic.topicName,topic);
    }

    public Topic getTopic(String topicName) {
       return this.topics.get(topicName);
    }

    public void setTopics(Map<String, Topic>  topics) {
        this.topics = topics;
    }
}
