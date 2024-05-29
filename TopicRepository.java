package lld.peerlearningsystem.repository;

import lld.peerlearningsystem.entity.Subject;
import lld.peerlearningsystem.entity.Topic;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface TopicRepository {
    Optional<Topic> findTopic(Subject subject, String topicName);
    void addTopic(Subject subject, Topic topic);
    Map<String, Topic> findAllTopicsInSubject(Subject subject);

}
