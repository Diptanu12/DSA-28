public class pattern3 {
    public static void main(String[] args) {
        Pattern3(6) ;
    }
    static void  Pattern3(int n){
        for(int row=0;row<=n;row++){
            for(int col=1;col<=n-row ;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
