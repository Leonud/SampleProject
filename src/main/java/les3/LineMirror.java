package les3;
import java.util.Scanner;
public class LineMirror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insert line");
        String line = sc.next();
        boolean p = false;
        int count = line.length()-1;
        for (int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == line.charAt(count)){
                p = true;
            } else {
                p = false;
            }
            System.out.print(p);
            count++;
            if(count == line.length()){
                break;
            }
        }
    }
}
