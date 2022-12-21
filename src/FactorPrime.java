
//神機錯亂題
//質因數分解結果
public class FactorPrime {
    public static String factorPrime(int n){
        String result = n + " = ";
        int factor = 2;
        while (n >= factor){
            if((n % factor) == 0){
                result += factor + "x"; //result = result + factor;
                n /= factor;     //n = n / factor;
            }else {
                factor++;
            }
        }
        return result.substring(0,result.length()-1); //只取中間字串結果
    }

    public static void main(String[] args) {
        System.out.println(factorPrime(125));
        System.out.println(factorPrime(45512));
        System.out.println(factorPrime(5487));
        System.out.println(factorPrime(152273));
        System.out.println(factorPrime(64));
    }
}
