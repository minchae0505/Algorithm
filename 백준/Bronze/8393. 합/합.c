#include <stdio.h>

int main()
{
    int a, i, j=0;
    
    scanf("%d\n", &a);
    
    for(i=1; i <= a; i++){
        j+=i;
    }
    
    printf("%d", j);
    
    return 0;
}