package ladder.Programs;

public class UC6 {
    public static void Ladder4(){
        int max=6,min=0;
        int score=0,l,count=0;
        while(score<=100){
            int n=(int) (Math.random()*(max-min+1)+min);
            System.out.println("The dice no is: "+n);
            int m=(int)(Math.random()*(4));
            System.out.println("The check no:"+m);

            if(m==0){
                System.out.println("The Player does not moves");
                score=score;
                System.out.println("The score is: "+score);
                count++;
            }
            else if(m==1){
                System.out.println("The player went for ladder and received "+n+" points");
                score=score+n;
                if(score>100){
                    score=score-n;
                    while(score+n==100){
                        score=score;
                    }
                }
                System.out.println("The score is: "+score);
                count++;
            }
            else {
                System.out.println("the player went for snake and lost " + n + " points");
                score = score - n;
                if (score < 0) {
                    score = 0;
                }
                System.out.println("the score is: " + score);
                count++;
            }

        }
        System.out.println("Count is: "+count);
    }
    public static void main(String[] args){
        Ladder4();
    }
}
