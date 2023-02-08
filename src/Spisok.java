import java.util.ArrayList;
import java.util.Scanner;

public class Spisok {
    int listCount =0;
    ArrayList<Integer> List = new ArrayList<>();
    void inputList (){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        while (listCount<5){
            List.add(input);
        }
        System.out.println(List);

    }

}
