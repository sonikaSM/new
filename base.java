package task_1;


public class base {

    public static void list (){
        int result;

        for (int i = 1; i < 10; i++) {

            for (int j = 1; j < 10; j++) {
                result = j * i;
                System.out.println(i + "*" + j + "=" + result);
                result = 0;
            }
        }

    }

}

