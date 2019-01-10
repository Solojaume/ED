using Gtk;
using System;
using System.Collections.Generic;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
        int cont = 0;
        int numeroAleatorio = 0;
        int[] numeros = new int[90];
        List<Button> buttons = new List<Button>();
        int n = 1;
        for (int row = 0; row < 9; row++)
            for (int column = 0; column < 10; column++)
            {
                Button button = new Button();
                button.Label = n.ToString();
                table.Attach(button, (uint)column, (uint)column + 1, (uint)row, (uint)row + 1);
                buttons.Add(button);
                n++;
            }
        table.ShowAll();
        Random random = new Random();
        buttonAdelante.Clicked += delegate
        {
            if(cont==90)
                for (int i = 0; i < numeros.Length; i++)
                {
                    buttons[i].ModifyBg(StateType.Normal, new Gdk.Color(255, 255, 255));
                    numeros[i] = 0;
                    cont = 0;
                }
            Boolean sinSalir = false;
                do
                {
                numeroAleatorio = random.Next(90) + 1;
                if (Array.IndexOf(numeros, numeroAleatorio) == -1)
                {
                    sinSalir = true;
                    numeros[cont] = numeroAleatorio;

                }

            } while (sinSalir == false);

            labelNumero.Text = numeroAleatorio.ToString();
            buttons[numeroAleatorio - 1].ModifyBg(StateType.Normal, new Gdk.Color(0, 255, 0));
            cont++;

        };
        buttonBingo.Clicked += delegate{
            for (int i = 0; i < numeros.Length; i++)
            {
                buttons[i].ModifyBg(StateType.Normal, new Gdk.Color(255, 255, 255));
                numeros[i] = 0;
                cont = 0;
            }
        };
    }
    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }
}