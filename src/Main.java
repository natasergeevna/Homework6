import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //task 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Фамилия Имя Отчество сотрудника - " + fullName + "\n");

        //task 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase() + "\n");

        //task 3
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replaceAll("ё", "e");
        System.out.println("Данные ФИО сотрудника - " + fullName1);
    }
}