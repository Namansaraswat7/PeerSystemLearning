package lld.peerlearningsystem.repository;

import lld.peerlearningsystem.entity.Subject;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface SubjectRepository {
    Optional<Subject> findBySubjectId(Integer subjectId);
    List<Subject> findAllSubjects();
    void addSubject(Subject subject);
    void addSubjects(Map<Integer, Subject> subjectMap);

}
