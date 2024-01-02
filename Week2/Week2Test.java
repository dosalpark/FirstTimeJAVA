import java.util.ArrayList;
import java.util.Scanner;

public class Week2Test {
    public static void main(String[] args) {
        //        자료구조 요리 레시피 메모장 만들기 (1주차 자료 리팩토링)
        //                입력값
        //        저장할 자료구조명을 입력합니다. (List / Set / Map) v
        //        내가 좋아하는 요리 제목을 먼저 입력합니다. v
        //        이어서 내가 좋아하는 요리 레시피를 한문장씩 입력합니다. v
        //                입력을 마쳤으면 마지막에 “끝” 문자를 입력합니다. v
        //        출력값
        //        입력이 종료되면 저장한 자료구조 이름과 요리 제목을 괄호로 감싸서 먼저 출력 해줍니다.
        //        이어서, 입력한 모든 문장앞에 번호를 붙여서 입력 순서에 맞게 모두 출력 해줍니다.

        Scanner scanner = new Scanner(System.in); //화면으로 입력 설정
        ArrayList<String> RecipeString = new ArrayList<String>(); //list 타입 사용
        boolean EndSign = false; //끝 입력시 종료값으로 사용
        int num = 1; //레시피 앞 순번 변수

        System.out.println("사용 할 자료구조를 입력해주세요");
        String col = scanner.nextLine(); //collection 입력
//        System.out.println("요리 제목을 입력해주세요.");
//        String title = scanner.nextLine(); //요리 제목 입력

        switch (col) {
            case "list":
                System.out.println("요리 제목을 입력해주세요.");
                String title = scanner.nextLine(); //요리 제목 입력
                RecipeString.add("[" + col + "로 저장된 " + title + "]");

                System.out.println("레시피를 한 줄 씩 입력해주세요.");
                while (!EndSign) { //RecipeStr 입력 + EndSign이 true로 바뀌면 종료
                    String RecipeStr = scanner.nextLine();  //RecipeStr 입력받음
                    if (RecipeStr.equals("끝")) { //RecipeStr에 끝이 입력될시 EndSign을 true로 변경
                        EndSign = true;
                        break;
                    } else {
                        RecipeString.add(num + ". " + RecipeStr); // RecipeString에 레시피 입력
                        num++; //레시피 앞 순번 증가
                    }
                }
                for (int print = 0; print < RecipeString.size(); print++) { //끝 입력된뒤 입력된 사용한 collection, 제목, 내용 한줄씩 출력
                    System.out.println(RecipeString.get(print));

                }
            default:
                System.out.println("사용 할 수 없는 자료구조 입니다.");
        }
    }
}
//        String Recipe1 = scanner.next();
//        RecipeString.add("2. " + Recipe1);
//        String Recipe2 = scanner.next();
//        RecipeString.add("3. " + Recipe2);
//        String Recipe3 = scanner.next();
//        RecipeString.add("4. " + Recipe3);
//        String Recipe4 = scanner.next();
//        RecipeString.add("5. " + Recipe4);
//        String Recipe5 = scanner.next();
//        RecipeString.add("6. " + Recipe5);
//        String Recipe6 = scanner.next();
//        RecipeString.add("7. " + Recipe6);
//        String Recipe7 = scanner.next();
//        RecipeString.add("8. " + Recipe7);
//        String Recipe8 = scanner.next();
//        RecipeString.add("9. " + Recipe8);
//        String Recipe9 = scanner.next();
//        RecipeString.add("10. " + Recipe9);




//        Scanner scanner = new Scanner(System.in);
//        // 레시피 제목입력
//        String title = scanner.next();
//        // 별점 입력
//        double doubleStar = scanner.nextDouble();
//        // 레시피 10줄 입력
//        String Recipe0 = scanner.next();
//        String Recipe1 = scanner.next();
//        String Recipe2 = scanner.next();
//        String Recipe3 = scanner.next();
//        String Recipe4 = scanner.next();
//        String Recipe5 = scanner.next();
//        String Recipe6 = scanner.next();
//        String Recipe7 = scanner.next();
//        String Recipe8 = scanner.next();
//        String Recipe9 = scanner.next();
//        // 별점 정수, 퍼센트 변환
//        int intStar = (int)doubleStar;
//        int percentStar = intStar * 100  / 5 ;
//
//        // 레시피 출력
//        System.out.println("[" + title + "]");
//        // 별점 출력
//        System.out.println("별점: " + intStar + " (" + percentStar + " %)");
//        // 레시피 출력
//        System.out.println("1. " + Recipe0);
//        System.out.println("2. " + Recipe1);
//        System.out.println("3. " + Recipe2);
//        System.out.println("4. " + Recipe3);
//        System.out.println("5. " + Recipe4);
//        System.out.println("6. " + Recipe5);
//        System.out.println("7. " + Recipe6);
//        System.out.println("8. " + Recipe7);
//        System.out.println("9. " + Recipe8);
//        System.out.println("10. " + Recipe9);



