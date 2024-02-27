import java.util.Scanner;
 class calculator 
 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Subjects : ");
        int n=sc.nextInt();
        int mks[]= new int[n];
        System.out.print("Enter marks obtained out of 100 : ");
        for(int i=0;i< n; i++)
        {
            mks[i]= sc.nextInt();
           }
    int t=0;
      for(int i=0;i< n; i++)
      {
          t=t + mks[i];
      }
    float avg= (float)t/n;
    System.out.println("totak marks =" + t);
    System.out.println("Average precentage =" + avg);
    
             if(avg>=95)
                 System.out.println("Grade = A+ ");
             else if (avg>=85 && avg<=94)
                 System.out.println("Grade = A ");
             else if(avg>=75 && avg<=84)
                 System.out.println("Grade= B ");
             else if(avg>=65 && avg<=74)
             System.out.println("Grade = C ");
             else if (avg>=55 && avg<=64)
                 System.out.println("Grade = D ");
             else if(avg>= 45 && avg<=54)
                 System.out.println("Grade = E ");
             else if(avg<45)
                 System.out.println("Grade = F ");
             sc.close();
             }
}
    

