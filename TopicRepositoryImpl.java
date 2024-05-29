package lld.peerlearningsystem.repository;

import lld.peerlearningsystem.entity.Subject;
import lld.peerlearningsystem.entity.Topic;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TopicRepositoryImpl implements TopicRepository{

    @Override
    public Optional<Topic> findTopic(Subject subject, String topicName) {
        return Optional.ofNullable(subject.getTopic(topicName));
    }

    @Override
    public void addTopic(Subject subject, Topic topic) {
        subject.addTopic(topic);
    }

    @Override
    public Map<String, Topic> findAllTopicsInSubject(Subject subject) {
        return subject.getTopics();
    }
}
