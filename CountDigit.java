public class CountDigit{

    public static  int count(int n){
        int cnt = 0;
        while(n>0){

            int ls = n % 10;
            cnt++;
            n = n/10;

        }
        return cnt;

    }
    public static void main(String[] args) {
        int n = 0;
        System.out.println(count(n));

    }
}