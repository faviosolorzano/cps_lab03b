package pe.edu.tecsup.lab03.repositories;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<StudentEntity> lista = new ArrayList<>();

    public void guardar(StudentEntity student) { lista.add(student); }
    public List<StudentEntity> listar() { return lista; }
    public StudentEntity buscarPorId(int id) {
        return lista.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }
}