package CH4;

public class PrintCodeword {

    public static void main(String[] args) {
        PrintCodeword pc = new PrintCodeword('A', 9);

        pc.print_Code();
    }

    private int startChar;
    private int startDigit;

    //precondition: 생성자로 시작문자 및 시작 숫자를 입력받으면서 객체생성
    public PrintCodeword(int startChar, int startDigit){
        this.startChar = startChar;
        this.startDigit = startDigit;
    }
    //postcondition: 시작문자(int)와 시작숫자 정보를 토대로 객체 생성됨.

    //Precondition
    //시작문자 및 시작숫자 주어짐
    //이것을 가지고 일정한 형태로 출력을 해야함
    //출력형태는 만약 시작문자 'D'와 시작숫자 '5'가 들어왔다면 D5, E6, F7... I0 과 같이 출력해주어야함
    //문자의 경우 Z 만날시 다시 A로 바꾸어 출력해주어야함 총 출력횟수는 알파벳갯수인 26개가 되어야함.
    //숫자의 경우 9다음 0이 되도록 해주어야함.
    public void print_Code(){
        for(int i = 0; i < 26; i++)
        {
            if((char)startChar == 'Z' || startDigit == 9) {
                if((char)startChar == 'Z' && startDigit == 9){
                    System.out.println(String.valueOf((char)startChar) + startDigit);
                    startChar = 'A';
                    startDigit = 0;
                }
                else if ((char)startChar == 'Z') {
                    System.out.println(String.valueOf((char)startChar) + startDigit);
                    startChar = 'A';
                    startDigit++;
                }
                else if (startDigit == 9) {
                    System.out.println(String.valueOf((char)startChar) + startDigit);
                    startChar++;
                    startDigit = 0;
                }
                continue;
            }
            System.out.println(String.valueOf((char)(startChar))+(startDigit));
            startChar++;
            startDigit++;
        }
        /**
        String aString = String.valueOf((char)startChar);
        System.out.println("startChar = " + aString);
        System.out.println("nextChar = " + (startChar+1));
         **/
    }
}
