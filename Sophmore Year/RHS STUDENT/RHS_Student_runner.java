public class RHS_Student_runner
{
 public static void main(String[] args)
 {
   RHS_Student freshman = new RHS_Student();
   System.out.println(freshman);
   
   String[] balaSchedule = {"homeroom","Geometry","Strings", "comp", "Lunch","pe","eigo","weather"};
   RHS_Student bala = new RHS_Student(9, 4.44, true, balaSchedule);
   System.out.println(bala);
   System.out.println(freshman.getSC());
   

   bala.dropClass(3);

 }//main
}//Rhs stjden runner