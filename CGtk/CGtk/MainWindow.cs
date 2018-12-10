using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
        Button button = new Button(Stock.Close);
        button.Visible = true;
        vBox.Add(button); 
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

    protected void OnButtonAceptarClicked(object sender, EventArgs e)
    {
        string nombre = entryNombre.Text;
        labelSaludo.Text = "Hola " + nombre + " son: "+ DateTime.Now ;
        Console.WriteLine("Click en buttonAceptar con nombre=" + nombre);

    }
}
