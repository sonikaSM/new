import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    private String fname;

    Reader(String filename){
        fname=filename;
    }

    public void read(){
        try {
            File f = new File(this.fname);
            Scanner input = new Scanner(f);

            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("The file does not exist! Try again");
            throw new RuntimeException(e);
            }
    }

}
