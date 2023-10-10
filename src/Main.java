import ra.exception.MyException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");
        float width=1,height=2;
        float area = width * height;

        // lỗi runtime
//        double x = 5/0; // unchecked
//        while(true){
//        try {
//            int number = Integer.parseInt(sc.nextLine()); // checked
//            break;
//        }catch (NumberFormatException e){
//            System.out.println("Lỗi nhập lại");
//        }
//        }
//        System.out.println("tiếp tục");

//        try {
//            System.out.println("Bắt đầu try");
//            inputTriangleSide(sc);
//            return;
//        } catch (RuntimeException e) {
//            System.out.println("Phát sinh ngoại lệ");
//            System.out.println(e.getMessage());
//        }catch (MyException e) {
//            System.out.println(e.getMessage());
//        }finally {
//            // đóng máy nhập
//            sc.close();
//            System.out.println("Vào finally");
//        }
        System.out.println("Nhập 1 số");

        Object[] arr = {1,"2","dgd","0000","hùng"};
        System.out.println(sum(arr));
     }
    public static int minValue(int[] arr){
        int minIndex = 0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min>arr[i]){
                min = arr[i];
                minIndex=i;
            }
        }
        return min;
    }
    // ném ra ngoại lệ : throw - trong 1 khối logic nào đấy
    // né ngoại lệ - throws - định nghĩa trên phương thức
    public static void inputTriangleSide(Scanner sc)throws MyException{
        System.out.println("Nhập cạnh a");
        double a = sc.nextDouble();
        System.out.println("Nhập cạnh b");
        double b = sc.nextDouble();
        System.out.println("Nhập cạnh c");
        double c = sc.nextDouble();
        // điều kiện để nó là 1 tam giác
            if (a <= 0 || b <= 0 || c <= 0) {
                throw new RuntimeException("3 cạnh phải lớn hơn 0");
            }

            if(a+b<=c||b+c<=a||c+a<=b){
                throw new MyException("tổng 2 cạnh phải lớn hơn cạnh còn lại");
            }
    }
    public  static  int sum(Object[] arr){
        int sum = 0;
        for (Object o: arr
             ) {
            try{
                int x  = (Integer)o;
                sum+=x;
            }catch (Exception e){
                System.out.println("lỗi");
            }
        }
        return sum;
    }
}