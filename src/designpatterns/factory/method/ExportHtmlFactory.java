package designpatterns.factory.method;

public class ExportHtmlFactory implements Exportfactory {

	//������ʵ���������Ƶ����������
	@Override
	public ExportFile factory(String type) {
		if (type.equals("standard")) {
			return new ExportStandardHtmlFile();
		} else if (type.equals("financial")) {
			return new ExportFinancialHtmlFile();
		} else {
			throw new RuntimeException("δ���ִ����͵�HTML�ṹ");
		}
	}
}
