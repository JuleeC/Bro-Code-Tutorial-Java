#include <stdio.h>

int n = 8;
int sum() {
    int erg = 0;
    for (int i = 1; i <= n; i++)
    {
         erg = erg + i;
        
    }
    printf("%d\n", erg);
    return erg;
   
}

void mittel() {
    double erg = 0;
    erg = (double)sum() / (double)n;
    printf("%f\n", erg);
    
}

int main()
{
   // sum(n);
    mittel();
}
