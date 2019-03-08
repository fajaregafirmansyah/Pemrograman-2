package tugas08;

/**
 *
 * @author Fajar Ega Firmansyah
 */
public class Employee {
    private String name;
    private String address;
    private long salary;

    public Employee(String name, String address, long salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    
    
}
