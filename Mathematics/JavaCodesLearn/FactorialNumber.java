package Mathematics.JavaCodesLearn;

public class FactorialNumber {
    public int chekFatorial(int number){
        
        if(number==0)
            return 1;

        return number * chekFatorial(number-1);    
    }

    public int countFatorial(int number){
        int res = 1, i;
		for (i = 2; i <= number; i++)
			res *= i;
		return res;
    }

    public static void main(String[] args) {
        FactorialNumber factorial = new FactorialNumber();
        System.out.println(factorial.chekFatorial(6));
        System.out.println(factorial.countFatorial(30));
    }
}
