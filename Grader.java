import java.util.*;

public class Grader {
    public static void main(String[] args) {
        int numInputs = 0;
        String readout = "";
        
        Scanner scan = new Scanner(System.in);
        numInputs = Integer.parseInt(scan.nextLine());
        
        for (int i = 1; i <= numInputs; i++) {
            int data = Integer.parseInt(scan.nextLine());

            if (data >= 37) {
                if (((data + 1) % 5) == 0)
                    data = data + 1;
                
                if (((data + 2) % 5) == 0)
                    data = data + 2;    
            }
            readout = readout + "\n" + data;
        }
        System.out.println(readout);
    }
}
