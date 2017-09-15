package designpatterns.factory.method;

public class ExportFinancialPdfFile implements ExportFile {

	@Override
	public void export() {
		System.out.println("导出财务专用的PDF文件");
	}
}
