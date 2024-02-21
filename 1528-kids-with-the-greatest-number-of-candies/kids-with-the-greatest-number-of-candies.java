class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        LinkedList <Boolean> ll=new LinkedList<>();
        int val=0;
        for(int i=0;i<candies.length;i++){
            val=0;
            val=candies[i]+extraCandies;
            int m=max(candies,extraCandies);
            if(val>=m){
                ll.add(true);
            }
            else{
                ll.add(false);
            }
        }
        return ll;
    }

    public static int max(int [] candies,int extraCandies){
        int m=candies[0];
        for(int i=1;i<candies.length;i++){
            if(m<candies[i]){
                m=candies[i];
            }
        }

        int max=0;
        max=m+extraCandies;
        return m;
    }
}