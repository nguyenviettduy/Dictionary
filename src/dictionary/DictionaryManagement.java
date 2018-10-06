package dictionary;

import java.util.Scanner;

public class DictionaryManagement extends Dictionary{
    public void insertFromCommandline(){
        Scanner scan = new Scanner(System.in);
        int amountWord = scan.nextInt();
        String Null = scan.nextLine();

        for(int i = 0; i < amountWord; ++i){
            String s1 = scan.nextLine();
            String s2 = scan.nextLine();
            Word w = new Word(s1,s2);
            Words.add(w);
        }

//        for (Word w : Words){
//            System.out.println(w.printWord());
//        }
    }
}
