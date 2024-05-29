package lld.peerlearningsystem.entity;

import java.util.HashMap;
import java.util.Map;

public class Resource {
    public String resourceName;
    public ResourceType resourceType;
    public String resourceValue;
    public Integer upvoteNumber = 0;
    public Map<Peer,String> comments = new HashMap<>();

    public Resource(String resourceName, ResourceType resourceType, String resourceValue) {
        this.resourceName = resourceName;
        this.resourceType = resourceType;
        this.resourceValue = resourceValue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceValue() {
        return resourceValue;
    }

    public void setResourceValue(String resourceValue) {
        this.resourceValue = resourceValue;
    }

    public Integer getUpvoteNumber() {
        return upvoteNumber;
    }

    public void upvoteIncrement(){
        this.upvoteNumber++;
    }

    public Map<Peer, String> getComments() {
        return comments;
    }

    public void setComments(Map<Peer, String> comments) {
        this.comments = comments;
    }

    public void addComment(Peer peer, String comment){
        this.comments.put(peer,comment);
    }

    @Override
    public String toString() {
        return "Resource{" +
                "resourceName='" + resourceName + '\'' +
                ", resourceType=" + resourceType +
                ", resourceValue='" + resourceValue + '\'' +
                ", upvoteNumber=" + upvoteNumber +
                ", comments=" + comments +
                '}';
    }
}
