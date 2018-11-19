using System;

namespace CSuma
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            //Console.WriteLine("Primer número: ");
            decimal primerNumero = readDecimal("Primer numero :");
            decimal segundoNumero = readDecimal("Segundo numero :");
            //string stringPrimerNumero = Console.ReadLine();
            //decimal primerNumero = decimal.Parse(stringPrimerNumero);
            //Console.Write("Segundo número: ");
            //string stringSegundoNumero = Console.ReadLine();
            //decimal segundoNumero = decimal.Parse(stringSegundoNumero);
            decimal suma = primerNumero + segundoNumero;
            Console.WriteLine("La suma es: "+suma);
        }
        private static decimal readDecimal(string label){
            Console.Write(label);
            string stringDecimal = Console.ReadLine();
            return decimal.Parse(stringDecimal);
        }

    }
}
