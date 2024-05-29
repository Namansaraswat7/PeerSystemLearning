package lld.peerlearningsystem.repository;

import lld.peerlearningsystem.entity.Peer;
import lld.peerlearningsystem.entity.Resource;
import lld.peerlearningsystem.entity.Subject;
import lld.peerlearningsystem.entity.Topic;

import java.util.List;
import java.util.Optional;

public interface ResourceRepository {

    Optional<Resource> findResource(Subject subject, Topic topic, String name);
    List<Resource> findAllResourceInATopic(Topic topic);
    void addResource(Subject subject, Topic topic, Resource resource);
    Integer countUpvoteForResource(Resource resource);
    void upvoteResource(Resource resource);
    void addComment(Peer peer, Resource resource, String comment);

}
