package lld.peerlearningsystem.service;

import lld.peerlearningsystem.entity.Subject;
import lld.peerlearningsystem.entity.Topic;
import lld.peerlearningsystem.repository.TopicRepository;
import lld.peerlearningsystem.repository.TopicRepositoryImpl;

import java.util.Map;

public class TopicService {
    TopicRepository topicRepository =  new TopicRepositoryImpl();

    public void addTopic(Subject subject, Topic topic){
        this.topicRepository.addTopic(subject,topic);
    }

    public Topic findTopic(Subject subject, String topicName) {
        return topicRepository.findTopic(subject,topicName).get();
    }

    public Map<String, Topic> findAllTopicsInSubject(Subject subject){
        return topicRepository.findAllTopicsInSubject(subject);
    }








}
