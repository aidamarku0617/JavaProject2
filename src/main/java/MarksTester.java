public class MarksTester {
    public static void main(String[] args) {
        A studentA=new A(80,90,75);
        B studentB=new B(85,70,95,80);
        double percentageA=studentA.getPercentage();
        double percentageB= studentB.getPercentage();
        System.out.println("Students A average percentage: "+percentageA);
        System.out.println("Students B average percentage: "+percentageB);


    }
}
