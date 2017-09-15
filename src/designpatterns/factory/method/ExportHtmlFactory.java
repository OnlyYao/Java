package designpatterns.factory.method;

public class ExportHtmlFactory implements Exportfactory {

	//将创建实例的任务推到子类中完成
	@Override
	public ExportFile factory(String type) {
		if (type.equals("standard")) {
			return new ExportStandardHtmlFile();
		} else if (type.equals("financial")) {
			return new ExportFinancialHtmlFile();
		} else {
			throw new RuntimeException("未发现此类型的HTML结构");
		}
	}
}
