import java.util.ArrayList;

public class Duplicate
{

    public static int findDuplicate(ArrayList<Integer> arr) {

		//    Write your code here.
		int ans = 0;

		for(int i=0; i<arr.size();i++){
			ans ^= arr.get(i);
		}
		for(int i=0; i<arr.size(); i++) {
			ans = ans^i;
		}
		return ans;
	}
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(6);
        arr.add(3);
        arr.add(1);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
       System.out.println( findDuplicate(arr));
    }
}