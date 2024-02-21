class Solution {
    public void reverseString(char[] s) {
        Stack <Character> ss=new Stack<>();
        for(int i=0;i<s.length;i++){
            ss.add(s[i]);
        }

        StringBuilder str=new StringBuilder("");
        while(!ss.isEmpty()){
            char a=ss.pop();
            str.append(a);
        }

        String ans=str.toString();
        for(int i=0;i<s.length;i++){
            s[i]=ans.charAt(i);
            System.out.print(s[i]);
        }
    }
}