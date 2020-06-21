class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int b_l = board.length; // 뽑기 상자 길이
        int m_l = moves.length; // 뽑기 순서 길이

        int b_n=0;  // 뽑기 상자 크기
        int m_n = 0; //뽑기 순서의 개수

        int []ar = new int[900];
        int ar_n = 0;

        while(m_n < m_l){
            if(board[b_n][moves[m_n]-1] !=  0){ //뽑은 장소가 0이 아니면
                ar[ar_n] = board[b_n][moves[m_n]-1]; // 바구니에 그 값을 넣음
                board[b_n][moves[m_n]-1] = 0;
                if(ar_n == 0){ //바구니가 비어있었을 경우는 패스하고 바구니에 1개가 쌓인거 표시
                    ar_n++;
                }else if(ar[ar_n] == ar[ar_n-1]) { //
                    answer+=2;
                    ar[ar_n]=0;
                    ar[ar_n-1]=0;
                    ar_n--;
                }else if(ar[ar_n] != ar[ar_n-1]){

                ar_n++;
                }
                m_n++;
                b_n = 0;
            }else{ // 뽑은 장소가 0이면

                if(b_n == b_l-1){
                    b_n=0;
                    m_n++;
                }
                b_n++;
            }
        }

        return answer;
    }
}
