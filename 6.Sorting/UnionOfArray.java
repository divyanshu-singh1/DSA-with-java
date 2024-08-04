import java.util.Arrays;

public class UnionOfArray {
    /*
     * my approach 
     */
    static void union(int a[]  , int b[]){
        int n1 = a.length;
        int n2 = b.length;

        int i = 0 , j = 0 , last = -1;
        while(i < n1 && j < n2){
            if(a[i] == b[j] ){
                if(a[i] != last){
                    last = a[i];
                    System.out.print(a[i]+" ");
                    i++;j++;
                }else{
                   i++;j++; 
                }
            }
            else if(a[i] < b[j] ){
                if(a[i] != last){
                    last = a[i];
                    System.out.print(a[i++]+" ");
                }else
                    i++;
                    
            }else 
                if(b[j] != last){
                    last = b[j];
                    System.out.print(b[j++] +" ");
                }else   
                    j++;
        }
        while(i< n1){
            System.out.print(a[i++]+" ");
        }
        while(j < n2){
            System.out.print(b[j++] +" ");
        }
    }

    /*
     * gfg's approach same technique and approach 
     * just better implementation with less overhead ans code
     * 
     * //there is issue in last part of code 
     */
    static void union2(int a[] , int b[]){
        int n1 = a.length;
        int n2 = b.length;

        int i = 0 , j = 0;
        while(i < n1 && j < n2){
            if(i > 0 && a[i] == a[i-1]){
                i++;
                continue;
            }
            if(j > 0 && a[j] == a[j-1]){
                j++;
                continue;
            }

            if(a[i] == b[j]){
                System.out.print(a[i]+" ");
                i++;
                j++;
            }else if( a[i] < b[j]){
                System.out.print(a[i]+" ");
                i++;
            }else{
                System.out.print(b[j]+" ");
                j++;
            }
        }
        while(i< n1){
            if(i > 0 && a[i] != a[i-1])
                System.out.print(a[i]+" ");
                i++;
        }
        while(j < n2){
            if(j > 0 && a[j] != a[j-1])
                System.out.print(b[j] +" ");
                j++;
        }
    }

    static public void main(String args[]){
        union2(new int[]{3,5,10,10,10,15,15,20,20,20},new int[]{5,10,10,10,15,30,30,30,30});
        // /System.out.println(Arrays.toString(arr));
    }
}
