import java.io.*;


class Program{
    public static void main(String[] args) throws  IOException{
    char ch;
    BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
    System.out.println("Please Enter the Number ");
    ch=(char)br.read();
    switch(ch){
        case '1':
        System.out.println("Monday");
        break;
        case '2':
        System.out.println("Tuesday");
        break;
        case '3':
        System.out.println("Wednesday");
        break;
        case '4':
        System.out.println("Thursday");
        break;
        case '5':
        System.out.println("Friday");
        break;
        case '6':
        System.out.println("Staurday");
        break;
        case '7':
        System.out.println("Sunday");
        break;
        default:
        System.out.println("Invalid Number");
       
    }
    
    }

}
