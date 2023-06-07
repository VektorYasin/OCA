package q051;

interface Exportable{
	//interface'teki medotların normalde access modifier public tir.
	  void export();//public
}
class Tool implements Exportable{
	// public yerinde protected var normalde;
	// implement yapan metotlar da public olmalı
	public void export() {		// line n1
		//attempting to assign weaker access privileges ('protected'); was 'public'
	    	System.out.println("Tool::export");
	}
}
 class ReportTool extends Tool implements Exportable {
	public void export() {			// line n2
		System.out.println("RTool::export");
	}

	public static void main(String[] args) {
		Tool aTool = new ReportTool();
		Tool bTool = new Tool();

		callExport(aTool);
		callExport(bTool);
	}

	public static void callExport(Exportable ex) {
		ex.export();
	}
}
//What is the result?
//D.	Compilation fails only at line n1.

