package designpatterns.factory.method;

public class ExportPdfFactory implements Exportfactory{

	//������ʵ���������Ƶ����������
	@Override
	public ExportFile factory(String type) {
		if (type.equals("standard")) {
			return new ExportStandardPdfFile();
		} else if (type.equals("financial")) {
			return new ExportFinancialPdfFile();
		} else {
			throw new RuntimeException("δ���ִ����͵�PDF�ļ�");
		}
	}
}
