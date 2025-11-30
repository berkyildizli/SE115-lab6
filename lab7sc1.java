public class lab7sc1 {
        public static void main(String[] args) {
            Student a = new Student("Berk", 18);
            a.printStudentInfo(); //with parameter so first one occurs
            Student b = new Student();
            b.printStudentInfo(); //without parameter so second one occurs
        }
    }

    class Student {
        public String name;
        public int age;


        public Student(String n,int a){ //
            name =n;
            age = a;
        }
        public Student(){
            name ="Unk";
            age = 0;
        }
        public void  printStudentInfo(){
            System.out.println(name +" "+age);

}
    }

/*questions:
what are the values assigned to name and age?
name: null  age:0
did you get any errors?
no
 */