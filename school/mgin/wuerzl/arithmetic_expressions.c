// https://www.w3schools.com/c/c_ref_stdio.php


#include <stdio.h>
// arithmetische Operatoren: +,-,*,/,%,++,--
// relationale Operatoren: ==, !=, <, >, <=, >=
// logische Operatoren: &&, ||
// bitweise Operatoren: &, |, <<, >>, ~


int leftshift(int zahl, int stellen)
{
    return (zahl << stellen);
}


int fak(int n)
{


    int erg = 1;


    for (int x = 1; x <= n; x++)
    {
        erg = erg * x;
    }


    return erg;
}


int main()
{
    printf("Hallo liebe 3BHBG\n");


    int x = 17;
    int y = 27;


    // 27 = 11011
    // 17 = 10001
    // erg= 10001
    int erg = x & y;
    printf("%d AND %d = %d\n",x,y,erg);


    // 27 = 11011
    // 17 = 10001
    // erg= 11011  
    erg = x | y;
    printf("%d OR %d = %d\n",x,y,erg);


    // 11011 << 3
    // leftshift
    // 11011000 = 27 * 2^3
    erg = y << 3;
    printf("%d << 3 = %d\n",y,erg);


    // 11011 >> 3
    // rightshift
    // 00011(011) = 27 / 2^3
    // 10101 >> 3
    // 00010(101)


    erg = y >> 3;
    printf("%d >> 3 = %d\n",y,erg);


    // 11011 = 00100
    erg = ~y;
    printf("~%d = %d\n",y,erg);


    printf("%d\n",leftshift(47,2));
     // oder
    erg = leftshift(47,2);
    printf("%d\n",erg);
}