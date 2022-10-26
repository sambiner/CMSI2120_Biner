public class JosephusProblem{
    
    CircularList josephus;

    JosephusProblem(){
        super();
    }

    public int problem(int size, int period){
        period--;

        int circle[] = new int[size];
        for (int i=0; i < size; i++){
            circle[i] = 1;  
        }

        int count = 0, die = 0, num = 1;
        while(count < (size-1)){ 
            while(num <= period){
                die++; //increase cut
                die %= size; 
                if (circle[die] == 1){ 
                    num++; 
                }
            }
            num = 1;
            circle[die] = 0;
            count++; //one more person down
            die++; 
            die %= size;

            while (circle[die] == 0){
                die++;
                die %= size;
            }
        }
        return die + 1; //returning the position of the last standing index of the array
    }

}