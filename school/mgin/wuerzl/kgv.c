#include <stdio.h>
int kgv_berechnung(int x,int y){
    while (x !=y)
    {
        printf("dsad");
        if (x < y)
        {
            x *= 2; 
            printf("%d",x);
        }
         else if (y < x)
        {
            y *= 2;
            printf("%d",y);
        } 
              
    }
    
    return x;
}


int main() {
    printf("dsads");
    int x = 4;
    int y = 3;
    int z = kgv_berechnung(x,y);
    printf("%d",z);
    
}

