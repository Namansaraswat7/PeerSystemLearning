package lld.peerlearningsystem;

import lld.peerlearningsystem.entity.*;

public class MainClientController {

    public static void main(String[] args) {

        PeerSystem peerSystem = new PeerSystem();

        // creating peers and subjects

        Peer naman = new Peer(1,"Naman","naman1@gmail.com");
        Peer ram = new Peer(2,"Ram","naman1@gmail.com");

        Subject lld = new Subject(1,"LLD");
        Subject microservices = new Subject(2,"Microservices");

        Topic solidPrinciple = new Topic("SolidPrinciple");

        Resource solidPrincipleArticle = new Resource("solidPrincipleArticle", ResourceType.ARTICLE,"www.lld.solidprinciple.com");
        solidPrinciple.addResource(solidPrincipleArticle);

        lld.addTopic(solidPrinciple);

        // adding peers in peer system
        peerSystem.setPeer(naman);
        peerSystem.setPeer(ram);

        // adding subjects in peer system
        peerSystem.getSubjectService().addSubject(lld);
        peerSystem.getSubjectService().addSubject(microservices);


        // Fetching added resource
        Resource resource = peerSystem.getResourceService().findResource(lld,solidPrinciple,"solidPrincipleArticle");



        System.out.println(resource.toString());
        System.out.println(resource.getResourceValue());

        // upvote resource and adding comment by a peer

        peerSystem.getResourceService().upvoteResource(solidPrincipleArticle);
        peerSystem.getResourceService().addComment(naman,solidPrincipleArticle,"Good url for learning Solid principle");

        System.out.println(resource.getComments());


    }
}
