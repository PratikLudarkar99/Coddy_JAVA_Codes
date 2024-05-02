class FindIndex {
    public static int findIndex(String s, char c) {
        // Write code here
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                return i;
            }
        }
        return -1;
    }
}
