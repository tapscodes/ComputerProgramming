import java.util.Arrays;
import java.lang.Math;
class NumberTrickPudell
{
  //What the first 4 steps do is add 3 to your number by first having 5*2=10-4=6/2=3
  //Then when you subtract the original number all you are left with are 3s.
      public static void main(String[] args)
    {
       int constant= 0;
       int[] numbers= new int[20];
       for (int g=0;g<numbers.length;g++)
       {
         numbers[g]=(int)(Math.random()*100-1)+1;
       }
       System.out.println(Arrays.toString(numbers));
       for (int i = 0; i<numbers.length;i++)
       {
         constant =numbers[i];
         numbers[i] = numbers[i]+5;
         numbers[i]=numbers[i]*2;
         numbers[i]=numbers[i]-4;
         numbers[i]=numbers[i] / 2;
         numbers[i]=numbers[i]-constant; 
       }
       System.out.println(Arrays.toString(numbers));
    }
}
