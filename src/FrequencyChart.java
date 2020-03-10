/*import java.util.Scanner;

public class FrequencyChart {
    private int[] list;




    public FrequencyChart(int[] list){
        this.list = list;

    }


    public String makeChart(){

        int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10 = 0;
        n1 = 0;
        n2 = 0;
        n3 = 0;
        n4 = 0;
        n5 = 0;
        n6 = 0;
        n7 = 0;
        n8 = 0;
        n9 = 0;
        for (int n: list){
            if(n > 0 && n < 100)
                if(n >= 1 && n <= 10){
                    n1++;
                }
                if(n >= 11 && n <= 20){
                    n2++;
                }
                if(n >= 21 && n <= 30){
                    n3++;
                }
                if(n >= 31 && n <= 40){
                    n4++;
                }
                if(n >= 41 && n <= 50){
                    n5++;
                }
                if(n >= 51 && n <= 60){
                    n6++;
                }
                if(n >= 61 && n <= 70){
                    n7++;
                }
                if(n >= 71 && n <= 80){
                    n8++;
                }
                if(n >= 81 && n <= 90){
                    n9++;
                }
                if(n >= 91 && n <= 99){
                    n10++;
                }

        }








    }









    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("How many values in your data set?");
        int size = scan.nextInt();

        int[] data = new int[size];



        System.out.println("Enter data values one at a time, followed by enter");
        int val = 0;
        for (int i = 0; i < data.length; i++){
            val = scan.nextInt();
            data[i] = val;

        }

        FrequencyChart chart = new FrequencyChart(data);

        System.out.println(chart.makeChart());


    }
}
*/