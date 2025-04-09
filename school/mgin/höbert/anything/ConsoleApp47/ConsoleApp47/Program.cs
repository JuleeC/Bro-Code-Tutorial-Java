using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp47
{
    internal class Programm
    {
        static void Main(string[] args)
        {

            Circle c1 = new Circle();
            c1.XCoordinate = 2.3;
            c1.YCoordinate = 3.4;
            c1.Radius = 5;
            c1.PrintData();

            c1.Move(6, 8.4);
            c1.PrintData();
            Console.WriteLine(c1.GetCircumference() );
            Console.WriteLine(c1.Innere(2));


            //static ist für Klassen und ned Objekte
            Console.WriteLine( Circle.GetPi());
        }
        
    }
}
