package lld.peerlearningsystem.repository;

import lld.peerlearningsystem.entity.Subject;

import java.util.*;

public class SubjectRepositoryImpl implements SubjectRepository {

    Map<Integer, Subject> subjectList = new HashMap<>();

    @Override
    public Optional<Subject> findBySubjectId(Integer subjectId) {
        return Optional.ofNullable(subjectList.get(subjectId));
    }

    @Override
    public List<Subject> findAllSubjects() {
        List<Subject> subjects = new ArrayList<>();
        subjects.addAll(subjectList.values());
        return subjects;
    }

    @Override
    public void addSubject(Subject subject) {
        this.subjectList.put(subject.getSubjectId(), subject);
    }

    @Override
    public void addSubjects(Map<Integer, Subject> subjectMap) {
        this.subjectList.putAll(subjectMap);
    }
}
