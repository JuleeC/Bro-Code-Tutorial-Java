using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp32
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int grün, blau, weiß, rot;


            for (int i = 0; i < 4; i++)
            {
                if (i == 1)
                    Console.WriteLine("grün");

                if (i == 2)
                    Console.WriteLine("blau");

                if (i == 3)
                    Console.WriteLine("weiß");

                if (i == 4)
                    Console.WriteLine("rot");

                for (int k = 0; k < 4; k++)
                {
                  ;
                    if (k == 1)
                        Console.Write("grün");

                    if (k == 2)
                        Console.Write("blau");

                    if (k == 3)
                        Console.Write("weiß");

                    if (k == 4)
                        Console.Write("rot");

                    for (int x = 0; x < 4; x++)
                    {
                        Console.Write("");
                        if (x == 1)
                        Console.Write("grün");

                        if (x == 2)
                            Console.Write("blau");

                        if (x == 3)
                            Console.Write("weiß");

                        if (x == 4)
                            Console.Write("rot");

                        

                        

           
                    }
                }
            }
        }
    }
}
