class Teacher {
 String designation = "Associate Professor";
 String collegeName = "Bharati Vidyapeeth’s Institute of Computer Applications and Management(BVICAM)";
 void does(){
System.out.println("Teaching");
/*public String getDesignation() {//getter method
return designation;}
 protected void setDesignation(String designation) {//setter method
this.designation = designation;}
 protected String getCollegeName() {
return collegeName;}
 protected void setCollegeName(String collegeName) {
this.collegeName = collegeName;}*/
 }}
public class ProgrammingTeacher extends Teacher{
 String mainSubject = "Programming";
 public static void main(String args[]){
ProgrammingTeacher obj = new ProgrammingTeacher();
System.out.println(obj.collegeName);
System.out.println(obj.designation);
System.out.println(obj.mainSubject);
//System.out.println(obj.getCollegeName());
//System.out.println(obj.getDesignation());
//System.out.println(obj.mainSubject);
obj.does();}}
