package designpatterns.factory.method;

public class ExportStandardHtmlFile implements ExportFile {

	@Override
	public void export() {
		System.out.println("导出标准的HTML文件");
	}
}
