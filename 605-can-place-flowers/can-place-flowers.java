class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m=0;
        int f1=-1;
        int l1=-1;

        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                continue;
            }

            else if(f1==-1){
                f1=i;
                l1=i;
            }
            else{
                l1=i;
            }
        }
        //All zeros case
        if(f1==-1){
            m=((flowerbed.length+1)/2);
        }

        //else zeros in front, centre and last
        else{
            int left=f1;
            int right=flowerbed.length-1-l1;

            m=left/2;
            m+=right/2;

            int count=0;
            for(int k=f1+1;k<=l1-1;k++){
                if(flowerbed[k]==0){
                    count++;
                }
                else{
                    m+=(count-1)/2;
                    count=0;
                }
            }

            m+=(count-1)/2;
        }

        return n<=m;


    }
}