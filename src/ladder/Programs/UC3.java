package ladder.Programs;

public class UC3 {
    public static void Ladder2(){
        int max=6,min=0;
        int n=(int) (Math.random()*(max-min+1)+min);
        System.out.println("The dice no is: "+n);
        int m=(int)(Math.random()*(4));
        System.out.println("The check no:"+m);
        if(m==0){
            System.out.println("The Player does not moves");
        }
        else if(m==1){
            System.out.println("The player went for ladder and recieved "+n+" points");
        }
        else
            System.out.println("the player went for snake and lost "+n+" points");

    }
    public static void main(String[] args){
        Ladder2();
    }
}
