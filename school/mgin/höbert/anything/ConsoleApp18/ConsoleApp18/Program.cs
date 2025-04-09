using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp18
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double s = 0;
            int y = 1;
            int x = 0;

            do
            {

                 x = Convert.ToInt32(Console.ReadLine());
                if (x > 0)
                {
                    s = (s + x) / y;
                    y++;
                }
            } while (x < 10);

    {

            }
            Console.WriteLine(s);
        }
    }
}
