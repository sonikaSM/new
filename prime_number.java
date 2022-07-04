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
}
