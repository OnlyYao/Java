package designpatterns.factory.method;

public class FactoryTest {

	public static void main(String[] args) {
		
		Exportfactory htmlFactory = new ExportHtmlFactory();
		ExportFile html = htmlFactory.factory("financial");
		html.export();
	}
}
