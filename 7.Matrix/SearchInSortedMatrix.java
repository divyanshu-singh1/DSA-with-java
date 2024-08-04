public class SearchInSortedMatrix {
    static boolean search(int mat[][], int x){
        int n = mat.length , m = mat[0].length;
        int i = 0, j = m-1;
        while(i < n && j >= 0){
            if(mat[i][j] == x)
                return true;
            else if(mat[i][j] > x)
                j--;
            else
                i++;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        System.out.println(search(arr,19));
    }
}
