package main.java;

public class Word {
    /*
     * 1. 멤버변수 - 접근한정자
     * 2. getter & setter
     * 3. 생성자
     * 4. method
     * */

    private String word;
    private String meaning;

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

    public Word() {
    }

    public Word(String word) {
        this.word = word;
    }

    public Word(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }
}
