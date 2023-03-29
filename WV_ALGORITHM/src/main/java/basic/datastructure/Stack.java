package basic.datastructure;

import java.util.Scanner;

public class Stack {

    /*
    Stack은 한 쪽 끝에서만 자료를 넣거나 뺄 수 있는 선형 구조(LIFO - Last In First Out)로 데이터를 저장하는 형식을 말한다.
     */

    int top = 0; // 클래스변수
    int[] stackArray = new int[2]; // 배열
    final int MAX_N = 3;

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

    }

    // 스택 초기화
    public void stackInit() {
        top = 0;
    }

    //
    public boolean stackIsEmpty() {
        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }

    //
    public boolean stackIsFull() {
        if (top == MAX_N) {
            return true;
        } else {
            return false;
        }
    }

    // stack에 값 넣기
    public boolean stackPush(int value) {

        if (stackIsFull()) {
            System.out.println("[Stack] stack overflow");
            return false;
        }

        stackArray[top] = value; // value값을 top번째의 값으로 넣고
        top ++; // stack top 1증가

        return true;
    }

    public boolean stackPop() {

        if (stackIsEmpty()) {
            System.out.println("[Stack] stack is empty");
        }

        top --;

        return true;
    }


}
