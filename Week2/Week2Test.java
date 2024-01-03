import java.util.*;

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

        boolean EndSign = false; //끝 입력시 종료값으로 사용
        int num = 1; //레시피 앞 순번 변수
        String title; //요리 제목

        System.out.println("사용 할 자료구조를 입력해주세요");
        String col = scanner.nextLine(); //collection 입력
//        System.out.println("요리 제목을 입력해주세요.");
//        String title = scanner.nextLine(); //요리 제목 입력

        switch (col) {
            case "list":
                //ListStr: 입력해서 마지막에 출력할 List 자료구조
                //RecipeList: 사용자에게 입력받을 String 변수
                ArrayList<String> ListStr = new ArrayList<String>();
                System.out.println("요리 제목을 입력해주세요.");
                title = scanner.nextLine();
                ListStr.add("[ List로 저장된 " + title + " ]");
                System.out.println("레시피를 한 줄 씩 입력해주세요.");

                while (!EndSign) { //EndSign이 true가 될때까지 반복 진행
                    String RecipeList = scanner.nextLine(); //이용자 한테 레시피 입력받음.
                    if (RecipeList.equals("끝")) { //끝이 입력되면 EndSign을 true로 변경
                        EndSign = true;
                        break;
                    } else { //끝이 입력되기 전까지 num(순번) 과 이용자에게 입력받은 레시피를 ListStr에 저장
                        ListStr.add(num + ". " + RecipeList);
                        num++;
                    }
                }
                for (int print = 0; print < ListStr.size(); print++) { //끝 입력된뒤 입력된 사용한 collection, 제목, 내용 한줄씩 출력
                    System.out.println(ListStr.get(print));
                }
                break;
            case "set":
                //SetStr: 입력해서 마지막에 출력할 Set 자료구조
                //RecipeSet: 사용자에게 입력받을 String 변수
//                Set<String> SetStr = new HashSet<String>(); //LinkedHashSet은 순서를 보장하고 HashSet은 순서를 보장하지 않음...
                LinkedHashSet<String> SetStr = new LinkedHashSet<String>();
//1.                Iterator<String> Iterator = SetStr.iterator();
                System.out.println("요리 제목을 입력해주세요.");
                title = scanner.nextLine();
                SetStr.add("[ Set으로 저장된 " + title + " ]");
                System.out.println("레시피를 한 줄 씩 입력해주세요.");

                while (!EndSign) { //EndSign이 true가 될때까지 반복 진행
                    String RecipeSet = scanner.nextLine(); //이용자 한테 레시피 입력받음.
                    if (RecipeSet.equals("끝")) { //끝이 입력되면 EndSign을 true로 변경
                        EndSign = true;
                        break;
                    } else {
                        SetStr.add(num + ". " + RecipeSet); //끝이 입력되기 전까지 num(순번) 과 이용자에게 입력받은 레시피를 SetStr에 저장
                        num++;
                    }
                }
               Iterator<String> Iterator = SetStr.iterator(); //SetStr에 입력된 자료들을 Interator에 값을 저장
                for (int print = 0; print < SetStr.size(); print++) {
                    System.out.println(Iterator.next()); //next를 사용해 순차적으로 출력(LinkedHashMap이라 순차적으로 자료 입력되었음)
                }
                break;
            case "map":
                //MapStr: 입력해서 마지막에 출력할 Set 자료구조
                //RecipeMap: 사용자에게 입력받을 String 변수
                Map<Integer, String> MapStr = new HashMap<Integer, String>();
                System.out.println("요리 제목을 입력해주세요.");
                title = scanner.nextLine(); //요리 제목 입력
                MapStr.put(0, "[ Map으로 저장된 " + title + " ]"); //제목은 Integer를 0으로 입력, 이후 레시피부터는 num을 이용하여 ++로 증가시켜서 입력

                System.out.println("레시피를 한 줄 씩 입력해주세요.");

                while (!EndSign) { ////EndSign이 true가 될때까지 반복 진행
                    String RecipeMap = scanner.nextLine(); //이용자 한테 레시피 입력받음.
                    if (RecipeMap.equals("끝")) { //끝이 입력되면 EndSign을 true로 변경
                        EndSign = true;
                        break;
                    } else {
                        MapStr.put(num, num + ". " + RecipeMap); //끝이 입력되기 전까지 num(순번) 과 이용자에게 입력받은 레시피를 MapStr 저장
                        num++;
                    }
                }
                for (int print = 0; print < MapStr.size(); print++) {
                    System.out.println(MapStr.get(print)); //get(print) 를 이용해서 입력된 제목 및 레시피 출력
                                                           //순서대로 뽑으려면 Map 설정시 Key를 Integer로 주고 저장할때 key 값을 순서대로 줌
                                                            // 이후 Map.get(key++)값이 들어가면 순서대로 출력됨
                }
                break;

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



