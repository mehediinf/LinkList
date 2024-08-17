import java.util.LinkedList;

class LinkedList_P{
    public static void main(String[] args){

      LinkedList<Student> list = new LinkedList<>();

        
       Student student1 = new Student("Mehedi", 45, "CSE");
       Student student2 = new Student("Hasan", 37, "CSE");
       Student student3 = new Student("Masum", 36, "CS");
       Student student4 = new Student("Sumon", 5, "EEE");

       list.add(student1);
       list.add(student2);
       list.add(student3);
       list.add(student4);


       for (Student student : list) {

        System.out.println("\n");
        System.out.println("Name: "+student.name+"|  Roll: "+student.roll+"|  Deppartment: "+student.dep);
        System.out.println("\n");

       }



     }

}


class Student{

  String name;
  int roll;
  String dep;

  Student(String name,int roll,String dep){

      this.name=name;
      this.roll=roll;
      this.dep=dep;
  }

}


