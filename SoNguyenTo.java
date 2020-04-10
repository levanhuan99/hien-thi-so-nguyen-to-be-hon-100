
public class SoNguyenTo {

    public static void main(String[] args) {

        for (int i=2;i<100;i++){
            if (check(i))
                System.out.println(i);
        }
    }

    public static boolean check(int number){
        boolean flag=true;
        if (number<2) flag=false;

        for (int i=2; i<=Math.sqrt(number); i++){
            if (number%i ==0 && number>2){
                flag=false;
            }
        }
        return flag;
    }

}
