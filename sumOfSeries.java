 import java.util.*;
 class sumOfSeries{
  static void seriesSum(int num, double sum){
    if(num == 0){
        System.out.println(sum);
        return;
    }
     seriesSum(num - 1, (num / Math.pow(num, num)) + sum);
}


static double seriesSum(int num){
    if(num == 0){
        return 0;
    }
    return (num/Math.pow(num,num))+seriesSum(num-1);
}
public static void main(String[] args){
    seriesSum(3,0);
    System.out.println(seriesSum(3));
}
} {
    
}
