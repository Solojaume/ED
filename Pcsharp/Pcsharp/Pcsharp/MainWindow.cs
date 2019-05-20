using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    private object e;
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
        treeView.AppendColumn("Nombre", new CellRendererText(), "text", 0);
        treeView.AppendColumn("Telefono", new CellRendererText(), "text", 1);
        ListStore listStore = new ListStore(typeof(String), typeof(String));
        treeView.Model = listStore;
        listStore.AppendValues("Rosa", "888");
        listStore.AppendValues("Manolo", "687");

        editAction.Sensitive = false;

        newAction.Activated += (sender, e) =>
        {
            vboxContacto.Visible = true;
            treeView.Sensitive = false;

        };

        editAction.Activated += (sender, e) =>
        {
            vboxContacto.Visible = true;
            treeView.Sensitive = false;
            treeView.Selection.GetSelected(out TreeIter treeIter);
            string nombre = (string)treeView.Model.GetValue(treeIter, 0);
            string telefono = (string)treeView.Model.GetValue(treeIter, 1);
            //Console.WriteLine("Nombre={0} Teléfono={1}", nombre, telefono);
            entry1.Text = nombre;
            entry2.Text = telefono;

        };

        buttonAceptar.Clicked += (sender, e) => currentAction(;
        buttonCancelar.Clicked += (sender, e) => { 
        };

    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }
}
