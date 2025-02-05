import java.util.Scanner;

class Person {
    private String name;
    private int age;
    private String phone;

    public void setPerson(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public void showPerson() {
        System.out.println("Name: " + name + ", Age: " + age + ", Phone: " + phone);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setPerson("Panther", 25, "1234567890");
        p.showPerson();
    }
}
//class Rectangle {
//    private int leftLength, topLength, rightLength, bottomLength;
//
//    public void setRectangle(int left, int top, int right, int bottom) {
//        this.leftLength = left;
//        this.topLength = top;
//        this.rightLength = right;
//        this.bottomLength = bottom;
//    }
//
//    public int getWidth() {
//        return Math.abs(rightLength - leftLength);
//    }
//    public int getHeight() {
//        return Math.abs(bottomLength - topLength);
//    }
//    public int getArea() {
//        return getWidth() * getHeight();
//    }
//
//    public int getPerimeter() {
//        return 2 * (getWidth() + getHeight());
//    }
//    public static void main(String[] args) {
//        Rectangle r = new Rectangle();
//        r.setRectangle(0, 0, 5, 10);
//        System.out.println("Width: " + r.getWidth() + ", Height: " + r.getHeight());
//        System.out.println("Area: " + r.getArea() + ", Perimeter: " + r.getPerimeter());
//    }
//}




//class PrimeNumber{
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter a number to check if it is prime: ");
//            int number = scanner.nextInt();
//
//            if (isPrime(number)) {
//                System.out.println("Prime No");
//            } else {
//                System.out.println("Not a prime");
//            }
//        }
//
//        public static boolean isPrime(int num) {
//            if (num <= 1) {
//                return false;
//            }
//            for (int i = 2; i <= num/2; i++) {  // Use sqrt(num) for efficiency
//                if (num % i == 0) {
//                    return false; // If divisible, return false immediately
//                }
//            }
//            return true;
//        }
//}

//class EvenOddChecker {
//    public static void isEvenOrOdd(int num) {
//       if(num % 2 == 0){
//           System.out.println("Even");
//       }else {
//           System.out.println("Odd");
//       }
//    }
//    public static void main(String[] args) {
//        int num = 5;
//        isEvenOrOdd(num);
//    }
//}

//class AgeGroupChecker {
//    public static void checkAgeGroup(int age) {
//        if (age >= 0 && age <= 12) System.out.println("Child");
//        else if (age >= 13 && age <= 19) System.out.println("Teenager");
//        else if (age >= 20 && age <= 64) System.out.println("Adult");
//        else System.out.println("Senior");
//    }
//    public static void main(String[] args) {
//        int age = 20;
//        checkAgeGroup(age);
//    }
//}

//class GradeAssigner {
//    public static void assignGrade(int score) {
//        if (score >= 90) System.out.println("Grade: A");
//        else if (score >= 80) System.out.println("Grade: B");
//        else if (score >= 70) System.out.println("Grade: C");
//        else if (score >= 60) System.out.println("Grade: D");
//        else System.out.println("Grade: F");
//    }
//
//    public static void main(String[] args) {
//        int socre = 95;
//        assignGrade(socre);
//    }
//}

//class NumberChecker {
//    public static void checkNumber(int num) {
//        if (num > 0) System.out.println("Positive");
//        else if (num < 0) System.out.println("Negative");
//        else System.out.println("Zero");
//    }
//
//    public static void main(String[] args) {
//        int num = 5;
//        checkNumber(num);
//    }
//}

//class VotingChecker {
//    public static void checkVotingEligibility(int age) {
//        if(age >= 18 ){
//            System.out.println("Eligible to vote");
//        }else {
//            System.out.println("Can't Eligible to vote");
//        }
//    }
//    public static void main(String[] args) {
//        int age = 52;
//        checkVotingEligibility(age);
//    }
//}

//class AdmissionChecker {
//    public static void checkAdmissionEligibility(int sub1, int sub2, int sub3, int age) {
//        double percentage = (sub1 + sub2 + sub3) / 3.0;
//        if (age >= 18 && percentage >= 75)
//            System.out.println("Eligible for admission");
//        else
//            System.out.println("Not eligible for admission");
//    }
//    public static void main(String[] args) {
//        AdmissionChecker.checkAdmissionEligibility(80, 90, 85, 18);
//    }
//}

//class VowelOrConsonant  {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a character: ");
//        char ch = scanner.next().charAt(0);
//        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
//                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//            System.out.println(ch + " is a Vowel.");
//        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
//            System.out.println(ch + " is a Consonant.");
//        }
//    }
//}

