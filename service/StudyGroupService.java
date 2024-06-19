package service;

import java.util.List;

import model.StudyGroup;
import model.impl.Student;
import model.impl.Teacher;

public class StudyGroupService {
    public StudyGroup createGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}
