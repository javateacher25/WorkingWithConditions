void main() {

    short day = Short.parseShort(IO.readln("Enter number of days: "));

    System.out.println(returnSwitch(day));

    System.out.println(calculator(2,3,'+'));


}

int calculator(int a, int b, char operation) {
    return switch (operation) {
        case '+' -> sum(a, b);
        case '-' -> a - b;
        case '*' -> a * b;
        case '/' -> a / b;
        default -> 0;
    };

}
int sum(int a, int b){
    return a + b;
}

String returnSwitch(short day) {
    return switch (day) {
        case 1 -> "شنبه";
        case 2 -> "یکشنبه";
        case 3 -> "دوشنبه";
        case 4 -> "سه شنبه";
        case 5 -> "چهارشنبه";
        case 6 -> "پنج شنبه";
        case 7 -> "جمعه";
        default -> "wrong choice";
    };
}

void switchCaseNew(short day) {
    switch (day) {
        case 1 -> System.out.println("شنبه");
        case 2 -> System.out.println("یکشنبه");
        case 3 -> System.out.println("دوشنبه");
        case 4 -> System.out.println("سه شنبه");
        case 5 -> System.out.println("چهارشنبه");
        case 6 -> System.out.println("پنج شنبه");
        case 7 -> System.out.println("جمعه");
        default -> System.out.println("wrong choice");
    }

}

void switchCase(short day) {
    switch (day) {
        case 1:
            System.out.println("شنبه");
            break;
        case 2:
            System.out.println("یکشنبه");
            break;
        case 3:
            System.out.println("دوشنبه");
            break;
        case 4:
            System.out.println("سه شنبه");
            break;
        case 5:
            System.out.println("چهارشنبه");
            break;
        case 6:
            System.out.println("پنج شنبه");
            break;
        case 7:
            System.out.println("جمعه");
            break;
        default:
            System.out.println("Wrong choice");
    }
}