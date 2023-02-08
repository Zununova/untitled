import org.w3c.dom.DOMStringList;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        inputListA();
        inputListB();
        createListC();
        sortListC();
    }
    static ArrayList<String> ListA = new ArrayList<>();

    static void inputListA() {
        System.out.println("Введите элименты для списка А");
        int listCount = 0;
        Scanner scanner = new Scanner(System.in);
        while (listCount < 5) {
            String input = scanner.next();
            ListA.add(input);
            listCount++;

        }
        System.out.println("Список А =" + " " + ListA);

    }
    static ArrayList<String> ListB = new ArrayList<>();

    static void inputListB() {

        System.out.println("Введите элименты для списка B");

        int listCount = 0;
        Scanner scanner = new Scanner(System.in);
        while (listCount < 5) {
            String input = scanner.next();
            ListB.add(input);
            listCount++;

        }
        System.out.println("Список B =" + " " + ListB);

    }
    static ArrayList<String> ListC = new ArrayList<>();
    static  void  createListC(){
        Collections.reverse(ListB);
        int a = 0;
        while (a< 5){
            ListC.add(ListA.get(a));
            ListC.add(ListB.get(a));
            a ++;
        }
        System.out.println("Список С ="+" "+ListC);
    }
    static void sortListC(){
        ListC.sort(Comparator.comparingInt(String::length));
        System.out.println(ListC);

    }
    
}