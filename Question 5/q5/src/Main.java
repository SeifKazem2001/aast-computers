import java.io.FileNotFoundException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try { int count = 0;
            java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/ Lincoln.txt.");

            Scanner input = new Scanner(url.openStream());

            while(input.hasNext()){
                String currentLine = input.nextLine();
                String[] words = currentLine.split((" "));
                count+= words.length;
            }
            input.close();
            System.out.println(count);

        }catch (java.net.MalformedURLException e){
            System.out.println("error  please enter again ");
        }
        catch (java.io.IOException e){
            System.out.println("invalid");
        }

    }
}