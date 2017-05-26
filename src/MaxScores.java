import java.util.Scanner;

/**
 * Created by hyh on 2017/5/26.
 */
public class MaxScores {
    public static int Query(int[] scores,int begin,int end){
        int temp = 0;
        if(begin>end){
            temp = begin;
            begin =end;
            end =temp;
        }
        int max = scores[begin-1];
        for(int i=begin-1;i<end;i++){
            if(scores[i]> max)
                max = scores[i];
        }
        return max;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String[] number = sc.nextLine().split(" ");
            int n = Integer.parseInt(number[0]);
            int m = Integer.parseInt(number[1]);
            int[] scores = new int[n];
            String[] score = sc.nextLine().split(" ");
            for(int i=0;i<n;i++){
                scores[i] = Integer.parseInt(score[i]);
            }
            int begin =0;
            int end = 0;
            int index =0;
            int updateScore = 0;
            for(int j=0;j<m;j++){
                String[] operation = sc.nextLine().split(" ");
                if(operation[0].equals("Q")){
                    begin = Integer.parseInt(operation[1]);
                    end = Integer.parseInt(operation[2]);
                    System.out.println(Query(scores,begin,end));
                }
                if(operation[0].equals("U")){
                    index = Integer.parseInt(operation[1]);
                    updateScore = Integer.parseInt(operation[2]);
                    scores[index-1] = updateScore;
                }

            }
        }

    }

}
