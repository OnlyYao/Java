package designpatterns.factory.method;

public class ExportFinancialPdfFile implements ExportFile {

	@Override
	public void export() {
		System.out.println("��������ר�õ�PDF�ļ�");
	}
}
