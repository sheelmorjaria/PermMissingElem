


public class PermMissingElem {
    public static void main(String[] args) {
        PermMissingElem p = new PermMissingElem();
        int[] A = {2, 3, 1, 5};
        System.out.println(p.solution(A));
    }
    public int solution(int[] A) {
        int N = A.length + 1;
        //total sum of elements of the array:
        int sum = (N * (N + 1)) / 2;
        for (int i : A) {
            //subtract iteratively
            sum -= i;
        }
        // missing element
        return sum;
    }
}
