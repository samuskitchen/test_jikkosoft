import java.util.ArrayList;
import java.util.List;

public class NumbersPairOdd {

    public static void main (String[] args) throws java.lang.Exception {
        List<Integer> num = new ArrayList(){};

        num.add(12);
        num.add(7);
        num.add(1);

        if(!num.isEmpty()){
            for (int i = 0; i < num.size(); i++) {
                if (num.get(i)%2 != 0){
                    System.out.println("Es impar numero: " +  String.valueOf(num.get(i)));
                }else {
                    System.out.println("Es par numero: " + String.valueOf(num.get(i)));
                }
            }
        }else {
            System.out.println("La lista no puede ser vacia");
        }
    }
}
