package designpatterns.factory.method;

public class ExportFinancialHtmlFile implements ExportFile {

	@Override
	public void export() {
		System.out.println("导出财务专用的HTML文件");
	}
}
