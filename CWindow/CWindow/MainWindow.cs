using System;
using Gtk;
using CWindow;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
        Title = "CBingo";
        //MessageDialog
        //MessageDialog messageDialog = new MessageDialog(
        //    this, 
        //    DialogFlags.Modal, 
        //    MessageType.Info,
        //    ButtonsType.Ok, 
        //    "Se ha cantado Bingo  \n",
        //"Pulse a Ok¡para resetear");
        //ResponseType response = (ResponseType)messageDialog.Run();
        //messageDialog.Destroy();
        //if (response == ResponseType.Yes)
        //Console.WriteLine("Ha dicho siiiiii");  

        //otra forma es creando un venta nueva
        button.Clicked += delegate
        {
            new MyWindow(;
        };
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }
}
