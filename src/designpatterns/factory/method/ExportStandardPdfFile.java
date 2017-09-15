package designpatterns.factory.method;

public class ExportStandardPdfFile implements ExportFile {

	@Override
	public void export() {
		System.out.println("导出标准的PDF文件");
	}
}
