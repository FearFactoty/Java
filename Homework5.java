package GB;

public class Homework5 {
    public static void main(String[] args){
//        1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//        2. Конструктор класса должен заполнять эти поля при создании объекта.
        Employee Fedor = new Employee( "Fedor" , "manager", "fedor@test.ru", 74955557755L, 1000, 32);
//        3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
        System.out.println("name: " + Fedor.getName() + " " + "vacation: " + Fedor.getVacation() + " " + "email: " + Fedor.getEmail() + " " + "phoneNumber: " + Fedor.getPhoneNumber() + " " + "salary: " + Fedor.getSalary() + " " + "age: " + Fedor.getAge());
//        4. Создать массив из 5 сотрудников.
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 74955557755L, 30000, 30);
        persArray[1] = new Employee("Petrov Petr", "programmer", "1@mailbox.com", 74955557755L, 30000, 30);
        persArray[2] = new Employee("Khevavasam Victor", "programmer", "2@mailbox.com", 74955557755L, 30000, 41);
        persArray[3] = new Employee("Khevavasam  Arthur", "programmer", "3@mailbox.com", 74955557755L, 30000, 40);
        persArray[4] = new Employee("P Vladimir", "President", "777@mailbox.com", 74955557755L, 130000, 58);

//        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40)
            System.out.println("name: " + persArray[i].getName() + " " + "vacation: " + persArray[i].getVacation() + " " + "email: " + persArray[i].getEmail() + " " + "phoneNumber: " + persArray[i].getPhoneNumber() + " " + "salary: " + persArray[i].getSalary() + " " + "age: " + persArray[i].getAge());
        }
    }

}
