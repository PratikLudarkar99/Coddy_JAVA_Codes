class IsInterleaving {
    public static boolean isInterleaving(String s1, String s2, String s3) {
        // Write code here
        return isInterleavingHelper(s1,s2,s3,0,0,0);
    }
    static boolean isInterleavingHelper(String s1,String s2,String s3,int i,int j, int k){
        if(i==s1.length()&& j==s2.length() && k==s3.length()){
            return true;
        }
        boolean result=false;

        if(i<s1.length() && j<s2.length()&& s1.charAt(i)==s2.charAt(j)){
            result= isInterleavingHelper(s1,s2,s3,i+1,j+1,k);
        }

        if(!result && i<s1.length() && k<s3.length() && s1.charAt(i)==s3.charAt(k)){
            result=isInterleavingHelper(s1,s2,s3,i+1,j,k+1);
        }
        return result;
    }
}
