package lesson17__07_11_24_Incapsulation.homework_17;

public class HW17_EmployeeApp {
    public static void main(String[] args) {

        // Создаем объект Employee
        HW17_Employee employee = new HW17_Employee("Erik", 50, 2500.);


        // Распечатываем данные на объект Employee с помощью геттеров
        System.out.println("Name employee: " + employee.getName());
        System.out.println("Age employee: " + employee.getAge());
        System.out.println("Salary employee: " + employee.getSalary());
        System.out.println();
        // Распечатываем метод info() выводящий информацию о работнике.
        employee.info();
    }
}
