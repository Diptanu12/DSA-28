public class pattern5 {
    public static void main(String[] args) {
        pattern5(6);
    }
    static void pattern5(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
