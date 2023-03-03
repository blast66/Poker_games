import java.util.Scanner;

public class poker_fa_pie_game {
    public static void main(String[] args) {
        int sum1, sum2, sum3, B,C;
        fa_pie fa_pie1 = new fa_pie();
        Scanner fapie = new Scanner(System.in);
        System.out.println("請輸入撲克牌功能：");
        System.out.println("1:隨機發牌");
        System.out.println("2:顯示牌組內的撲克牌");
        sum1 = fapie.nextInt();

        if (sum1 == 1) { //輸入的功能按鈕 = 1 時執行下面程式碼
            System.out.println("請輸入發牌的牌數 :");
            sum2 = fapie.nextInt();
            if(sum2 <= 52 & sum2 != 0){
                if (sum2 > 0) {
                    fa_pie1.pie_su(sum2);
                }
            }
            else if(sum2 > 52){
                System.out.println("你確定你會玩撲克牌 ? (只有52張..啦)");
            }
        }

        if (sum1 == 2) { //輸入的功能按鈕 = 2 時執行下面程式碼
            fa_pie1.fa_pie();
        }
    }


    static class fa_pie { //排組功能 物件的區域(副程式)
        static String[] arr1 = {"黑桃", "紅心", "方塊", "梅花"};
        static String[] arr2 = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        public void fa_pie() { //功能1 顯示排組內的牌 (想不到叫什麼直接羅馬拼音...)
            int c = 0;
            for (int i = 0; i < arr1.length; i++) {
                System.out.println("\n");
                for (int j = 0; j < arr2.length; j++) {
                    c = c+1;
                    System.out.print((c) +":"+(arr1[i]) + "-" + (arr2[j]));
                    System.out.print(" ");
                }
            }
        }

        public void pie_su(int n) { //功能2 使用亂數產生器來發牌 (想不到叫什麼直接羅馬拼音...)
            int c = 0;
            for (int k = 1; k <= n; k++) {
                int i = (int) (Math.random() * 4);
                int j = (int) (Math.random() * 13);
                c = c+1;
                System.out.println((c) +":"+(arr1[i]) + "-" + (arr2[j]));
            }
        }
    }
}