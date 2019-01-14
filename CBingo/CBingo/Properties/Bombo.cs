using System;
using System.Collections.Generic;
namespace CBingo
{
    public class Bombo
    {
        private IList<int> bolas = new List<int>();

        public Bombo()
        {
            for (int bola= 1; bola <= 90; bola++)
            {
                bolas.Add(bola);
            }

        }
        public int SacarBola(){
            Random random = new Random();
            int indexAleatorio = random.Next(bolas.Count);
            int bola = bolas[indexAleatorio];
            bolas.RemoveAt(indexAleatorio);
            return bola;
        }
        public bool quedanBolas(){
            return bolas.Count > 0;
        }
        public void resetBombo(){
            for (int bola = 1; bola <= 90; bola++)
            {
                bolas.Add(bola);
            }
        }
    }
}
