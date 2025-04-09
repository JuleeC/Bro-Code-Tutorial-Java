using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp23
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Hallo();
           Hallo();
            Hallo();
            Methode1();
            Triple(4);
        }
        
        static  void Hallo() {
            
            Console.WriteLine("Hallo");
        } 
        
        static void Methode1() {
            string str = Console.ReadLine();
            Console.WriteLine("Hallo " + str + " wie gehts");
                }

        static void Triple(int para)
        {
            Console.WriteLine(para*3);
        }
    }
}
