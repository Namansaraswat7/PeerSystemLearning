package lld.peerlearningsystem.repository;

import lld.peerlearningsystem.entity.Peer;
import lld.peerlearningsystem.entity.Resource;
import lld.peerlearningsystem.entity.Subject;
import lld.peerlearningsystem.entity.Topic;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ResourceRepositoryImpl implements ResourceRepository{

    @Override
    public Optional<Resource> findResource(Subject subject, Topic topic, String name) {
        return Optional.ofNullable(subject.getTopic(topic.getTopicName()).getResource(name));
    }

    @Override
    public List<Resource> findAllResourceInATopic(Topic topic) {
        return topic.getResources().values().stream().collect(Collectors.toList());
    }

    @Override
    public void addResource(Subject subject, Topic topic, Resource resource) {
        subject.getTopic(topic.getTopicName()).addResource(resource);

    }
    @Override
    public Integer countUpvoteForResource(Resource resource) {
        return resource.getUpvoteNumber();
    }

    public void addComment(Peer peer, Resource resource, String comment){
        resource.addComment(peer,comment);
    }

    @Override
    public void upvoteResource(Resource resource){
        resource.upvoteIncrement();
    }

}
