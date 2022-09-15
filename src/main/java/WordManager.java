package main.java;

import java.util.Scanner;

public class WordManager {
    Scanner s = new Scanner(System.in);
    WordCRUD wordCRUD;

    WordManager(){
        wordCRUD = new WordCRUD(s);
    }
    public int selectMenu(){
        System.out.println("\n********************");
        System.out.println("1. 모든 단어 보기");
        System.out.println("2. 수준별 단어 보기");
        System.out.println("3. 단어 검색");
        System.out.println("4. 단어 추가");
        System.out.println("5. 단어 수정");
        System.out.println("6. 단어 삭제");
        System.out.println("7. 파일 저장");
        System.out.println("0. 나가기");
        System.out.println("********************");
        System.out.println("=> 원하는 메뉴는? ");

        return s.nextInt();
    }

    public void start (){

        wordCRUD.loadFile();

        while (true) {
            int menu = selectMenu();
            if (menu == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            if (menu == 1){
                //1. 모든 단어 보기
                wordCRUD.listAll();
            }
            else if (menu == 2){
                //2. 수준별 단어 보기
                wordCRUD.listByLevel();
            }
            else if (menu == 3){
                //3. 단어 검색
                wordCRUD.searchWord();
            }
            else if (menu == 4){
                //4. 단어 추가
                wordCRUD.addWord();
            }
            else if (menu == 5){
                //5. 단어 수정
                wordCRUD.updateWord();
            }
            else if (menu == 6){
                //6. 단어 삭제
                wordCRUD.deleteWord();
            }
            else if (menu == 7){
                //7. 파일 저장
                wordCRUD.saveFile();
            }
        }
    }
}
