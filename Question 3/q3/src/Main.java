import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer>  sortList(ArrayList<Integer> s1){

        for(int i = 0; i < s1.size(); i++){
            for(int j = i+1; j < s1.size(); j++){
                if((s1.get(i) > s1.get(j))){
                    int x = s1.get(i);
                    s1.set(i,s1.get(j));
                    s1.set(j,x);
                }
            }
        }
        return s1;
    }
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        ArrayList<Integer> s1 = new ArrayList<>();
        System.out.println("Enter the 5 numbers");
        for(int i = 1; i<6; i++){
            s1.add(input.nextInt());
        }
        System.out.println(s1);
        System.out.println(sortList(s1));

    }

}