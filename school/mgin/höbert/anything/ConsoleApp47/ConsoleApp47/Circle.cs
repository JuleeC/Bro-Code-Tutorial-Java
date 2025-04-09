using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp47
{
    internal class Circle
    {

        public double XCoordinate;
        public double YCoordinate;
        public int Radius;

        //methode ohne rw und ohne para

        public void PrintData()
        {
            Console.WriteLine(XCoordinate + "----" + YCoordinate + "----" + Radius);

        }

        //Methode ohne rw mit para
        public void Move(double dx, double dy)
        {
            XCoordinate += dx;
            YCoordinate += dy;

        }

        //methode mir rw ohne para
        public double GetCircumference()
        {

            return (Radius * 2 * Math.PI);
        }

        //methode mit rw und para
        public double Innere(int innererradius)
        {
            if (innererradius < Radius)
            {
                //Flächen ausrechnen
                double AreaCircle = Radius * Radius * Math.PI;
                double InnerCircle = Math.Pow(innererradius, 2) * Math.PI;
                return AreaCircle - InnerCircle;

            }else
                return 0;
                
        }

        //statische Methode
        static public double GetPi()
        {
            return 3.1415;

        }

    }
}