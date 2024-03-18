package com.jet.studenthexa.infrastructure.adapters.output.persistence.mapper;

import com.jet.studenthexa.domain.model.Student;
import com.jet.studenthexa.infrastructure.adapters.output.persistence.entity.StudentEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-18T19:22:28+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class StudentPersistenceMapperImpl implements StudentPersistenceMapper {

    @Override
    public StudentEntity toStudentEntity(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentEntity studentEntity = new StudentEntity();

        studentEntity.setId( student.getId() );
        studentEntity.setFirstname( student.getFirstname() );
        studentEntity.setLastname( student.getLastname() );
        studentEntity.setAge( student.getAge() );
        studentEntity.setAddress( student.getAddress() );

        return studentEntity;
    }

    @Override
    public Student toStudent(StudentEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Student.StudentBuilder student = Student.builder();

        student.id( entity.getId() );
        student.firstname( entity.getFirstname() );
        student.lastname( entity.getLastname() );
        student.age( entity.getAge() );
        student.address( entity.getAddress() );

        return student.build();
    }

    @Override
    public List<Student> toStudentList(List<StudentEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<Student> list = new ArrayList<Student>( entityList.size() );
        for ( StudentEntity studentEntity : entityList ) {
            list.add( toStudent( studentEntity ) );
        }

        return list;
    }
}
