using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace aufgabe5_3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Punkt punkt = new Punkt();
            Console.WriteLine(punkt.GetX);
            Console.WriteLine(punkt.GetY);
            punkt.SetX = 10;
            punkt.SetY= 20;
        }
    }
    class Punkt
    {

        private int x=75;
        private int y=40;

        public int GetY
        {
            get { return y;}
           
        }
        
        public int SetY {
            set
            {
                if (y < 100 && y > -100)
                {
                    y = value;
                }
                else
                {
                    Console.WriteLine("Wert nicht im Koordinatensystem");
                }
            }
        }

        public int GetX
        {
            get { return x; }
           
        }

        public int SetX {

            set
            {
                if (x < 100 && x > -100)
                {
                    x = value;
                }
                else
                {
                    Console.WriteLine("Wert nicht im Koordinatensystem");
                }
            }
        }








     }
}
