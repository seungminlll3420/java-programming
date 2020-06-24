// 문제 : https://programmers.co.kr/learn/courses/30/lessons/64062
// 효율성 0점 코드...
class Solution {
    public int solution(int[] stones, int k) {
        int answer = 0;
        int stones_num = stones.length;

        while(true){
            for(int i=0; i<stones_num;i++){

                if(k < (stones_num) - i) { //k만큼 건너 뛸수 있는 장소
                        while(true){
                        if(stones[i] == 0){
                            i++;
                            continue;
                        }else{
                            stones[i]-=1;
                            break;
                        }
                    }
                }else{

                        for(int j=0; j < (stones_num-i )  ; j++){
                            if(stones[i] == 0){
                                i++;
                                continue;
                            }else{
                                stones[i]-=1;
                                break;
                            }

                        }
                    if(i == (stones_num-1)){

                         answer+=1;
                         break;
                    }

                }

            }



        }
         return answer;
    }
}
