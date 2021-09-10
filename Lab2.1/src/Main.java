import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Student.getStudents();
        // Task 1
        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i).getLastName() + " ,");
        }

        System.out.println();
        //Task 2
        double average = 0;
        int student_size = students.size();
        for (int i = 0; i < student_size; i++) {
            average += students.get(i).getGpa();
        }
        System.out.println(average / student_size);
        System.out.println();

        //Task 3
        List<String> cities= new ArrayList<>();
        for (Student s : students) {
            if(!cities.contains(s.getCity()) && s.getCity().toLowerCase(Locale.ROOT).contains("a")) {
                cities.add(s.getCity());
            }
        }
        System.out.println( "\n Cities witch include A: " + cities);
        System.out.println();

        //Task 4
        for (Student s : students) {
            if(s.getLastSubmissionDate().isBefore(LocalDate.of(2021,9,26))){
                System.out.print(s.getLastName() + ",");
            }
        }


        //Task 5
        students.sort(Comparator.comparing(Student::getGpa).reversed());
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + "  " + student.getGpa());
        }

        //Task 6
        Double min = 100000.0;
        Double max = 0.0;
        for (int i = 0; i < student_size; i++) {
            if (max < students.get(i).getGpa()) {
                max = students.get(i).getGpa();
            } else if (min > students.get(i).getGpa()) {
                min = students.get(i).getGpa();
            }
        }
        for (int i = 0; i < student_size; i++) {
            if (max.equals(students.get(i).getGpa())) {
                System.out.println(students.get(i).getFirstName() + " " + students.get(i).getLastName());
            }

        }
        System.out.println("max");

        System.out.println(max);

        for (int i = 0; i < student_size; i++) {
            if (min.equals(students.get(i).getGpa())) {
                System.out.println(students.get(i).getLastName() + " " + students.get(i).getLastName());
            }
        }
        System.out.println("min");
        System.out.println(min);

        //Task 7
        Set<Student> set = new HashSet<>(students);
        System.out.println(set);

        //Task 8
        HashMap<String, Double> map = new HashMap<>();
        for(Student s:students){
            map.put(s.getLastName(),s.getGpa());
        }
        System.out.println(map);

        //Task 9
        if (map.containsKey("Mcneill")) {
            // Mapping
            Double a = map.get("Mcneill");
            // Printing value fr the corresponding key
            System.out.println("value for key" + " \"Mcneill\" is:- " + a);
        }


        // Task 10
        for(String key: map.keySet()){
            map.replace(key, map.get(key) + 0.08);
            System.out.println(key + " " + map.get(key));
        }




    }
}


// for (int i = 1; i <student_size ; i++) {
//            Double current =students.get(i).getGpa();
//            int j=i-1;
//            while(j >= 0 && current < students.get(j).getGpa()) {
//                students.get(j+1).getGpa().equals(students.get(j).getGpa());
//                j--;
//            }
//        }

