//https://programmers.co.kr/learn/courses/30/lessons/42583
import java.util.*;

    class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            Queue<Integer> q = new LinkedList<Integer>();
            int answer = 0;
            int num = 0;
            int crwe = 0;
            int []clock = new int[truck_weights.length];
            int ft=0;
            while( ft < truck_weights.length  ){
                if((num < truck_weights.length) &&(crwe +truck_weights[num]  <= weight) ){
                    crwe+=truck_weights[num];
                    clock[num] = 0;
                    q.add(truck_weights[num]);
                    num++;
                }
                for(int i =ft;  i < num ; i++){
                    clock[i]++;
                    if(clock[i] == bridge_length){
                        crwe-=q.poll();
                        ft++;
                    }
                }
                answer++;
            }
            return ++answer;
        }

    }
