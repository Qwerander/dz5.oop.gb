package controller;

import java.util.List;

import model.StudyGroup;
import model.impl.Student;
import model.impl.Teacher;

import service.StudentService;
import service.StudyGroupService;
import service.TeacherService;


public class StudyGroupController {
    private StudentService studentService = new StudentService();
    private TeacherService teacherService = new TeacherService();
    private StudyGroupService groupService = new StudyGroupService();

    public StudyGroup createGroup(int teacherId, List<Integer> studentIds) {
        Teacher teacher = teacherService.getById(teacherId);
        List<Student> students = studentService.getByIds(studentIds);
        return groupService.createGroup(teacher, students);
    }
}
