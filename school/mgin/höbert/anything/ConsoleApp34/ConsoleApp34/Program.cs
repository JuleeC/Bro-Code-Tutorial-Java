using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp34
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int anzahl = 0;
            for (int a = 1; a <= 40; a++)
            {

                for (int b = a +1 ; b <= 41; b++)
                {

                    for (int c = b +1; c <= 42; c++)
                    {
                        for (int d = c +1; d <= 43; d++)
                        {

                            for (int e = d +1; e <= 44; e++)
                            {

                                for (int f = e +1; f <= 45; f++)
                                {
                                    if (anzahl < 20)
                                    {
                                        Console.WriteLine("{0,6} {1,6} {2,6} {3,6} {4,6} {5,6} ", a, b, c, d ,e ,f);
                                    }
                                    if (anzahl > 8145060 - 20)
                                    {
                                        Console.WriteLine("{0,6} {1,6} {2,6} {3,6} {4,6} {5,6} ", a, b, c, d, e, f);
                                    }
                                    
                                    anzahl++;
                                }
                            }
                        }


                    }
                }
            }
            Console.WriteLine("Anzahl : " +anzahl);
        }
    }
}
