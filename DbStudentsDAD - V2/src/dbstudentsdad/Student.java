package dbstudentsdad;

//@author Pleymo

public class Student {
    String idRegister, dni,  name, surname1, surname2;

    public Student() { }

    public String getRegistry() {
        return idRegister;
    }

    public void setRegistry(String registry) {
        this.idRegister = registry;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname1() {
        return surname1;
    }

    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    public String getSurname2() {
        return surname2;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }
    
}
