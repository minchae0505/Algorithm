#include <stdio.h>

int main()
{
    int arr[1000];
    int times;
    int num;
    int answer=0;
    
    scanf("%d", &times);
    
    for(int i=0; i<times; i++){
        scanf("%d ", &arr[i]);
    }
    
    scanf("%d", &num);
    
    for(int i=0; i<times; i++){
        if(arr[i] == num){
            answer++;
        }
    }
    
    
    printf("%d", answer);
    
    return 0;
}