package FindMinMax;

public class PairOb implements Pair{
    public int min;
    public int max;
    public PairOb(int a, int b){
        this.min = a;
        this.max = b;
    }

    public int getMin(){
        return min;
    }

    public int getMax(){
        return max;
    }
}
