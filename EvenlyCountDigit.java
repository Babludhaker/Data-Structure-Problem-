public class EvenlyCountDigit {
    public static  int count(int n){
        int count = 0;
        int n1 = n;

        while(n1>0){

            int rem = n1%10;

            if(rem != 0 && n%rem==0){
                count++;
            }
            n1 = n1 / 10;

        }
        return count;

    }
    public static void main(String[] args) {
        int n = 35;
        System.out.println(count(n));
    }
}
