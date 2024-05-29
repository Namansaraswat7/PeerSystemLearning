package lld.peerlearningsystem.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Topic {
    public String topicName;
    public Map<String, Resource> resources = new HashMap<>();

    public Topic(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public Map<String, Resource> getResources() {
        return resources;
    }

    public void setResources(Map<String, Resource> resources) {
        this.resources = resources;
    }

    public void addResource(Resource resource){

        this.resources.put(resource.getResourceName(),resource);
    }

    public Resource getResource(String name) {
        return this.resources.get(name);
    }

}
