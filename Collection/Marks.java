package Collection;
import java.util.HashSet;
    public class Marks {

        public static void main(String[] args) {
            // HashSet initialization
            HashSet<Student> set = new HashSet<>();
            // Add entries in HashSet
            set.add(new Student("sam", 452));
            set.add(new Student("cam", 451));
            set.add(new Student("sam", 452));
            set.add(new Student("cam", 451));
            for (Student std : set) {
                System.out.println(std.name + " " + std.marks);
            }
        }
    }

