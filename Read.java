public class Read {

    public static void main(String [] args){
        System.out.println("Hello. It´s your text operating program");
        System.out.println("The file I am going to read is :"+args[0]);
        Reader r=new Reader(args[0]);
        r.read();


    }


}
