import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<User> userList = new ArrayList<>();
        String name;
        Integer age;
        for (int i = 1; i < 6; i++){
            System.out.println("введите имя номер " + i  + " :" );
            name = scanner.nextLine();
            System.out.println("введите возраст: ");
            age = Integer.valueOf(scanner.nextLine());
            userList.add(new User(name,age));
        }
        Collections.sort(userList, new Comparator<User>(){
        public int compare(User u1, User u2){
            return Integer.compare(u1.getAge(), u2.getAge());
            }
        });
        System.out.println("Список пользователей:");
        for (User user : userList) {
            System.out.println(user.toString());
        }
    }
}
class User{
    private String name;
    private Integer age;
    public User(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public String getname(){
        return name;
    }
    public Integer getAge(){
        return age;
    }
    public String toString(){
        return name + ", возраст " + age + " лет";
    }
}