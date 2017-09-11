import java.util.*;
public class Main {

	public static void main(String[] args) {




        Date d=new Date();
		Student[] stud = new Student[10];
		for(int i=0;i<10;i++){

            stud[i]=new Student(20,"john david",d,45.5);
		}
		//StudentGroup[] m = new StudentGroup(stud.length);
        //System.out.println(m.getStudents());


		//Student st1=new Student(20,"John david",d,45.45);
		System.out.println(stud.length);



  StudentGroup st=new StudentGroup(10);
  st.setStudents(stud);

  System.out.println(st.getStudent(0).getId());
  //System.out.println(st.getStudent(2));




	}

}
