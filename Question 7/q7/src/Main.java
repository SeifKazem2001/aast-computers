import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.IOException {


        ArrayList<Integer> s1 = new ArrayList<>();
        java.io.File file = new java.io.File("Heba.txt");

        if(file.exists()){
            System.out.println("the file exits");
            System.exit(0);
        }
        java.io.PrintWriter write = new java.io.PrintWriter(file);

        for(int i = 1; i <= 100; i++){

            int randomNum = (int)(Math.random() * 101);
            write.print(randomNum);
            write.print(" ");
        }
        write.close();

        Scanner input = new Scanner(file);

        while(input.hasNext()){
            s1.add(input.nextInt());
        }
        System.out.println(s1);
        System.out.println(sortList(s1));
    }
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
        return a1;
    }
}