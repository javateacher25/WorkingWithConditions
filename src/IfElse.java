void main() {
    int score = Integer.parseInt(IO.readln("Please enter your score:"));

    if (score >= 60) {
        System.out.println("passed!!");
    } else {
        System.out.println("Failed!!");
    }

    System.out.println("************************************************");

    System.out.println(
           "you are : " + ((score >= 60) ? "passed?" : "failed")
    );

    System.out.println("************************************************");

    if(score >= 90){
        System.out.println("EXCELLENT");
    } else if (score>=60){
        System.out.println("PASSED");
    }else {
        System.out.println("FAILED");
    }
}