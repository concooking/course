public class Employee {
    private static int idGenerator = 1;

    private final int id;
    private final String fullName;
    private int departman;
    private int salary;

    public Employee(String fullName, int departman, int salary) {
        id = idGenerator++;
        this.fullName = fullName;
        this.departman = departman;
        this.salary = salary;
    }

    public void setDepartman(int departman) {
        this.departman = departman;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartman() {
        return departman;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", departman=" + departman +
                ", salary=" + salary;
    }
}

