package main.java;

import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD{
    ArrayList<Word> List;
    Scanner s;

    WordCRUD(Scanner s) {
        List = new ArrayList<>();
        this.s = s;
    }

    @Override
    public int update(Object obj) {
        return 0;
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

    @Override
    public void selectOne(int id) {

    }

    public void listAll(){
        //1. 모든 단어 보기
       System.out.println("--------------------------------");
       for (int i = 0 ; i < List.size() ; i++){
           System.out.print((i + 1) + " ");
           System.out.println(List.get(i).toString());
       }
       System.out.println("--------------------------------");
    }

    @Override
    public Object add() {
        //4. 단어 추가
        System.out.print("=> 난이도(1,2,3) & 새 단어 입력 : ");
        int level = s.nextInt();
        String word = s.nextLine();

        System.out.print("뜻 입력 : ");
        String meaning = s.nextLine();
        return new Word(0, level, word, meaning);
    }
    public void addWord(){
        Word one = (Word)add();
        List.add(one);
        System.out.println("새 단어가 단어장에 추가되었습니다 !!!");
    }

    public void updateWord(){
        //5. 단어 수정
        System.out.print("=> 수정할 단어 검색 : ");
        String searchWord = s.next();
        ArrayList<Integer> searchList = listAll(searchWord);

        System.out.print("=> 수정할 번호 선택 : ");
        int index = s.nextInt();

        s.nextLine();

        System.out.print("=> 뜻 입력 : ");
        String updateMeaning = s.nextLine();
        Word word = List.get(searchList.get(index - 1));
        word.setMeaning(updateMeaning);

        System.out.println("단어가 수정되었습니다.");
    }

    public ArrayList<Integer> listAll(String searchWord){
        //[5. 단어 수정]의 수정할 단어 검색 시

        ArrayList<Integer> searchList = new ArrayList<>();
        int j = 0;
        System.out.println("--------------------------------");
        for (int i = 0 ; i < List.size() ; i++){
            String word = List.get(i).getWord();
            if (!word.contains(searchWord)) continue;

            System.out.print((j + 1) + " ");
            System.out.println(List.get(i).toString());
            searchList.add(i);
            j++;
        }
        System.out.println("--------------------------------");

        return searchList;
    }

    public void deleteWord(){
        //5. 단어 삭제
        System.out.print("=> 삭제할 단어 검색 : ");
        String searchWord = s.next();
        ArrayList<Integer> searchList = listAll(searchWord);

        System.out.print("=> 삭제할 번호 선택 : ");
        int index = s.nextInt();

        s.nextLine();

        System.out.print("=> 정말로 삭제하시겠습니까? (Y/N) : ");
        String yesOrNo = s.next();
        yesOrNo.toUpperCase();

        if(yesOrNo == "Y"){
            List.remove(searchList.get(index - 1));
            System.out.println("단어가 삭제되었습니다.");
        } else {
            System.out.println("삭제를 취소하였습니다.");
        }
    }
}
