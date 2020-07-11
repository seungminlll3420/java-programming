//https://programmers.co.kr/learn/courses/30/lessons/42588
import java.util.Stack;

class Solution {
        class top {
            int num;
            int h;
            public top(int num, int h) {
                this.num = num;
                this.h = h;
            }
        }
        public int[] solution(int[] heights) {
            int[] answer = new int[heights.length];
            Stack<top> st = new Stack<>();
            for (int i = 0; i < heights.length; i++) {
                top t = new top(i + 1, heights[i]);
                st.push(t);
                while(!st.empty()){
                    top s = st.peek();
                    if(s.h > t.h){
                        answer[t.num-1] = s.num;
                        break;
                    }
                    st.pop();
                }
                st.push(t);
            }
            return answer;
        }
    }
