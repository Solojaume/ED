
// This file has been generated by the GUI designer. Do not modify.

public partial class MainWindow
{
	private global::Gtk.VBox vbox1;

	private global::Gtk.HBox hbox1;

	private global::Gtk.Button buttonBingo;

	private global::Gtk.Label labelNumero;

	private global::Gtk.Button buttonAdelante;

	private global::Gtk.Table table;

	protected virtual void Build()
	{
		global::Stetic.Gui.Initialize(this);
		// Widget MainWindow
		this.Name = "MainWindow";
		this.Title = global::Mono.Unix.Catalog.GetString("MainWindow");
		this.WindowPosition = ((global::Gtk.WindowPosition)(4));
		// Container child MainWindow.Gtk.Container+ContainerChild
		this.vbox1 = new global::Gtk.VBox();
		this.vbox1.Name = "vbox1";
		this.vbox1.Spacing = 6;
		// Container child vbox1.Gtk.Box+BoxChild
		this.hbox1 = new global::Gtk.HBox();
		this.hbox1.Name = "hbox1";
		this.hbox1.Spacing = 6;
		// Container child hbox1.Gtk.Box+BoxChild
		this.buttonBingo = new global::Gtk.Button();
		this.buttonBingo.CanFocus = true;
		this.buttonBingo.Name = "buttonBingo";
		this.buttonBingo.UseUnderline = true;
		this.buttonBingo.Label = global::Mono.Unix.Catalog.GetString("Bingo");
		this.hbox1.Add(this.buttonBingo);
		global::Gtk.Box.BoxChild w1 = ((global::Gtk.Box.BoxChild)(this.hbox1[this.buttonBingo]));
		w1.Position = 0;
		w1.Fill = false;
		// Container child hbox1.Gtk.Box+BoxChild
		this.labelNumero = new global::Gtk.Label();
		this.labelNumero.Name = "labelNumero";
		this.hbox1.Add(this.labelNumero);
		global::Gtk.Box.BoxChild w2 = ((global::Gtk.Box.BoxChild)(this.hbox1[this.labelNumero]));
		w2.Position = 1;
		// Container child hbox1.Gtk.Box+BoxChild
		this.buttonAdelante = new global::Gtk.Button();
		this.buttonAdelante.CanFocus = true;
		this.buttonAdelante.Name = "buttonAdelante";
		this.buttonAdelante.UseStock = true;
		this.buttonAdelante.UseUnderline = true;
		this.buttonAdelante.Label = "gtk-go-forward";
		this.hbox1.Add(this.buttonAdelante);
		global::Gtk.Box.BoxChild w3 = ((global::Gtk.Box.BoxChild)(this.hbox1[this.buttonAdelante]));
		w3.Position = 2;
		w3.Fill = false;
		this.vbox1.Add(this.hbox1);
		global::Gtk.Box.BoxChild w4 = ((global::Gtk.Box.BoxChild)(this.vbox1[this.hbox1]));
		w4.Position = 0;
		w4.Expand = false;
		w4.Fill = false;
		// Container child vbox1.Gtk.Box+BoxChild
		this.table = new global::Gtk.Table(((uint)(9)), ((uint)(10)), true);
		this.table.Name = "table";
		this.table.RowSpacing = ((uint)(1));
		this.table.ColumnSpacing = ((uint)(2));
		this.vbox1.Add(this.table);
		global::Gtk.Box.BoxChild w5 = ((global::Gtk.Box.BoxChild)(this.vbox1[this.table]));
		w5.Position = 1;
		this.Add(this.vbox1);
		if ((this.Child != null))
		{
			this.Child.ShowAll();
		}
		this.DefaultWidth = 400;
		this.DefaultHeight = 300;
		this.Show();
		this.DeleteEvent += new global::Gtk.DeleteEventHandler(this.OnDeleteEvent);
	}
}
