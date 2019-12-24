import java.io.*;
class pizza
{
public static void main(String zaid[])throws IOException
{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(isr);
int ch1,ch2=0,ch3=0,i=0,j=0,bill=0,m=0;
String pztpg [] = new String [10];
String sz [] = new String [10];
int amt [] = new int [10];
String pztpng [] = {"VEG PIZZA","PLAIN PIZZA","PANEER PIZZA"};
String pzsz [] = {"SMALL","MEDIUM","LARGE"};
MENU :
do
{
System.out.println("\n\n\n\n\n\n\n");
System.out.println("__|**|__zzzzWELCOME TO PIZZA HUTzzzz__|**|__");
System.out.println("------------------------------------");
System.out.println("1:-PIZZA SHOPPING");
System.out.println("2:-BILL");
System.out.println("3:-EXIT");
System.out.println("------------------------------------");
System.out.println("PLEASE SELECT YOUR CHOICE BY PRESSING THE CORRESPONDING NO.");
ch1=Integer.parseInt(in.readLine());
switch(ch1)
{
case 1 :
{
System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
System.out.println("1:-VEG PIZZA");
System.out.println("2:-PLANE PIZZA");
System.out.println("3:-PANIR PIZZA");
System.out.println("PLEASE SELECT YOUR PIZZA TOPPING BY PRESSING THE CORRESPONDING NO.");
ch2=Integer.parseInt(in.readLine());
pztpg [m] = pztpng[(ch2-1)];
m++;
    switch(ch2)
    {
    case 1 :
    {
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("1:-SMALL--> Rs.80");
    System.out.println("2:-MEDIUM--> Rs.120");
    System.out.println("3:-LARGE--> Rs.150");
    System.out.println("PLEASE SELECT YOUR PIZZA SIZE BY PRESSING THE CORRESPONDING NO.");
    ch3=Integer.parseInt(in.readLine());
        if(ch3==1)
          {
          amt [j] = 80;
          sz [j] = pzsz [(ch3-1)];
          j++;
          break;
          }
        if(ch3==2)
          {
          amt [j] = 120;
          sz [j] = pzsz [(ch3-1)];
          j++;
          break;
          }
        if(ch3==3)
          {
          amt [j] = 150;
          sz [j] = pzsz [(ch3-1)];
          j++;
          break;
          }
        if(ch3!=1||ch3!=2||ch3!=3)
          {
          System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
          System.out.println("WRONG PIZZA SIZE!!!");
          continue MENU;
          }
    break;
    }
    case 2 :
    {
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("1:-SMALL--> Rs.80");
    System.out.println("2:-MEDIUM--> Rs.120");
    System.out.println("3:-LARGE--> Rs.150");
    System.out.println("PLEASE SELECT YOUR PIZZA SIZE BY PRESSING THE CORRESPONDING NO.");
    ch3=Integer.parseInt(in.readLine());
        if(ch3==1)
          {
          amt [j] = 80;
          sz [j] = pzsz [(ch3-1)];
          j++;
          break;
          }
        if(ch3==2)
          {
          amt [j] = 120;
          sz [j] = pzsz [(ch3-1)];
          j++;
          break;
          }
        if(ch3==3)
          {
          amt [j] = 150;
          sz [j] = pzsz [(ch3-1)];
          j++;
          break;
          }
        if(ch3!=1||ch3!=2||ch3!=3)
          {
          System.out.println("\n\n\n\n\n\n\n\n\n\n\n"); 
          System.out.println("WRONG PIZZA SIZE!!!");
          continue MENU;
          }
    break;
    }
    case 3 :
    {
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("1:-SMALL--> Rs.80");
    System.out.println("2:-MEDIUM--> Rs.120");

    System.out.println("3:-LARGE--> Rs.150");
    System.out.println("PLEASE SELECT YOUR PIZZA SIZE BY PRESSING THE CORRESPONDING NO.");
    ch3=Integer.parseInt(in.readLine());
        if(ch3==1)
          {
          amt [j] = 80;
          sz [j] = pzsz [(ch3-1)];
          j++;
          break;
          }
        if(ch3==2)
          {
          amt [j] = 120;
          sz [j] = pzsz [(ch3-1)];
          j++;
          break;
          }
        if(ch3==3)
          {
          amt [j] = 150;
          sz [j] = pzsz [(ch3-1)];
          j++;
          break;
          }
        if(ch3!=1||ch3!=2||ch3!=3)
          {
          System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
          System.out.println("WRONG PIZZA SIZE!!!");
          continue MENU;
          }
    break;
    }
    default :
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("WRONG PIZZA TOPPING!!!!");
    }
break;
}   
case 2 :
{
System.out.println("\n\n\n\n\n\n\n");
System.out.println("*PIZZA TOPPING*\t\t*PIZZA SIZE*\t\t\t*AMOUNT*");
  for(i=0;i<=(m-1);i++)
  {
  System.out.println(" "+pztpg [i]+"\t\t "+sz [i]+"\t\t\t\t Rs."+amt [i]);
  bill = bill + amt [i];
  }
System.out.println("\t\t\t\t\t\t         _______");  
System.out.println("\t\t\t\t\t\t BILL--> Rs."+bill); 
System.out.println("\n\n\t\t\tTHANKS FOR YOUR VISIT!!\n\t\t\tSEE YOU AGAIN!!");
bill = 0;
break;
}
case 3 :
{
System.exit(0);
break;
}
default :
System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
System.out.println("WRONG CHOICE!!!");
}
}
while(ch1!=3);
}
}