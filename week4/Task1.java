class Task1 {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int count1=0,count2=0;
        for (int i=0;i<n/2;i++){
            if(isVowel(s.charAt(i))){
                count1++;
            }
            if(isVowel(s.charAt(i+n/2))){
                count2++;
            }
        }
        return count1==count2;
    }
    private boolean isVowel(char c){
        c=Character.toLowerCase(c);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}