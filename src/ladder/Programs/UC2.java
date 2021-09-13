package ladder.Programs;

public class UC2 {

    public static void Ladder1(){
        int max=6,min=0;
        int n=(int) (Math.random()*(max-min+1)+min);
        System.out.println("The dice no is: "+n);

    }
    public static void main(String[] args){
        Ladder1();
    }
}
