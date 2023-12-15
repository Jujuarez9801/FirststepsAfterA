
// void invoking
// Also void seems to contain the bulk of the code (at least in this case)

public class MethodPearsonBookPt2VoidMethods {
    public static void main(String[] args) {
        System.out.print("The grade is "); // can't '+ getGrade(81.0))' here as void
        getGrade(81.0);

        System.out.print("The grade is ");
        getGrade(93.0);
    }

    public static void getGrade(double score) {
        if(score >= 90.0) {
            System.out.println("A"); // println doesn't seem to make a new line or do anything when invoked
        } else if(score >= 80.0) {   // ..as far as I can see at least
            System.out.println("B");
        } else if(score >= 70.0) {
            System.out.println("C");
        } else if(score >= 60.0) {
            System.out.println("D");
        } else {
            System.out.println("F"); // if char instead of void: return 'F';
        }
    }
}
