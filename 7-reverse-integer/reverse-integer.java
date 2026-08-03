class Solution {
    public int reverse(int x) {
        int y=x;
        if (x<0){
            x=-x;  // -321=-(-321) =321
        }
        
        long rev=0;
        int m=0;
        while(x!=0){
            m= x%10;
            rev= (rev*10)+m;
            x/=10;
        }
            if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE){  // b/w the given integer range 
            return 0;}
            else if(y>0){
                return (int)rev;
                }
            else {
                return (int)-rev;}
        
        }
    }
