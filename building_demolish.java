import java.util.Scanner;

public class building_demolish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float area = sc.nextFloat();
        float time = 0,cost = 0;
        if(area>50000)
            System.out.println(area + "limit exceeded");
        else if (area<100)
            System.out.println(area + "too small");
        else
            time = (area/100)*8;
            cost = (area/100)*2000;
        System.out.println("Required time : "+ time);
        System.out.println("Required cost : "+ cost);
    }
}
