package student.service.service.impl;

import student.service.model.Student;
import student.service.repository.StudentRepository;
import student.service.service.StudentService;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Реализация сервиса для работы с сущностями {@link Student}.
 * Этот класс предоставляет методы для выполнения операций
 * над студентами, таких как получение списка всех студентов,
 * добавление, обновление и удаление студентов.
 */
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student student) {
        student.setId(id);
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}

