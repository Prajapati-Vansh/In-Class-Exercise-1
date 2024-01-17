package arraydemo;

/**
 *Third commit
 * @author vsp31
 */
public class studentList {
    public static void main(String[] args){
        Student s1 = new Student(1, "Vansh");
        Student studentList = new Student[3];
        
        studentList[0] = s1;
        System.out.println("Third Commoit");
        
        studentList[1] = new Student(2,"abc");
        studentList[1] = new Student(3,"xyz");
        
        for (int i=0; i<studentList.length;i++);{
        System.out.println(studentList[i].getSname());
    }
        
    }
}
