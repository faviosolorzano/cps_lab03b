package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.services.StudentService;

public class StudentController {
    private StudentService service = new StudentService();

    public void agregarStudent(int id, String nombre, String apellido, String correo) {
        StudentEntity student = new StudentEntity();
        student.setId(id);
        student.setNombre(nombre);
        student.setApellido(apellido);
        student.setCorreo(correo);
        service.registrar(student);
        System.out.println("Student registrado: " + nombre);
    }
}