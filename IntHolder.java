import java.util.Objects;

public class IntHolder{
    private int value;

    public IntHolder(int value){
        this.value = value;
    }
    public static IntHolder newIntHolder(int value) {
        return new IntHolder(value);
    }
    public int get_value(){
        return this.value;
    }
    public int sum(IntHolder a){
        return a.value + this.value;
    }
    public  int diff(IntHolder a){
        return this.value - a.value;
    }
    public int multiplication(IntHolder a){
        return this.value * a.value;
    }
    public int division(IntHolder a){
        return this.value / a.value;
    }
    public int remainder(IntHolder a){
        return this.value % a.value;
    }
    public static void swap(IntHolder a, IntHolder b){
        int c = a.value;
        a.value = b.value;
        b.value = c;
    }
    public boolean equals(IntHolder o) {
        if (this.value == o.value){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        return Objects.hash(value);
    }


}
