using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp13
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int x = Convert.ToInt32(Console.ReadLine());
            int z = 0;
            for (int i = 0; i <= x; i = i +2  )
            {
                Console.WriteLine(i);
            }
        }
    }
}
