package dictionary;

public class DictionaryCommandline extends DictionaryManagement{
    public void showAllWords(){
        for (Word w : Words){
            System.out.println(w.printWord());
        }
    }
}
