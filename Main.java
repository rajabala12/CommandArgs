
public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            System.out.println("Argument " + i +" is: " +args[i]);
        }

       for (int j = 0; j < 4; j++) {
           if (args[j].equals("echo")){
               System.out.println("ECHO echo ...");
               break;
           }
       }

       test1:
       for (int k = 0; k < 4; k++) {
          if (args[k].equals("skip")){
             break test1;
          }
       }

       for (int t = 0; t < 4; t++) {
            if (args[t].equals("exit")){
                break;
            }
        }
    }
}
