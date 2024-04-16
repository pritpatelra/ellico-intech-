
import java.util.*;
 public class ll
 {    

    public static void main(String[] args)  {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("for div press 500");
        System.out.println("enter 700 for coversation");
        System.out.println("for mul ,add, sub 350  to perform");
        int n =sc.nextInt();
        int sum =0;
        int mul= 1;
        int sub=0;
        if(n==500){
            System.out.println("enter number you want to divide");
            float f=sc.nextFloat();
            System.out.println("enter number by which you want to divide");
            float h=sc.nextFloat();
            System.out.println("your division is ");
            double d=f/h;
            System.out.println(d);
            } 
            if(n==700){
                System.out.println("enter coversion unit");
                System.out.println("enter 300 for lenght coversion unit");
                System.out.println("enter 200 for liquid coversion unit");
                System.out.println("enter 100 for mass coversion unit");
                System.out.println("enter 800 for volume coversion unit");
                System.out.println("enter here");
                int u=sc.nextInt();
                if( u==300){
                    System.out.println("enter 100 for km to m");
                    System.out.println("enter 200 for m to cm");
                    System.out.println("enter 300 for km to cm");
                    System.out.println("enter here");
                    int e =sc.nextInt();
                    if (e==100){
                        System.out.println("enter your data");
                        int y =sc.nextInt();
                        int o=y*1000;
                        System.out.println("your "+y +"km is "+ o+"m");
                        
                    } if (e==200){
                        System.out.println("enter your data");
                        int y =sc.nextInt();
                        int o=y*100;
                        System.out.println("your "+y +"m is "+ o+"cm");
                    }
                    if (e==300){                      
                          System.out.println("enter your data");
                        int y =sc.nextInt();
                        int o=y*100000;
                        System.out.println("your "+y +"km is "+ o+"cm");
                     } return;
                }if(u==200){
                    System.out.println("enter 100 for l to ml");
                    System.out.println("enter 200 for ml to l");
                    System.out.println("enter here");
                    int l =sc.nextInt();
                    if(l==100){System.out.println("enter your data");
                        int eg=sc.nextInt();
                        int q= eg*1000;
                        System.out.println("your "+eg+"l"+"is"+q+"ml");

                    }if(l==200){
                        System.out.println("enter your data");
                        int egs=sc.nextInt();
                        int q= egs/1000;
                        System.out.println("your "+egs+"ml"+"is"+q+"l");

                    }

                }if(u==100){
                System.out.println("enter 100 for kg to g");
                System.out.println("enter 200 for g to mg");
                System.out.println(" enter 300 for kg to mg");
                System.out.println("enter here");
                int fgs=sc.nextInt();
                if(fgs==100){
                    System.out.println("enter your data");
                    double fg =nextdouble();
                    double ty=fg*1000;
                    System.out.println("your"+ fg+"kg is"+ty+"g");
                }
                if(fgs==200){
                    System.out.println("enter your data");
                    double fg = nextdouble();

                    double ty=fg*100;
                    System.out.println("your"+ fg+"g is"+ty+"mg");
                }if(fgs==300){
                    System.out.println("enter your data");
                    double fg = nextdouble();
                     double ty=fg*100000;
                    System.out.println("your"+ fg+"kg is"+ty+"mg");
                }
                return;

                
                }if(u==800){
                    System.out.println("enter 100 for km^3 to m^3");
                    System.out.println("enter 200 for m^3 to cm^3");
                    System.out.println("enter here");
                    int e =sc.nextInt();
                    if (e==100){
                        System.out.println("enter your data");
                        int y =sc.nextInt();
                        int o=y*1000000000;
                        System.out.println("your "+y +"km^3 is "+ o+"m^3");
                    } if (e==200){
                        System.out.println("enter your data");
                        int y =sc.nextInt();
                        int o=y*1000000;
                        System.out.println("your "+y +"m^3 is "+ o+"cm^3");
                    }
                }
            }
                if(n==350){
                    System.out.println(" enter number of term you want to calculate");
                    int o=sc.nextInt();
             for(int i=1;i<=o;i++){
            int m;
            System.out.println("enter your "+ i +"  number" );
            m=sc.nextInt();
            mul=mul*m;
            sum=sum+m;
            sub=sub-m;
            
        }
        System.out.println("enter 0 for add(0) or 1 for mul(1).");
        System.out.println("enter  number 2 for add and mul and sub");
        System.out.println("enter 3 for sub");
        System.out.println("enter 4 for avg");
        int g=sc.nextInt();
        if(g==0){
        
        System.out.println("sum of all this number =" + sum ) ;}
        
        if (g==1) {
        System.out.println("your mul is: "+mul);}
        if (g==2){
            System.out.println("sum of all this number =" + sum );
            System.out.println("your mul is: "+mul );
            System.out.println("sub of all number is" + sub);
            System.out.println("your avg is :" + sum/o);
        }
        if (g==3){
            System.out.println("sub of all number is" + sub);
        } if (g==4){
            System.out.println("your avg is :" + sum/o);
        }

     } }
    
        


    private int nextInt() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nextInt'");
    }

    private static double nextdouble() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nextdouble'");
    }}

   
    