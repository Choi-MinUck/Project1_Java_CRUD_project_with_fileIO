package main.java;

public class Word {
    /*
     * 1. 멤버변수 - 접근한정자
     * 2. getter & setter
     * 3. 생성자
     * 4. method
     * */
    private int id;
    private int level;
    private String word;
    private String meaning;

    public Word() {
    }

    public Word(int id, int level, String word, String meaning) {
        this.id = id;
        this.level = level;
        this.word = word;
        this.meaning = meaning;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString(){
        String slevel = "";

        for (int i = 0 ; i < level ; i++){
            slevel = slevel + "*";
        }
        String str = String.format("%-3s", slevel
                + String.format("%15s", word)
                + "  "
                + meaning);

        return  str;
    }
}
