package lld.peerlearningsystem.service;

import lld.peerlearningsystem.entity.Peer;
import lld.peerlearningsystem.entity.Resource;
import lld.peerlearningsystem.entity.Subject;
import lld.peerlearningsystem.entity.Topic;
import lld.peerlearningsystem.repository.ResourceRepository;
import lld.peerlearningsystem.repository.ResourceRepositoryImpl;

import java.util.List;

public class ResourceService {

    ResourceRepository resourceRepository = new ResourceRepositoryImpl();

    public Resource findResource(Subject subject, Topic topic, String name) {
        return resourceRepository.findResource(subject,topic,name).get();
    }

    public void addResource(Subject subject, Topic topic, Resource resource) {
        resourceRepository.addResource(subject,topic,resource);
    }

    public void upvoteResource(Resource resource)
    {
        resourceRepository.upvoteResource(resource);
    }

    public void addComment(Peer peer, Resource resource, String comment) {
        resourceRepository.addComment(peer,resource,comment);
    }

    public Integer countUpvoteForResource(Resource resource) {
        return resourceRepository.countUpvoteForResource(resource);
    }

    public List<Resource> findAllResourceInATopic(Topic topic) {
        return resourceRepository.findAllResourceInATopic(topic);
    }

}
