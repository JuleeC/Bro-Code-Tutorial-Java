using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp8
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // 1, 2, 12...Winter3, 4, 5...Frühling6, 7, 8...Sommer9, 10, 11...Herbst
           double d = Convert.ToInt16(Console.ReadLine());
            double m = Convert.ToInt16(Console.ReadLine());
            double e = Convert.ToInt16(Console.ReadLine());

            if (d <= 2 && e <= 2 && m <= 2) {
                Console.WriteLine("ausgezeichnet");
            }
            
            Console.WriteLine("Schnitt" + (d+e+m)/3);
           

        }
    }
}
