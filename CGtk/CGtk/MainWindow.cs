using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

    protected void OnButtonAceptarClicked(object sender, EventArgs e)
    {
        string nombre = entryNombre.Text;
        labelSaludo.Text = "Hola " + nombre;
        Console.WriteLine("Click en buttonAceptar con nombre=" + nombre);

    }
}
