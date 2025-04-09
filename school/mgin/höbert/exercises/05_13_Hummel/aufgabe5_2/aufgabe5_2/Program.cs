using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace aufgabe5_2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Rechteck rechteck= new Rechteck();
            rechteck.Flaeche();
            Console.WriteLine(rechteck.Flaeche_RW());
            Console.WriteLine(rechteck.X_Flaeche(5));

        }
    }
    class Rechteck
    {

        public double Laenge=2;
        public double Breite=2;

        public void Flaeche()
        {

            Console.WriteLine(Laenge * Breite); 
        }

        public double Flaeche_RW()
        {

            return Breite*Laenge;
        }

        public double X_Flaeche(double x_fach)
        {


            return (Laenge * Breite) * x_fach;
        }


    }
}
