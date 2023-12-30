
public class SwitchTest {
    public static void main(String[] args) {
        int month = 11 ;
        String monthString = "";

        //switch문: case 값과 동일할 경우 해당 내용 수행하고 break;로 switch문 밖으로 빠져나옴.
        //if문 보다는 상대적으로 코드 중복이 적다.
        //case의 조건식의 답은 정수/문자열만 사용가능하고 case문의 값은 변수, 실수는 사용불가함.
        switch (month){
            case 1:
                monthString = "1월";
                break;
            case 2:
                monthString = "2월";
                break;
            case 3:
                monthString = "3월";
                break;
            case 4:
                monthString = "4월";
                break;
            case 5:
                monthString = "5월";
                break;
            case 6:
                monthString = "6월";
                break;
            case 7:
                monthString = "7월";
                break;
            case 8:
                monthString = "8월";
                break;
            case 9:
                monthString = "9월";
                break;
            case 10:
                monthString = "10월";
                break;
            case 11:
                monthString = "11월";
                break;
            case 12:
                monthString = "12월";
                break;
            default: monthString = "";
        }
        if ( monthString != "" ) {
            System.out.println("이번달은 " + monthString + " 입니다.");
        } else {
            System.out.println(" 알 수 없습니다.");
        }

    }
}
