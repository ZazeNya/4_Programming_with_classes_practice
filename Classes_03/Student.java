import java.util.Arrays;
import java.util.Objects;
public class Student {
    private String Name;
    private int groupNumber;
    private int grades[];

    public Student() {
    }

    public Student(String surnameAndInit, int groupNumber) {
        this.Name = surnameAndInit;
        this.groupNumber = groupNumber;
        grades = new int[5];
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void addGrade(int grade1, int grade2, int grade3, int grade4, int grade5){
        grades[0] = grade1;
        grades[1] = grade2;
        grades[2] = grade3;
        grades[3] = grade4;
        grades[4] = grade5;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(grades);
        result = prime * result + Objects.hash(groupNumber, Name);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return Arrays.equals(grades, other.grades) && groupNumber == other.groupNumber
                && Objects.equals(Name, other.Name);
    }

    @Override
    public String toString() {
        return "Студент [Имя=" + Name + ", группа=" + groupNumber + ", оценки="
                + Arrays.toString(grades) + "]";
    }
    public void printStudents(Student[] students) {

        System.out.println("Список всех студентов: ");

        for(Student student : students) {
            System.out.print("Студент: " + student.getName() + ". Группа: "
                    + Integer.toString(student.getGroupNumber()) + ". Оценки: ");

            for (int grade : student.getGrades())
                System.out.print(grade + " ");
            System.out.print("\n");
        }
        System.out.println();
    }

    public void selectGradesFrom9(Student[] students) {

        System.out.println("Список студентов с оценками только 9 и 10: ");

        for(Student student : students) {
            int numberOfGradesFrom9 = 0;

            for (int grade : student.getGrades()) {
                if (grade >= 9) {
                    numberOfGradesFrom9++;
                }
            }
            if(numberOfGradesFrom9 == 5) {
                System.out.print("Студент: " + student.getName() + ". Группа: "
                        + Integer.toString(student.getGroupNumber()) + ". Оценки: ");

                for (int grade : student.getGrades())
                    System.out.print(grade + " ");
                System.out.print("\n");
            }
        }
        System.out.println();
    }
}
