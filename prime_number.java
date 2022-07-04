package task_2;

public class prime_number {

    public static boolean checker(int n){
        int remains;

        boolean prime = true;

        int i=2;

        while (( i<n)){

            remains = n%i;
            //System.out.println(remains);
            
            if (remains==0){
                prime=false;
                break;
            }
            else {i++;};
        }
        return prime;
    }
    public static boolean checker2(int n){
        int remains;

        boolean prime = true;

        int i=2;
        int x= n/2;
        while (( i<x)){

            remains = n%i;
            //System.out.println(remains);

            if (remains==0){
                prime=false;
                break;
            }
            else {i++;};
        }
        return prime;

    }
    //count the amount of prime numbers on the (1,end)

    public static int count_prime (int end){
        int count=0;
        for(int i=1; i<end; i++){

            if(checker(i)){
                //System.out.println(i);
                count++;
            };
        }
        return count;
    }
}
