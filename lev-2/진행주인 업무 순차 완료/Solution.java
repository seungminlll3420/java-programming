//https://programmers.co.kr/learn/courses/30/lessons/42586#
import java.util.*;
    class Solution {
        public class pro{
            int prog;
            int speeds;
            public pro(int prog, int speeds){
                this.prog = prog;
                this.speeds = speeds;
            }
        }

        public int[] solution(int[] progresses, int[] speeds) {
            int[] answer = new int[1000];

            Queue<pro> q = new LinkedList<>();

            for(int i=0; i<speeds.length;i++){
                pro t = new pro(progresses[i],speeds[i]);
                q.add(t);
            }

            int t=1;
            int s=0;
            while(!q.isEmpty()){
                pro p = q.peek();
                int x=0;
                int qs = q.size();
                for(int k =0; k< qs ;k++ ){
                    System.out.print(q.size());
                    p = q.peek();
                    if(100 <= (p.prog + (p.speeds*t) )){
                        q.poll();
                        x++;
                    }
                }

                if (x != 0) {
                       answer[s] = x;
                       s++;

                }
                t++;
            }
            int[] answers = new int[s];
            for(int i=0; i < s ; i++){
                answers[i] = answer[i];
            }

            return answers;
        }
    }
