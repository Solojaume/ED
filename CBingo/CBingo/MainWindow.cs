using Gtk;
using System;
using System.Collections.Generic;

using CBingo;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
        Panel panel = new Panel(vBox);
        Bombo bombo = new Bombo();
        buttonAdelante.Clicked += delegate
        {
            int num = bombo.SacarBola();
            panel.Marcar(num);
            buttonAdelante.Sensitive = bombo.quedanBolas();
            //if (!bombo.quedanBolas())
               // buttonAdelante.Sensitive = false;
        };

       
    }
    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }
}