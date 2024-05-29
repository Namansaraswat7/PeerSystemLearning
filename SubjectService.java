package lld.peerlearningsystem.service;

import lld.peerlearningsystem.entity.Subject;
import lld.peerlearningsystem.repository.SubjectRepository;
import lld.peerlearningsystem.repository.SubjectRepositoryImpl;

import java.util.List;
import java.util.Map;

public class SubjectService {

    SubjectRepository subjectRepository = new SubjectRepositoryImpl();

    public void addSubject(Subject subject){
        subjectRepository.addSubject(subject);
    }

    public Subject findBySubjectId(Integer subjectId) throws Exception {
        return subjectRepository.findBySubjectId(subjectId).get();
    }

    public List<Subject> findAllSubjects() {
        return subjectRepository.findAllSubjects();
    }




}
