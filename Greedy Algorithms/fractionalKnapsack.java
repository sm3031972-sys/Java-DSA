import java.util.*;
class fractionalKnapsack{
    public static void main(String args[]){
        int val[]={60,100,120};
        int weight[]={10,30,30};
        int w=50;

        double ratio[][]=new double[val.length][2];
        // 0th column=idx & 1st column=ratio
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }
        // sorting in ascending order usign lambda function
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));



        int capacity=w;
        float finalValue=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];

            if(capacity>=weight[idx]){
                // it imcludes full value of it
                finalValue+=val[idx];
                capacity-=weight[idx];
            }
            else{
                // fractional value 
                finalValue+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println("Final value is = "+finalValue);
    }
}