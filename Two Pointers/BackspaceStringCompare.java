class Solution{
    public boolean comapre(String s, String t){
        int i= s.length()-1;
        int j= t.length()-1;

        while (i>=0 || j>=0){
            i= nextchar(s, i);
            j= nextchar(t, j);

            if (i==-1 && j==-1){
                return true;
            }else if (i==-1 || j==-1) {
                return false;                
            }else if(s.charAt(i) != t.charAt(j)){
                return false;
            }
            i--;
            j--;
        }
        return true;
    }

    private int nextchar(String str, int  idx){
        int skip=0;
        while (idx >=0) {
            if (str.charAt(idx)== '#'){
                skip++;
                idx--;
            }else if (skip>0) {
                skip--;
                idx--;               
            }
            else{
                return idx;
            }
        }
        return -1;
    }
}


public class BackspaceStringCompare {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s= "ab#c";
        String t= "ad#c";
        System.out.println(sol.comapre(s, t));
        
    }
}
