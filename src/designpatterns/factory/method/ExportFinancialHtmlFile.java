package designpatterns.factory.method;

public class ExportFinancialHtmlFile implements ExportFile {

	@Override
	public void export() {
		System.out.println("��������ר�õ�HTML�ļ�");
	}
}
