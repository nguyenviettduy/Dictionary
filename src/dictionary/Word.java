package dictionary;

public class Word extends Dictionary{

    public String spelling;
    public String explain;

    Word(String spelling, String explain){
        this.spelling = spelling;
        this.explain = explain;
    }
    public void setSpelling(String spelling) {
        this.spelling = spelling;
    }
    public String getSpelling() {
        return spelling;
    }
    public void setExplain(String explain) {
        this.explain = explain;
    }
    public String getExplain() {
        return explain;
    }
    public String printWord(){
        return spelling+ "\t" +explain;
    }
}

