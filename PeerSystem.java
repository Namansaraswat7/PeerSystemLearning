package lld.peerlearningsystem;

import lld.peerlearningsystem.entity.Peer;
import lld.peerlearningsystem.entity.Subject;
import lld.peerlearningsystem.service.ResourceService;
import lld.peerlearningsystem.service.SubjectService;
import lld.peerlearningsystem.service.TopicService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PeerSystem {

    Map<Integer,Peer> peerList = new HashMap<>();
    SubjectService subjectService = new SubjectService();
    ResourceService resourceService = new ResourceService();
    TopicService topicService = new TopicService();

    public SubjectService getSubjectService() {
        return subjectService;
    }

    public ResourceService getResourceService() {
        return resourceService;
    }

    public TopicService getTopicService() {
        return topicService;
    }

    public Map<Integer, Peer> getPeerList() {
        return peerList;
    }

    public void setPeerList(Map<Integer, Peer> peerList) {
        this.peerList = peerList;
    }

    public Peer getPeer(Integer peerId){
        return peerList.get(peerId);
    }

    public void setPeer(Peer peer){
        this.peerList.put(peer.getPeerId(),peer);
    }

    public void addSubject(Subject subject) {
        this.subjectService.addSubject(subject);
    }

    public Subject getSubject(Integer subjectId) throws Exception {
        return this.subjectService.findBySubjectId(subjectId);
    }


}
