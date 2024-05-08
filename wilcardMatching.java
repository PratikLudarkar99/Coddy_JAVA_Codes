class Test {
    static boolean testHelper(String s, String p){
        if(s.isEmpty()&& p.isEmpty()){
            return true;
        }
        if(s.isEmpty()||p.isEmpty()){
            return false;
        }
        char nextP=p.charAt(0);
        char nextS=p.charAt(0);

        if(nextP=='.'){
            return testHelper(s.substring(1),p.substring(1));
        }else if(nextP=='*'){
            return testHelper(s.substring(1),p.substring(1)) || testHelper(s.substring(1),p);
        }else if(nextP=='?'){
            return testHelper(s.substring(1),p.substring(1)) || testHelper(s.substring(1),p) 
                    || testHelper(s,p.substring(1));
        }else if(nextP==nextS){
            return testHelper(s.substring(1),p.substring(1));
        }else{
            return false;
            }
    }

     static boolean test(String s, String p) {
        return testHelper(s,p);
    }
}
