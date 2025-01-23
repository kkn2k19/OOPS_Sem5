
package chapterd_101_4;

public class ChapterD_101_4 {
    public static void main(String[] args) {
        Series obj = new Series();
        
        double sum1 = obj.series(5);
        System.out.println("Sum 1 : " + sum1);
        
        double sum2 = obj.series(2, 5);
        System.out.println("Sum 2 : " + sum2);
    }
}

class Series{
    double sum = 0.0;
    
    double series(double n) {
        for(int i = 1; i<=n; i++){
            sum += 1.0/i;
        }
        return sum;
    }
    
    double series(double a, double n){
        for(int i = 1; i<=n; i=i+3){
            sum += (1.0/Math.pow(a, i+1));
        }
        return sum;
    }
}

/*
OUTPUT -- 

Sum 1 : 2.283333333333333
Sum 2 : 2.564583333333333
*/
